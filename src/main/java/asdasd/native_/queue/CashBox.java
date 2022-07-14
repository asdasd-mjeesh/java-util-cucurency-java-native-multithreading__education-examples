package asdasd.native_.queue;

public class CashBox {

    private static int generator = 1;
    private final int id;

    public CashBox() {
        this.id = generator++;
    }

    @Override
    public String toString() {
        return "CashBox{" +
               "id=" + id +
               '}';
    }
}
