package SwitchCase;

import java.util.Scanner;

public class switchCase01 {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "Nov", "December"};
        System.out.print("number of month: ");
        int i = input.nextInt();
        switch (i) {
            case 1,3,5,7,8,10,12:
                System.out.printf("%s is a month for 31days\n", months[i+-1]);
                break;
            case 4,6,9,11:
                System.out.printf("%s is a month for 30days\n", months[i-1]);
                break;
            case 2:
                System.out.print("please enter year: ");
                int year = input.nextInt();
                System.out.printf("%s is a month for %ddays\n", months[i-1], (year % 4 == 0 && year % 100!= 0)? 29: 28);
                break;
            default:
                System.out.println("please enter a valid month");
                break;
        }
    }
}
