package j10_MethodCreation;

import java.util.Scanner;

public class C04_myATMapp {
    static Scanner input = new Scanner(System.in);
    private static double _balance;
    private static boolean _exit;

    public static void main(String[] args) {
        _balance = 1200d;
        _exit = false;
        do {
            showMainMenu();
            int choice = input.nextInt();
            doMainMenu(choice);
        } while (!_exit);
    }

    private static void doMainMenu(int choice) {
        switch (choice) {
            case 1 :
                    showBalance();
                break;
            case 2 :
                    doDeposit();
                break;
            case 3 :
                    doWithdraw();
                break;
            case 4 :
                    doExit();
                break;
            default:

        }
    }

    private static void doExit() {
        _exit = true;
    }

    private static void showBalance() {
        yazdir("---------Balance---------\n");
        yazdir("1. Your Balance :" + _balance + "\n");
        //yazdir("Any key to continue..."); String s = input.nextLine();
    }

    private static void doDeposit() {
        yazdir("---------Deposit---------\n");
        yazdir("Amount to Deposit ?: ");
        double amountToDeposit = input.nextDouble();
        if (amountToDeposit>0)
            _balance = _balance + amountToDeposit;
        yazdir("Thanks for depositing " + amountToDeposit + "\n");
        yazdir("Your Balance: " + _balance + "\n");
        //yazdir("Any key to continue..."); String s = input.nextLine();
    }

    private static void doWithdraw() {
        yazdir("---------Withdraw---------\n");
        yazdir("Amount to withdraw ?: ");
        double amountToWithdraw = input.nextDouble();
        if (amountToWithdraw>_balance) {
            yazdir("Not enough balance");
        } else {
            _balance -=amountToWithdraw;
            yazdir("You have withdrawn " + amountToWithdraw + "\n");
            yazdir("Your Balance: " + _balance + "\n");
            //yazdir("Any key to continue..."); String s = input.nextLine();
        }

    }

    public static void yazdir(String str) {
        System.out.print(str);
    }
    public static void showMainMenu() {
        yazdir("---------Main Menu---------\n");
        yazdir("1. Show Balance\n");
        yazdir("2. Deposit\n");
        yazdir("3. Withdraw\n");
        yazdir("4. Exit\n");
        //yazdir("5. Exit\n");
        yazdir("---------------------------\n");
        yazdir("Please enter your choice: ");
    }
}
