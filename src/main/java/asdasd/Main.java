package asdasd;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList(
                List.of(5,
                        2323,
                        1,
                        5,
                        76,
                        34324,
                        5645,
                        6543,
                        0)
        );

        for (int i = 0; i < integers.size() - 1; i++) {
            int temp = integers.get(i);
            if (temp < integers.get(i + 1)) {
                integers.set(i, integers.get(i + 1));
                integers.set(i + 1, temp);
            }
        }

        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }
}
