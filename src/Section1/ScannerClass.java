package Section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) throws IOException {
        //Scanner _input = new Scanner(System.in);
        BufferedReader _input = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Birincinin adi ne? :");
        String name1 = _input.readLine();//.nextLine();
        System.out.printf("%s kac yasinda:", name1);
        int aliAge  = Integer.parseInt(_input.readLine());//.nextInt();
        System.out.print("ikincinin adi ne? :");
        String name2 = _input.readLine();//.readLine();//.nextLine();
        System.out.printf("%s kac yasinda:", name2);
        int veliAge =   Integer.parseInt(_input.readLine());//.nextInt();

        System.out.printf("%s %d %s ise %d yasinda%nm", name1, aliAge, name2, veliAge);

        float salary = Float.MAX_VALUE;
        System.out.println("salary = " + salary);

    }

    public int str2int(String str) throws NumberFormatException {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}
