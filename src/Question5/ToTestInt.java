package Question5;

import java.util.Scanner;

/*
    Question number 5
 */

interface Test{
    int calculateSquare(int value);
}

class  Arithmetic implements Test{
    public int calculateSquare(int value){
        return (value*value);
    }
}

public class ToTestInt {
    public static void main (String []arg){
        System.out.print("Insert value to Calculate Square: ");
        Scanner myScanner = new Scanner(System.in);

        int value = myScanner.nextInt();
        Arithmetic  arithmeticObj = new  Arithmetic();

        System.out.println(
                "Square of "+value+" is "+arithmeticObj.calculateSquare(value)
        );
    }
}

