package question4;
/*
*  Question4
* */
import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class PrimeNumber {
    public static Boolean isPrime(int value) {
        int count = 0;
        for (int i = 1; i <= value; i++) {
            if ((value % i) == 0) {
                count += 1;
            }
        }
        if (count == 2) {
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Integer [][] oddEvenArray= {{2,4,6,8,10},{1,3,5,7,9}};

        List<Integer> combinedList = Arrays.stream(oddEvenArray)
                .flatMap(Stream::of)
                .collect(Collectors.toList());

        System.out.println("Merging two lists into one: "+combinedList);

        List<Integer> primeNumberList= combinedList.stream()
                .filter(element-> isPrime(element)==true)
                .collect(Collectors.toList());

        System.out.println("\nPrime number from list: "+primeNumberList);
    }
}
