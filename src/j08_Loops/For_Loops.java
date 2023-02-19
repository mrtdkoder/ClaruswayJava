package j08_Loops;

import java.util.Scanner;

public class For_Loops {
    public static void main(String[] args) {
       // Integer count = new Integer();

        for (int i = 11; i < 100; i+=2) {
            System.out.println(i);
        }

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: "); int num = scan.nextInt();

        for (int i = num; i <= 100; i++) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }
    }
}
