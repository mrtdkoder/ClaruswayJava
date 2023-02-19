package j10_MethodCreation;

import java.util.Scanner;

public class Task22 {

    /* task->
      katsayıları a,b,c  verilen 1 bilinmeyenli ax^2 + bx + c denklemin köklerini print eden METHOD create ediniz.



      trick-> kokler : (-b +/- karekök(delta)) / (2*a)
        delta = b*b - 4*a*c
        delta > 0 => 2 tane kök vardır x1=(-b + kök(d)) / (2a)  , x2= (-b - kök(d)) / (2*a)
        delta = 0 => 1 tane kök vardır x = -b/2a
        delta < 0 ise kök yoktur.
   */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("a :"); int a = input.nextInt();
        System.out.print("b :"); int b = input.nextInt();
        System.out.print("c :"); int c = input.nextInt();

        kokleriGoster(a,b,c);
    }

    private static void kokleriGoster(int a, int b, int c) {
        int delta = deltaHesapla(a,b,c);
        if (delta>0) {
            System.out.printf("x1 = %d - x2 = %d", (-b + Math.sqrt(delta)) / (2 * a) , (-b - Math.sqrt(delta)) / (2 * a));
        } else if (delta==0) {
            System.out.println("1 tane kök vardır " + (-b/2*a));
        } else if (delta < 0) {
            System.out.println("kök yoktur");
        }
    }

    private static int deltaHesapla(int a, int b, int c) {
        return b*b - 4*a*c;
    }
}
