package C03_TernaryOperator;

import java.util.Scanner;

public class NestedTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        Integer number = input.nextInt();
        System.out.print((((Integer) (Math.abs(number))).toString().length() > 1) ? "Sayi ikibasmakli veya buyuk" : "Sayi tek basmakli");
        String result = (number == 1) ? "Tas" : ((number == 2) ? "kagit" : (number == 3) ? "Makas" : "bazuka");
        System.out.println(result);
    }
}
