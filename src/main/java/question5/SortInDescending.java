package question5;

import java.util.List;
import java.util.Collections;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class SortInDescending {
    public static void main(String []args) {
        List<Object> numbersInDescending =  IntStream.range(1, 100)
                .boxed()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());

        System.out.println("Random integers of size 100 in descending order: \n"+numbersInDescending);
    }
}
