package j08_Loops;

import java.util.Scanner;

public class ForLoop02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("1 number:"); int num1 = input.nextInt();
        System.out.print("2 number:"); int num2 = input.nextInt();

//        if (num1 > num2) {
//            int tmp = num1;
//            num1 = num2;
//            num2 = tmp;
//        }

        for (int i = num1; i <= num2; i=((num1<num2)? ++i: --i)) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
