package j10_MethodCreation;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {

    /* task->
    Fazla mesaiyi hesaplayan ve toplam kazancı return eden method create ediniz


    Kullanıcıdan saatlik çalışma ücretini, hangi saatler arasında çalıştığını ve
    fazla mesaiye kalırsa kazancını kaç ile katlayacağını alalım.

    Örnek :
    saatlik çalışma ücreti : 40.0
   iş başı saati : 9.0
    paydos saati : 20.0
    fazla mesaiyi saat ücreti çarpanı: 1.8

    ucretHesapla(9.0,20.0,40.0,1.8);

    9 ile 17 arasında toplam çalışma 8 saat olduğu için 8 x 40 = 320
    17 ile 20 arasında toplam çalışma 3 saat olduğu için 3 x 40 x 1.8 =  216

    toplam = 536.0
    */

        Scanner input = new Scanner(System.in);
        System.out.print("Saatlik ucret :"); double saatlikUcret    = input.nextDouble();
        System.out.print("Baslama saati :"); double baslamaSaati    = input.nextDouble();
        System.out.print("Bitis saati   :"); double bitisSaati      = input.nextDouble();
        System.out.print("FezlaMesai crp:"); double fmCarpani       = input.nextDouble();

        System.out.println("Toplam = " + ucretHesapla(saatlikUcret, baslamaSaati, bitisSaati,fmCarpani));

    }

    private static double ucretHesapla(double saatlikUcret, double baslamaSaati, double bitisSaati, double fmCarpani) {
        double toplam = 0.0, calisilanSaat = 0.0;
        calisilanSaat = bitisSaati - baslamaSaati;

        if (calisilanSaat>8) {
            toplam = (saatlikUcret*8) + (saatlikUcret*fmCarpani*(calisilanSaat-8));
        } else {
            toplam = calisilanSaat*saatlikUcret;
        }
        return  toplam;
    }


}
