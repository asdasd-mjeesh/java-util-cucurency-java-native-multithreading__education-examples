package asdasd.native_.practic;

import java.util.Queue;

public class ProducerThread implements Runnable {

    private final Queue<Integer> list;

    public ProducerThread(Queue<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        synchronized (list) {
            while (true) {
                if (list.size() < 10) {
                    int random = RandomUtil.getRandom();
                    list.add(random);
                    System.out.println("Producer adds value: " + random + ". size: " +list.size());
                } else {
                    System.out.println("Producer does nothing");
                }
                list.notifyAll();

                try {
                    int randomWait = RandomUtil.getRandom(5);
                    System.out.println("Producer waits: " + randomWait);
                    list.wait(randomWait);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
