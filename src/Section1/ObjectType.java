package Section1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ObjectType {
    public static void main(String[] arg) throws FileNotFoundException {
        Object obj;

        int         i = 111;
        double      d = 102.5;
        String      s = "merhaba\n\tmurat";

        FileInputStream fis = new FileInputStream(new File("C:\\install.log"));

        Scanner     input = new Scanner(System.in);
        System.out.print("type variant name to cast to object:");
        String vt = input.nextLine();

        switch (vt) {
            case "i" -> {
                obj = i;
                System.out.println(vt + " ->" + obj + ";");
            }
            case "d" -> {
                obj = d;
                System.out.println(vt + " ->" + obj + ";");
            }
            case "s" -> {
                obj = s;
                System.out.println(vt + " ->" + obj + ";");
            }
            case "Scanner" -> {
                obj = input;
                System.out.println(vt + " ->" + obj + ";");
            }
            case "fis" -> {
                obj = fis;
                System.out.println(vt + " ->" + obj + ";");
            }
            case "this" -> {
                obj = new ScannerClass();
                System.out.println(vt + " ->" + obj + ";");
                ScannerClass sC = (ScannerClass) obj;
            }
        }
    }
}
