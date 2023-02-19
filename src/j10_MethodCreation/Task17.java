package j10_MethodCreation;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        /*
            Task-> girilen bir tamsayıyı  tersinden print eden METHOD create ediniz
            input:1453
            output:3541

         */
        Scanner input = new Scanner(System.in);
        System.out.print("bir sayı giriniz: "); int sayi = input.nextInt();

        System.out.println("sayinin tersi = " + reverseInt(sayi));
    }

    private static String reverseInt(int sayi) {
        String _tmp = sayi + "", reverse = "";

        for (int i = 0; i<_tmp.length(); i++) {
            reverse = _tmp.charAt(i) + reverse;
        }
        return reverse;
    }

}

