package j12_Arrays;

import java.util.Arrays;

public class _06_Array_contains {

    public static void main(String[] args) {

        /*
        String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        Eğer aitse "true" çevirin.
        Loops (döngüler) kullanın.
         */

        //Kodu aşağıya yazınız..

        String[] array = {"Apple", "Orange", "Banana", "Pineapple"};
        System.out.println((Arrays.binarySearch(array, "Apple") < 0 ? "False" : "True"));

    }
}
