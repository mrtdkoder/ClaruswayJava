package StringManipulations;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Scanner;

public class cryptoStrings {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("$:");
        String s = scanner.nextLine();
        MessageDigest digest = MessageDigest.getInstance("SHA-256");


        for (int i = 0; i < 100000; i++) {
            byte[] hash = digest.digest((s+1).getBytes());
            String encoded = Base64.getEncoder().encodeToString(hash);
            System.out.printf("[%s]\n", encoded);
        }

    }
}
