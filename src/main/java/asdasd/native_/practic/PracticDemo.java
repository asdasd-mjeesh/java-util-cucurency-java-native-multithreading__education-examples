package asdasd.native_.practic;

import java.util.LinkedList;
import java.util.Queue;

public class PracticDemo {

    public static void main(String[] args) throws InterruptedException {
        new PracticDemo().run();
    }

    private void run() throws InterruptedException {
        Queue<Integer> queue = new LinkedList<>();

        Thread producerThread = new Thread(new ProducerThread(queue));
        Thread consumerThread = new Thread(new ConsumerThread(queue));

        producerThread.start();
        consumerThread.start();

        producerThread.join();
        consumerThread.join();
    }
}
