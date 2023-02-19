package j12_Arrays;

import java.util.Arrays;

public class _11_Average_of_Array {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
        Array'in ortalamasını alınız.
         */

        //Kodu aşağıya yazınız.

        int[] array = {12, 14, 21, 23, 10, 4};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        System.out.println("Ortalama = " + (sum/array.length));


    }
}