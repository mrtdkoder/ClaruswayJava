package j12_Arrays;

public class _14_String_method_replace {

    public static void main(String[] args) {

        /*
        Bu String'i oluşturunuz.  "Hello World"
        "o" harfleri yerine "K" yerleştiriniz.
        Sonuç bu şekilde olmalıdır:
        HellK WKrld
         */

        String str = "Hello World";
        char[] arr = str.toCharArray();
        str = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]=='o') {
                str += "K";
            } else {
                str += arr[i];
            }
        }
        System.out.println("str = " + str);


    }
}