package j08_Loops;
import java.util.Scanner;
public class WhileLoop03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0, count = 0;

        while (sum<=333) {
            System.out.print("please enter a number");
            int num = sc.nextInt();
            sum = sum + num;
            count++;
        }
        System.out.println("Sum is " + sum + " and count is " + count);

    }
        }
