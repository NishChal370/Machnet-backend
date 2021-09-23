package question1;
/*
* Question 1
* */
import java.util.Arrays;
import java.util.stream.IntStream;

public class SumIntegerArray {
    public static void main(String[] args) {
        int[] numberArray = new int[50];

        IntStream.range(1, 51).forEach(i ->{
            numberArray[i-1] = i;
        });

        int total= Arrays.stream(numberArray).reduce(0,(acc,e)->acc+e);
        System.out.println("Sum integer array containing numbers from 1 - 50: "+total);
    }
}
