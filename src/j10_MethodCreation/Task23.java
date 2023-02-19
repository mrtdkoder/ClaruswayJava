package j10_MethodCreation;

import java.util.Scanner;

public class Task23 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Boy (metre): ");  double boy = input.nextDouble();
        System.out.print("Kilo kg: ");      double kilo = input.nextDouble();
        System.out.println(getBMItoText(getBMI(kilo, boy)));
    }

    public static double getBMI(double weight, double height) {
        return weight / (height * height);
    }

    public static String getBMItoText(double BMI) {
        if (BMI < 18.5) {
            return "zayif";
        } else if (BMI >= 18.5 && BMI < 25) {
            return "normal";
        } else if (BMI >= 25 && BMI < 30) {
            return "kilolu";
        } else if (BMI >= 30 && BMI < 35) {
            return "obez";
        } else if (BMI >= 35 && BMI < 40) {
            return "obez +";
        } else return "obez ++";
    }
}
