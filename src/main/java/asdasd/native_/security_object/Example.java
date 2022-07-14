package asdasd.native_.security_object;

import java.util.List;

public class Example {

    private final List<Integer> list;

    public Example(List<Integer> list) {
        this.list = list;
    }

    public synchronized List<Integer> getList() {
        return list;
    }
}
