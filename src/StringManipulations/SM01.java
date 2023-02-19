package StringManipulations;

import java.util.Scanner;

public class SM01 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String s;
        Scanner scanner = new Scanner(System.in);
        s = "\thello it s murat \n"; //scanner.nextLine();


        System.out.println(s); // hello it s murat
        System.out.println("s.length() = " + s.length()); //s.length() = 16
        System.out.println("s.charAt(s.length() - 1) =" + s.charAt(s.length() - 1)); //s.charAt(s.length() - 1)t
        System.out.println("s.indent(12) = " + s.indent(12)); //s.indent(12) =             hello it s murat
        System.out.println("s.intern() = " + s.intern()); //s.intern() = hello it s murat
        System.out.println("s.compareTo(\"murat\") = " + s.compareTo("murat")); //s.compareTo("murat") = -5
        System.out.println("s.contains(\"murat\") = " + s.contains("murat")); //s.contains("murat") = true
        System.out.println("s.indexOf(\"murat\") = " + s.indexOf("murat")); //s.indexOf("murat") = 10
        System.out.println("s.repeat(2) = " + s.repeat(2)); //s.repeat(2) = hello its murathello its murat
        System.out.println("s.replace(\"murat\", \"murat2\") = " + s.replace("murat", "murat2")); //hello it s murat2
        System.out.println("s.indexOf(\"murat\",0) = " + s.indexOf("murat", 0)); //s.indexOf("murat",0) = 11
        System.out.println("s.codePointAt(0) = " + s.codePointAt(0)); //s.codePointAt(0) = 104
        System.out.println("s.startsWith(\"murat\") = " + s.startsWith("murat")); //s.startsWith("murat") = true
        System.out.println("s.endsWith(\"murat\") = " + s.endsWith("murat")); //s.endsWith("murat") = true
        System.out.println("s.substring(3,7) = " + s.substring(3, 7)); //s.substring(3,7) = lo i
        System.out.println("s.strip() = " + s.strip()); //s.strip() = hello it s murat
        System.out.println("s.split(\" \") = " + s.split(" ")[0]); //s.split(" ") = [hello, it,]
        System.out.println("s.trim() = " + s.trim()); //s.trim() = hello it s murat
        System.out.println("s.formatted(12) = " + s.formatted(12)); //s.formatted() = hello it s murat
        System.out.println("s.translateEscapes() = " + s.translateEscapes()); //s.translateEscapes() = hello it s murat
        System.out.println("s.charAt(0) = " + s.charAt(0)); //s.charAt(0) = 'h'

    }
}
