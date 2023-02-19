package j12_Arrays;

public class _05_Array_with_for_if {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 5,6,8,12,14,19
        Eğer sayı çiftse topla, tekse çıkar.
        Örneğin:
         -5 + 6 + 8 + 12 + 14 - 19 = 16
        Toplamlarını yazdırın.
         */

        //Kodu aşağıya yazınız.

        int[] arr = {5,6,8,12,14,19};
        int ttl = 0;
        for (int i = 0; i < arr.length; i++) {
            ttl+=(arr[i]%2==0? arr[i] : arr[i]*(-1));
        }
        System.out.println("total = " + ttl);


    }
}
