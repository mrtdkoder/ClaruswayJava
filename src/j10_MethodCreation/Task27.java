package j10_MethodCreation;

import java.util.Scanner;

public class Task27 {
    /*
    task->
    belirli bir yukseklikten bırakılan top atildigi yuksekligin 3/4 u kadar yerden yukari dogru ziplamaktadir
    Topun ziplama  yuksekligi 1 metrenin altina dşütüğü ana kadar topun aldigi toplam yolu ve yere vurma sayisini
    print eden METHOD  create ediniz.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Yukseklik :"); double yukseklik = input.nextDouble();

        hesapla(yukseklik);
    }

    private static void hesapla(double yukseklik) {
        int ziplamaSayisi = 0;
        double yol = yukseklik;
        while (yukseklik >=1) {
            yukseklik *= 0.75;
            ziplamaSayisi++;
            yol += (2*yukseklik);
        }
        System.out.printf("alinan yol %f metre - ziplamaSayisi %d", yol, ziplamaSayisi);
    }
}
