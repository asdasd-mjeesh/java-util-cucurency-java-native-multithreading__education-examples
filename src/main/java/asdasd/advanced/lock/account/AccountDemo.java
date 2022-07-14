package asdasd.advanced.lock.account;

public class AccountDemo {

    public static void main(String[] args) throws InterruptedException {
        new AccountDemo().run();
    }

    private void run() throws InterruptedException {
        Account account1 = new Account(20000);
        Account account2 = new Account(20000);

        Thread thread1 = new Thread(new AccountThread(account1, account2));
        Thread thread2 = new Thread(new AccountThread(account2, account1));

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(account1);
        System.out.println(account2);
    }
}
