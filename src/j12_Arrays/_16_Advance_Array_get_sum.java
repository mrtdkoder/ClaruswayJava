package j12_Arrays;

public class _16_Advance_Array_get_sum {

    public static void main(String[] args) {

        /*
        Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
        $ işaretlerini kaldırın ve sayıları toplayın.
        Sayıların toplamını yazdırın.
         */

        //Kodu aşağıya yazınız.

        String s = "$12 $23 $10 $2 $5 $2";
        String[] arr = s.split(" ");
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += Integer.parseInt(arr[i].replace("$", ""));
        }
        System.out.println("total = $" + total);
    }
}