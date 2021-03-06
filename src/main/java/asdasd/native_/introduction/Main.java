package asdasd.native_.introduction;

public class Main {

    public static void main(String[] args) {
        var simpleThread = new SimpleThread();
        var runnableThread = new Thread(new SimpleRunnable());
        var lambdaThread = new Thread( ()-> System.out.println("Hello from lambda " + Thread.currentThread().getName()));

        simpleThread.start();
        runnableThread.start();
        lambdaThread.start();
        try {
            simpleThread.join();
            runnableThread.join();
            lambdaThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
    }
}
