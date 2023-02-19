package SwitchCase;

import java.util.Scanner;

public class switchCase02 {
    public static void main(String[] args) {
        // seasons
        String[] months = { "January", "February", "March", "April",
                            "May", "June", "July", "August", "September",
                            "October", "Nov", "December"};
        Scanner input = new Scanner(System.in);
        System.out.print("number of month: ");
        int i = input.nextInt();
        switch (i) {
            case 1,2,12:
                System.out.printf("%s is a month in winter\n", months[i-1]);
                break;
            case 3,4,5:
                System.out.printf("%s is a month in spring\n", months[i-1]);
                break;
            case 6,7,8:
                System.out.printf("%s is a month in summer\n", months[i-1]);
                break;
            case 9,10,11:
                System.out.printf("%s is a month in autumn\n", months[i-1]);
                break;
            default:
                System.out.println("please enter a valid month");
                break;
        }
    }
}
