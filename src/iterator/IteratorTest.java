package iterator;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class IteratorTest {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3);
        Set<Integer> set = Set.of(1, 2, 3);

        iterate(list);
        iterate(set);
    }

    private static void iterate(Iterable<Integer> iterator) {
        System.out.println("---Iterating " + iterator.getClass().getSimpleName() + "---");
        for (int num : iterator) {
            System.out.println(num);
        }
    }
}
