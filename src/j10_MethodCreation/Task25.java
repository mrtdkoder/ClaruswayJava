package j10_MethodCreation;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {

    //task-> girilen sayını faktoriyelini print eden METHOD create ediniz
    
        Scanner input = new Scanner(System.in);
        System.out.print("sayı giriniz: "); int sayi = input.nextInt();
        
        faktoriyelHesapla(sayi);
        
    }

    private static void faktoriyelHesapla(int sayi) {
        int faktoriyel = 1;
        for (int i = 1; i <= sayi; i++) {
            faktoriyel *= i;
            System.out.print( faktoriyel + " ");
        }
    }
}
