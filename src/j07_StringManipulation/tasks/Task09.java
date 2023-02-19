package j07_StringManipulation.tasks;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

		/*  TASK :
				StringMethods:
				girilen  bir strngin ilk yarisini print eden code create ediniz
	    	    ORNEK:
		     	INPUT :istanbul
				OUTPUT :ista

		 */
        Scanner input = new Scanner(System.in);

        System.out.print("bir metin giriniz : ");
        String str = input.nextLine();

        if (str.length() % 2 == 0) {//cift karakterli olma şartı

            System.out.println("metnin ilk yarisi : " + str.substring(0, str.length() / 2));

        } else System.out.println("girilen metnin ilk yarisi bulunamazzz :( ");


    }
}
