package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Επαναληπτικά ο χρήστης προσπαθεί
 * να μαντέψει τον μυστικό ακέραιο.
 */
public class SecretIterative {

    public static void main(String[] args) {
        final int SECRET = 12;

        Scanner sc = new Scanner(System.in);
        int guess = 0;

        while (true) {
            System.out.println("Guess a number (int):");
            guess = sc.nextInt();

            if (guess != SECRET) {
                System.out.println("Λάθος επιλογή. Προσπαθήστε ξανά.");
                continue;
            }

            System.out.println("Συγχαρητήρια! Μαντέψατε σωστά.");
            break;

//            if (guess == SECRET) {
//                System.out.println("Συγχαρητήρια! Μαντέψατε σωστά.");
//                break;
//            }
//
//            System.out.println("Λάθος επιλογή. Προσπαθήστε ξανά.");
//
        }
    }
}
