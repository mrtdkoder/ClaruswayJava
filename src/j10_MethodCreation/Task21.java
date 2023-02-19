package j10_MethodCreation;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        /*
        task-> girilen bir tamsayının basamak sayısını print eden METHOD create ediniz.
        */
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: "); int sayi1 = input.nextInt();

        System.out.println(sayi1 + " " + basamakSayisi(sayi1) + " basamakli bir sayidir");
    }

    private static int basamakSayisi(int sayi) {
        int i =0;
        while (sayi > 0) {
            sayi /= 10;
            i++;
        }
        return i;
    }
}
