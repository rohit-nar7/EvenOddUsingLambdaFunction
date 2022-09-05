import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        EvenOdd evenOdd = new EvenOdd();

        EvenOddProgram evenOd = num -> (num % 2) == 0;


        if (evenOd.isEvenOdd(57)) {
            System.out.println("Even");

        } else {
            System.out.println("Odd");
        }
    }
}
