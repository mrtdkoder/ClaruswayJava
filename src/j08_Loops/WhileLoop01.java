package j08_Loops;

import java.util.Scanner;

public class WhileLoop01 {
    public static void main(String[] args) {
        //task-> girilen tamsayının rakamları toplamını print eden code create ediniz
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int i = sc.nextInt();
        int _total = 0;

        while (i > 0) {
            _total += i % 10;
            i /= 10;
        }
        System.out.println("The sum of the digits is: " + _total);
    }
}
