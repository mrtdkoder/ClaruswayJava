package j10_MethodCreation;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {

       /* task-> girilen üç tamsaynın
        bir dik üçgenin kenar uzunlukları olamsını kontrol eden METHOD create ediniz.
        (Trick->: a b c kenarları için  a2+b2=c2 pisagor  şartı sağlanmalı)

        birinci kenarı giriniz: 3
        ikinci kenarı giriniz 4
        üçüncü kenarı giriniz: 5
         dik üçgendir
        birinci kenarı giriniz: 2
        ikinci kenarı giriniz 15
        üçüncü kenarı giriniz: 7
        dik üçgen değildir.*/

        Scanner input = new Scanner(System.in);
        System.out.print("Birinci kenarı giriniz: "); int k1 = input.nextInt();
        System.out.print("ikinci  kenarı giriniz: "); int k2 = input.nextInt();
        System.out.print("ucuncu  kenarı giriniz: "); int k3 = input.nextInt();

        System.out.println("Bu bir dik ucgen" + (isDikUcgen(k1, k2, k3) ? "dir" : " değildir"));
    }

    private static boolean isDikUcgen(int k1, int k2, int k3) {
        return ((k1*k1) + (k2*k2)) == k3*k3;
    }
}
