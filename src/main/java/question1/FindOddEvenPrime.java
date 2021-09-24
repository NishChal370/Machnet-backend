package question1;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.IntStream;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class FindOddEvenPrime {

    public static void main(String[] args){

        List<Integer> numbersList = IntStream.rangeClosed(1, 50)
                                            .boxed()
                                            .collect(Collectors.toList());

        List<Integer> oddNumbersList = new ArrayList<>();
        List<Integer> evenNumberList = new ArrayList<>();
        List<Integer> primeNumberList = new ArrayList<>();

        Consumer< List<Integer> > findOdd =list->{
            list.stream()
                    .filter(value ->value %2 !=0)
                    .forEach(oddNumbersList::add);
        };

        Consumer< List<Integer> > findEven =list->{
            list.stream()
                    .filter(value ->value %2 ==0)
                    .forEach(evenNumberList::add);
        };

        Consumer< List<Integer> > findPrime = list->{
            list.stream()
                    .filter(e->IntStream.range(2,e).noneMatch(v-> e % v == 0 ))
                    .filter(e-> e!= 1)
                    .forEach(primeNumberList::add);
        };

        Consumer< List<Integer> > displayList = System.out::println;

        findOdd.accept(numbersList);
        findEven.accept(numbersList);
        findPrime.accept(numbersList);

        System.out.println("Number list: "+numbersList);

        System.out.print("Odd number: ");
        displayList.accept(oddNumbersList);

        System.out.print("Even number: ");
        displayList.accept(evenNumberList);

        System.out.print("Prime number: ");
        displayList.accept(primeNumberList);

    }
}
