package asdasd.native_.counter;

public class CounterDemo {

    public static void main(String[] args) {
        new CounterDemo().run();
    }

    private void run() {
        Counter counter = new Counter();
        Thread thread1 = new Thread(new CounterThread(counter));
        Thread thread2 = new Thread(new CounterThread(counter));
        Thread thread3 = new Thread(new CounterThread(counter));
        Thread thread4 = new Thread(new CounterThread(counter));
        Thread thread5 = new Thread(new CounterThread(counter));
        Thread thread6 = new Thread(new CounterThread(counter));
        Thread thread7 = new Thread(new CounterThread(counter));
        Thread thread8 = new Thread(new CounterThread(counter));
        Thread thread9 = new Thread(new CounterThread(counter));

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
            thread5.join();
            thread6.join();
            thread7.join();
            thread8.join();
            thread9.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(counter.getCount());
    }
}
