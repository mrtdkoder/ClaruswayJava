package j08_Loops;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir string giriniz");
        String str = input.nextLine();

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (result.indexOf(str.charAt(i))==-1) {
                result = result + str.charAt(i);
            }
        }
        System.out.println("result = " + result);
    }
}
