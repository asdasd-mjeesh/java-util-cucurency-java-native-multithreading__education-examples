package asdasd.advanced.latch;

import java.util.concurrent.CountDownLatch;

public class Rocket implements Runnable {

    private final CountDownLatch countDownLatch;

    public Rocket(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        System.out.println("Ракета готвится к запуску");
        try {
            countDownLatch.await();
            System.out.println("Пуск");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
