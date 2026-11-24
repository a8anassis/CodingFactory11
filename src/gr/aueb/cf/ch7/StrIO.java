package gr.aueb.cf.ch7;

import java.util.Scanner;

/**
 * Demo of String I/O.
 */
public class StrIO {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = "";
        String str2 = "";

        System.out.println("Παρακαλώ εισάγετε δύο strings:");
        str1 = in.next();   // διαβάζει μέχρι το πρώτο whitespace
        str2 = in.nextLine();   // διαβάζει μέχρι να βρει newline
    }
}
