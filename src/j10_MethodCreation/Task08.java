package j10_MethodCreation;

import java.time.LocalDate;
import java.util.Scanner;

public class Task08 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

    /*
    Task-> girilen bir yılın  artık yıl olmasını kontrol eden METHOD create ediniz

   input: 2023
   output:false
    */

        System.out.print("year? :"); int year = scanner.nextInt();
        System.out.println(year + " is" +  (isLeapYear(year)? " a " : "n't a ") + "leap year");
    }

    public static boolean isLeapYear(int year){
        return  ((year%4==0) && (year%100==0) && (year%400==0));
    }
}
