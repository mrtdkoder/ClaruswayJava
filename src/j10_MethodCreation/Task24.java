package j10_MethodCreation;

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
/*
       task-> girilen sayıya kadar olan Fibonacci dizisi elemalarını print eden METHOD create ediniz.
       Fibonacci dizisi :   1, 1, 2, 3, 5, 8, 13, 21, 34,
                            1, 2, 3, 4, 5,  6,  7,  8, 9, 10,
*/

        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci ust limiti :");int n = input.nextInt();

        FibonacciNumbers(n);

    }

    private static void FibonacciNumbers(int n) {
        int lastTotal = 0, firstNumber = 0, secondNumber = 1;
        while (lastTotal<=n) {
            lastTotal = firstNumber + secondNumber;
            System.out.print(lastTotal + " ");
            firstNumber  = secondNumber;
            secondNumber = lastTotal;
        }
    }
}
