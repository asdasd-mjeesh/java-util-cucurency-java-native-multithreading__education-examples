package asdasd.native_.security_object;

import java.util.ArrayList;
import java.util.List;

public class ExampleRunner {

    public static void main(String[] args) {
        new ExampleRunner().run();
    }

    private void run() {
        Example example = new Example(new ArrayList<>());
        List<Integer> list = example.getList();
        list.add(2);

        System.out.println(example.getList());
    }
}
