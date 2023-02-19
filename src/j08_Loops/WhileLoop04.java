package j08_Loops;
import java.util.Scanner;

public class WhileLoop04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bigest = 0, count = 0;

        while (count < 8) {
            System.out.print("please enter a number");
            int num = sc.nextInt();
            bigest = num > bigest? num : bigest;
            count++;
        }
        System.out.println("sc.match().group() = " + sc.match().group());
        System.out.println("the biggest number is " + bigest);
        String str = "naber";
        str.contains("b");
    }
        }
