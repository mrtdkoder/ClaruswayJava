package j10_MethodCreation;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter:"); String s = input.nextLine();
        //hackerDil(s);
        System.out.println("str = " + hackerDil(s));

    }
    public static String hackerDil(String str) {
        return   str.replaceAll("a", "7")
                    .replaceAll("v", "1")
                    .replaceAll("c","-4")
                    .replaceAll("e","2");
    }
}
