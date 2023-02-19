package j07_StringManipulation.tasks;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {

        /*
        Girilen String'in son karakterini silen code create ediniz...
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("bir metin giriniz : ");
        String str = sc.nextLine();
        System.out.println("str = " + str);
        System.out.println("son karakter silinmiş metin  " + str.substring(0, str.length() - 1));

    }
}
