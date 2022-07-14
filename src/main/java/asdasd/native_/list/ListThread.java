package asdasd.native_.list;

import java.util.List;

public class ListThread implements Runnable {

    private final List<Integer> list;

    public ListThread(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 0; i < 400; i++) {
            synchronized (list) {
                list.add(i);
            }
        }
    }
}
