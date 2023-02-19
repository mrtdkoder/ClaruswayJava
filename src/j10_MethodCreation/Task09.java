package j10_MethodCreation;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

    /*
   Task->  Saati saniyeye çeviren  method create ediniz


    */
        Scanner input = new Scanner(System.in);
        System.out.print("enter hours: "); int hours = input.nextInt();
        System.out.println(hours + " = " + toSeconds(hours) + " seconds");

    }

    private static int toSeconds(int hours) {
        return hours * 3600;
    }


}
