package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει ακεραίους προσπαθώντας να
 * μαντέψει ένα μυστικό ακέραιο.
 */
public class SecretApp {

    public static void main(String[] args) {
        final int SECRET = 12;

        Scanner sc = new Scanner(System.in);
        int guess = 0;

        System.out.println("Προσπαθήστε να μαντέψετε τον μυστικό ακέραιο");
        guess = sc.nextInt();

        if (guess == SECRET) {
            System.out.println("Συγχαρητήρια! Μαντέψατε σωστά,");
        } else {
            System.out.println("Η επιλογή ήταν λάθος!");
        }
    }
}
