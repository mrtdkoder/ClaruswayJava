package j10_MethodCreation;

import java.util.Random;
import java.util.Scanner;

public class Task28 {
    /*
    task->
    Ismi randomNum olan bir method oluşturun.
    Parametre olarak int max almalı.
    Bu method, 0 ile max arasında.random bir değer döndürmelidir.
    Random numarayı döndürünüz.
    Note: Eğer bir class oluşturmaya ihtiyaç duyuyorsanız oluşturabilirsiniz.
    Note: Methodun adı istenilenle birebir aynı olmalı (randomNum), aksi taktirde cevap yanlış olur.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("max = "); int max = input.nextInt();
        for (int i = 0; i < 10; i++) {
            System.out.println(randomNum(max));
        }
    }

    public static int randomNum(int max) {
        return (int)(Math.random()*(max));
    }
}
