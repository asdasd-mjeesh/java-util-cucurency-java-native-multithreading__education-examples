package asdasd.native_.introduction;

public class SimpleThread extends Thread {

    @Override
    public void run() {
        System.out.println("Hello " + getName());
    }
}
