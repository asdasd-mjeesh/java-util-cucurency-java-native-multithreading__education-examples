package asdasd.advanced.queue;

import asdasd.native_.queue.CashBox;

import java.util.concurrent.BlockingQueue;

public class BuyerThread implements Runnable {

    private final BlockingQueue<CashBox> cashBoxes;

    public BuyerThread(BlockingQueue<CashBox> cashBoxes) {
        this.cashBoxes = cashBoxes;
    }

    @Override
    public void run() {
        try {
            CashBox cashBox = cashBoxes.take();
            System.out.println(Thread.currentThread().getName() + " обслужвается в кассе " + cashBox);
            Thread.sleep(5L);
            System.out.println(Thread.currentThread().getName() + " освобождает кассу  " + cashBox);
            cashBoxes.add(cashBox);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
