package j12_Arrays;

import java.util.Arrays;

public class _13_Advance_zeroFront {

    public static void main(String[] args) {

      /*

   Verilen Array tam olarak aynı sayıları içeren, ancak tüm sıfırların dizinin başında gruplandırılması
   için yeniden düzenlenmiş bir Array döndürün.
   Sıfır olmayan sayıların sırası önemli değildir.
   Böylece {1, 0, 0, 1} {0, 0, 1, 1} olur. Verilen diziyi değiştirebilir ve döndürebilir veya yeni bir dizi oluşturabilirsiniz.

   Bu şekilde bir Array oluşturunuz: 1,0,0,1,0
   Sonuç böyle olmalı :  0,0,0,1,1

       */

        // Kodu aşağıya yazınız..

        int[] arr = {1, 0, 0, 1, 0};
        int[] arr2 = new int[arr.length];
        int j = 0;
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] == 0) {
                arr2[j++] = 0;
            }
        }
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] != 0) {
                arr2[j++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}