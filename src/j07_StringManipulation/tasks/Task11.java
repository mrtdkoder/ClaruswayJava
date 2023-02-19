package j07_StringManipulation.tasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
      /* TASK :
       Kullanıcıdan tek seferde alınan ad soyadı ifadeyi
      ad ve soyadı ayrı ayrı print eden code create ediniz
       */
        Scanner input = new Scanner(System.in);

        System.out.print("bir ad-soyad  giriniz : ");
        String fullName = input.nextLine();
        String ad = fullName.substring(0, fullName.indexOf(" "));
        String soyad = fullName.substring(fullName.indexOf(" ") + 1);


       // String ad = input.nextLine().substring(0, input.nextLine().indexOf(" "));
       // String soyad = input.nextLine().substring(input.nextLine().indexOf(" ") + 1);

      // System.out.println("ad+soyad = " + ad +" "+ soyad);
      //  System.out.println(
      //          input.nextLine().
      //                          substring(0, input.nextLine().indexOf(" ")) +
      //          input.nextLine().
      //                          substring(input.nextLine().indexOf(" ") + 1)
      //  );
    }
}
