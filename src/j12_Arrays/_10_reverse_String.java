package j12_Arrays;

public class _10_reverse_String {

    public static void main(String[] args) {

        /*
        Bir String oluşturun : "Hello World"
        Stringi tersten yazdırın ve print edin.
        Cevap böyle olmalı :  "dlroW olleH"
         */

        String str = "Hello World";
        char[] charArray = str.toCharArray();
        str = "";
        for (int i = 0; i < charArray.length; i++) {
            str = charArray[i] + str;
        }
        System.out.println("str = " + str);
    }
}