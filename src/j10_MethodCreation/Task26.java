package j10_MethodCreation;

public class Task26 {
    // task-> Girilen bir ifadenin tekrarlı karakterleri yalnızca 1 kez print eden METHOD create ediniz
// input-> javacanlara selam olsun
// output-> javcnlr selamou
    public static void main(String[] args) {
        System.out.println(tekrarsiz("aaslkdhfsskkskkkssbvbbbsb"));
    }

    public static String tekrarsiz(String s) {
        String tmp = "";
        for (int i = 0; i <s.length(); i++) {
            if (!tmp.contains(s.substring(i, i + 1))) {
                tmp += s.charAt(i);
            }
        }
        return tmp;
    }
}
