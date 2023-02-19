package j10_MethodCreation;

import java.util.Arrays;

public class Task20 {
    /*
    task->
      Tek bir String içerisinde verilen euro ve dolarların ayrı ayrı toplamlarıni print eden METHOD create ediniz

       [$1 $12 €34 €56 $45 €78]
        dolarToplami: 58
        euroToplami: 168
       */

    public static void main(String[] args) {
        String str = "$1 $12 €34 €56 $45 €78 ";

        topla(str);

    }

    static void topla(String para) {
        int euro=0, dollar=0;
        int i=0;
        while (para.contains("$") || para.contains("€")) { //
            if ((para.charAt(i) == '$') || (para.charAt(i) == '€')) {
                int _nextSpace = para.indexOf(" ", i);
                int curr = Integer.parseInt(para.substring(i+1, _nextSpace));

                if (para.charAt(i) == '$') dollar += curr;
                else if (para.charAt(i) == '€') euro += curr;


                para = para.substring(_nextSpace+1);
                i = 0;
            } else i++;
        }

        System.out.println("dollar = " + dollar);
        System.out.println("euro = " + euro);
    }



}
