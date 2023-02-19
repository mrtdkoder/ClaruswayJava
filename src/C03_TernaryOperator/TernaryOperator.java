package C03_TernaryOperator;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("sayi :");
        int age = input.nextInt();
        System.out.println("age = " + ((age>=18) ? "ehliyet alma sansiniz var" : "baska pozisyonlar icin tiklayin"));
    }
}
