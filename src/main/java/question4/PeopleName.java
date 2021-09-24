package question4;

import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PeopleName {

    public static void main(String[] args) {
        List<String> peopleList = Arrays.asList("Nischal", "ava", "amelia", "John", "jackey", "Arjun", "Ankit", "Santosh", "Jenny", "Axle", "Alexander");

        Predicate<String> startsWithA = e -> e.toLowerCase().startsWith("a") && e.length()<=5 ;

        List<String> peopleNameStartWithA = peopleList.stream()
                .filter(e -> startsWithA.test(e))
                .collect(Collectors.toList());

        System.out.println("Name that starts with “a” or “A” and contains length no more than 5: "+peopleNameStartWithA);
    }
}
