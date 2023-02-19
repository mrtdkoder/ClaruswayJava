package j12_Arrays;

import java.util.Arrays;

public class _08_array_min_value {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        En küçük (minimum) sayıyı yazdırınız.
         */

        // Kodu aşağıya yazınız..

        int[] arr = {14, 19, 5, 21};

        Arrays.sort(arr);
        System.out.println("en kucuk = " + arr[0]);

    }
}

