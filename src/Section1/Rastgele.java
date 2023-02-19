package Section1;

import java.util.Random;

public class Rastgele {
    public static void main(String[] args) {
        double  rn1 = Math.random(); // 0 ile 0.999999 arasinda sayi uretir
        int     rn2 = (int)Math.random()*100+1; // 1 ile 100 arasinda rakam uretti

        Random rnd = new Random();
        int rn3 = rnd.nextInt(1,11); // 1 ile 10 arasinda rakam uretir


    }

}
