package SwitchCase;

import java.util.Scanner;

public class switchCase03 {
    public static void main(String[] args) {
        /*
        *    # ATM balance $1000
        *    # show the balance
        *    # withdraw $100
        *    # deposit
        *
        * */
        int balance = 1000;
        boolean isLoop = true;
        while (isLoop) {
            Scanner input = new Scanner(System.in);
            System.out.println("\t\t # Welcome to JavaBank ATM # ");
            System.out.println("\t [1] Show the balance");
            System.out.println("\t [2] Withdraw ");
            System.out.println("\t [3] Deposit");
            System.out.println("\t [4] Exit");
            System.out.print("\t Enter your choice: ");

            int i = input.nextInt();
            switch (i) {
                case 1:
                    System.out.printf("Your balance is %d\n", balance);
                    break;
                case 2:
                    System.out.printf("Your balance is %d\n", balance);
                    System.out.printf("Please enter how much you want to withdraw: ");
                    int withdraw = input.nextInt();
                    if (withdraw > balance) {
                        System.out.println("Insufficient balance");
                    } else {
                        balance -= withdraw;
                        System.out.printf("Your balance is now %d\n", balance);
                    }
                    break;
                case 3:
                    System.out.printf("Your balance is %d\n", balance);
                    System.out.printf("Please enter how much you want to deposit:");
                    int deposit = input.nextInt();
                    if (deposit > 0) {
                        System.out.printf("%d deposited", deposit);
                        balance += deposit;
                    }
                    System.out.printf("Your balance is now %d\n", balance);
                    break;
                case 4:
                    System.out.printf("Thank you for using us!");
                    isLoop = false;
                    break;
                default:
                    System.out.println("please enter a valid choice");
                    break;
            }
        }
    }
}
