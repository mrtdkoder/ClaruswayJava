package Section1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args)throws IOException {
       //Console consol = System.console();
        BufferedReader _br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("hello world!");
        String _name;
        int _age, year;
        System.out.print("Hi mate whats ur name? :");
        _name = _br.readLine();

        System.out.print("hi " + _name + "! how old are you? :");
        _age = Integer.valueOf(_br.readLine());
        year = 2023 - _age;
        System.out.println("so you were born in " + year);

        System.out.println(String.format("hex-code of the year you were born in %s %x - %o - %d ", decimalToBinary(year),  year, year, year));

        LocalTime _time = LocalTime.now();
        String _temp = "", t2="";
        int x = 1;
        for (int i = 0; i < 10000000; i++) {
            if (_temp.length()>0 && !_temp.equals(t2)) {
                System.out.println(String.format("%06d| %s |",x, _temp));
                t2 = _temp; x++;
            }
            _temp = (decimalToBinary(LocalTime.now().getNano()));
        }

        //Math.sqrt();
    }

    public static String decimalToBinary(int num)
    {
        // Creating and assigning binary array size
        int[] binary = new int[35];
        int id = 0;
        String _result = "";
        // Number should be positive
        while (num > 0) {
            binary[id++] = num % 2;
            num = num / 2;
        }

        for (int i = id - 1; i >= 0; i--)
            _result = _result + binary[i];
            //System.out.print(binary[i] + "");
        // Print Binary
        //printBinary(binary, id);
        return _result;
    }

}
