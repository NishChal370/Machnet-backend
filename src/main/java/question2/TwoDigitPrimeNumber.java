package question2;

import java.util.stream.IntStream;
import java.util.function.Supplier;

public class TwoDigitPrimeNumber {

    public static void main(String[] args) {
        Supplier<Integer> randomTwoDigitPrime = ()->{
            int twoDigitPrime = 0;
            while (true){
                int randomNumber = (int)(Math.random() * ((100 - 10) + 1)) + 10;
                if(IntStream.range(2,randomNumber).noneMatch(v-> randomNumber % v == 0 )){
                    twoDigitPrime = randomNumber;

                    break;
                }
            }

            return twoDigitPrime;
        };

        System.out.println("Two digit random prime numbers: "+randomTwoDigitPrime.get());
    }
}