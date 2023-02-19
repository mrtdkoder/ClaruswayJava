package j07_StringManipulation.tasks;

public class Task08 {
    public static void main(String[] args) {
        /*  TASK :
   Asagidaki String degiskenini kullanarak  konsolda isminizi print eden code create ediniz.
   String  harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    */
        String  harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       char birinci= harfDepo.charAt(harfDepo.indexOf('H'));//H
       char ikinci= harfDepo.charAt(harfDepo.indexOf('A'));//A
       char ucuncu= harfDepo.charAt(harfDepo.indexOf('L'));//L
       char dorduncu= harfDepo.charAt(harfDepo.indexOf('U'));//U
       char besinci= harfDepo.charAt(harfDepo.indexOf('K'));//K

        System.out.println(birinci+ikinci+ucuncu+dorduncu+besinci);//373->char ascii değer toplamı
        System.out.println(""+birinci+ikinci+ucuncu+dorduncu+besinci);//HALUK
        System.out.println(birinci+ikinci+ucuncu+dorduncu+besinci+""+birinci);//373H












    }
}
