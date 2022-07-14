package asdasd.advanced.lock.account;

public class AccountThread implements Runnable {

    private final Account accountFrom;
    private final Account accountTo;

    public AccountThread(Account accountFrom, Account accountTo) {
        this.accountFrom = accountFrom;
        this.accountTo = accountTo;
    }

    private void lockAccounts() {
        while (true) {
            boolean fromLockResult = accountFrom.getLock().tryLock();
            boolean toLockResult = accountTo.getLock().tryLock();

            if (fromLockResult && toLockResult) {
                break;
            }
            if (fromLockResult) {
                accountFrom.getLock().unlock();
            }
            if (toLockResult) {
                accountTo.getLock().unlock();
            }
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 2000; i++) {
            lockAccounts();
            try {
                if (accountFrom.takeOf(10)) {
                    accountTo.add(10);
                }
            } finally {
                accountFrom.getLock().unlock();
                accountTo.getLock().unlock();
            }
        }
    }
}
