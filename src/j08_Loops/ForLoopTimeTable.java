package j08_Loops;

import java.util.Scanner;

public class ForLoopTimeTable {
    public static void main(String[] args) {
        /*
             task-> girilen boyutta kare çarpım tablosu print eden code create ediniz
               Örnek Ekran çıktısı
            1  2  3  4  5
            2  4  6  8 10
            3  6  9 12 15
            4  8 12 16 20
            5 10 15 20 25

            5x5
              */

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: "); int rows = input.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                //int s = (i==1) ? j : i*j;
                System.out.printf((j==1)? "\n%5d": "%5d" ,i*j);

            }
        }

        // task-> girilen sayının faktöriyelini print code create ediniz
        //falan faktöriyel=1'den falana kadar tamsayıların çarpımı->1*2*3*...*falan
        System.out.println("\ntask-> girilen sayının faktöriyelini print code create ediniz");
        int result = 1;
        for (int i = 1; i <= rows; i++) {
            result *=i;
        }
        System.out.printf("%d nin faktoryeli %d.", rows, result);
    }
}
