package gr.aueb.cf.ch7;

import java.util.Scanner;

/**
 * From String to int.
 */
public class StrTypecast {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lexeme = "";
        int num = 0;

        System.out.println("Παρακαλώ εισάγετε ένα ακέραιο:");
        lexeme = scanner.nextLine();
        num = Integer.parseInt(lexeme);

        System.out.println("Ο ακέραιος είναι ο: " + lexeme);
    }
}
