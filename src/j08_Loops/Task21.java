package j08_Loops;

public class Task21 {

    /*
             *
            * *
           * ! *
          * ! ! *
         * ! ! ! *
        * ! ! ! ! *
       * ! ! ! ! ! *
      * * * * * * * *
      şekli print eden code create ediniz.
     */

    public static void main(String[] args) {

        int buttomLineLength = 25;
        int height = 13;
        for (int i = 1; i <= height; i++) {
            int lengthOfLine    = (2*i)-1;
            int starting_point  = (buttomLineLength/2) - (lengthOfLine/2);
            String lineStr = "";
            //lineStr = lineStr.indent(starting_point);
            for (int x=0; x < starting_point; x++) {
                lineStr += " ";
            }
            for (int j = 1; j <= lengthOfLine; j++) {
                if (i<height) {
                    lineStr += (j % 2 == 0) ? " " : ((j == 1 || j == lengthOfLine) ? "*" : "!");
                } else {
                    lineStr += (j % 2 == 0) ? " " : "*";
                }
            }
            System.out.println(lineStr);
        } // endOfFor i
        main2();
    }

    public static void main2() {
        int i, j, k;
        for(i=1; i<=8; i++) {
            for (j = 8; j > i; j--)
                System.out.print( " " );
            for (k = 1; k <= i; k++)
                if ((k == i) || (k == 1))
                    System.out.print(" *");
                else  System.out.print(" !");
            System.out.println();
        } System.out.print("* * * * * * * * *");
    }
}
