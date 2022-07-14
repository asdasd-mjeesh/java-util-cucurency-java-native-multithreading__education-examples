package asdasd.native_.account;

public class Account {

    private static int generator = 1;
    private int id;
    private int money;

    public Account(int money) {
        this.money = money;
        id = generator++;
    }

    public void add(int money) {
        this.money += money;
    }

    public boolean takeOf(int money) {
        if (this.money >= money) {
            this.money -= money;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Account{" +
               "id=" + id +
               ", money=" + money +
               '}';
    }
}
