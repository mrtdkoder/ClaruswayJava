package j08_Loops;

public class Task20 {
    public static void main(String[] args) {
    /****************************
       1
       2   6
       3   7   10
       4   8   11  13
       5   9   12  14  15
     + 0   5    10  15  20
      0    1    3   6   10
    j  0    1    2   3   4
    *****************************/

//        for (int i = 1; i <= 5; i++) {
//            System.out.printf("%3d", i);
//            int cikanSayi   = 0;
//            for (int j = 1; j<i; j++) {
//                cikanSayi = cikanSayi + j;
//                System.out.printf("%3d", ((i+(j*5))-cikanSayi));
//            }
//            System.out.println("");
//        }

            for (int i = 1; i <= 20; i++) {
                int Number = i;
                for (int j = 1; j <= i; j++) {
                    System.out.print(Number + " ");
                    Number += 20 - j;
                }
                System.out.println();
            }


    }
}
