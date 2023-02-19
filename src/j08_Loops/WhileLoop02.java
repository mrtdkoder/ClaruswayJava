package j08_Loops;

import java.util.Scanner;

public class WhileLoop02 {
    public static void main(String[] args) {
        // task-> girilen tamsayını pozitif tam bolen sayısını print eden code create ediniz...
        // 20 -> 1,2,4,5,10,20: 20'nin 6 tane tam böleni var
        // 30 -> 1,2,3,5,6,10,15,30: 30'nin 8 tane tam böleni var
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();
        int count = 1, i=0, sum=0;

        while (count <= number /2) {
            if (number %count == 0) {
                System.out.print(count + "-");
                i++;sum+=count;
            }
            count++;
        }
        System.out.print(number);i++;
        System.out.printf("\n Sum=%d Count=%d Avg=%d ", sum, i, sum/i);

    }
}
