package j12_Arrays;

public class _15_Word_Count {

    public static void main(String[] args) {

        /*
        Bu String'i oluşturun. "Removes white space from both ends of a string"
        String'deki kelime sayısını yazdırınız.
         */

        //Kodu aşağıya yazınız.
        String s = "Removes white space from both ends of a string";
        String[] words = s.split(" ");
        System.out.println("words = " + words.length);
    }
}