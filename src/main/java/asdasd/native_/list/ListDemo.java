package asdasd.native_.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) throws InterruptedException {
        new ListDemo().run();
    }

    private void run() throws InterruptedException {
        List<Integer> integers = Collections.synchronizedList(new ArrayList<>());

        Thread thread1 = new Thread(new ListThread(integers));
        Thread thread2 = new Thread(new ListThread(integers));
        Thread thread3 = new Thread(new ListThread(integers));
        Thread thread4 = new Thread(new ListThread(integers));
        Thread thread5 = new Thread(new ListThread(integers));
        Thread thread6 = new Thread(new ListThread(integers));
        Thread thread7 = new Thread(new ListThread(integers));
        Thread thread8 = new Thread(new ListThread(integers));
        Thread thread9 = new Thread(new ListThread(integers));
        Thread thread10 = new Thread(new ListThread(integers));
        Thread thread11 = new Thread(new ListThread(integers));
        Thread thread12 = new Thread(new ListThread(integers));

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
        thread10.start();
        thread11.start();
        thread12.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
        thread5.join();
        thread6.join();
        thread7.join();
        thread8.join();
        thread9.join();
        thread10.join();
        thread11.join();
        thread12.join();

        System.out.println(integers);
        System.out.println(integers.size());
    }
}
