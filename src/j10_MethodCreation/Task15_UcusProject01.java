package j10_MethodCreation;

import java.util.Scanner;

public class Task15_UcusProject01 {

    /*
    A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
    Bilet tarifesi:
    km birim fiyati : 0.10$
    yolcu 12 yasindan kucukse toplam fiyata %50 indirim,
    12 ve 24 yas arasindaysa 10% indirim,
    65 yasindan buyukse 30% indirim,
    bilet gidis donus alinirrsa 20% indirim uygulayan bir app create ediniz
     */
    static Scanner sc = new Scanner(System.in);//güneşimiz tüm gezegenler için ortak erişimde

    public static void main(String[] args) {
        System.out.println("----------- Bilmem ne Turizme hosheldiniz -----------");
        String d = askDestination();
        int    a = askAge();
        boolean r= askIfReturn();
        //getPrice(askDestination(),askAge(),askIfReturn());
        System.out.println("ucret = " + getPrice(d, a, r));
        System.out.println("------------------------------------------------------");

    }

    public static String askDestination() {
        System.out.print("Varis yeriniz? [B-C-D] :");
        return sc.nextLine().toLowerCase();
    }

    public static int askAge() {
        System.out.print("Yasiniz? :");
        return sc.nextInt();
    }

    public static boolean askIfReturn() {
        System.out.print("Gidis Donus mu? [E-H]:");
        return sc.nextLine().toLowerCase()=="e";
     }

     public static double getPrice(String destination, int age, boolean isReturn) {
        double _price = (destination.equals("b")? 500 : (destination.equals("c") ? 700:900))*0.10d;
        if (age<12) {
            _price *= 0.5d;
        } else if (age < 24) {
            _price *= 0.90d;
        } else if (age > 65) {
            _price *= 0.70d;
        }
        return isReturn? _price * 0.80d : _price;
     }

}
