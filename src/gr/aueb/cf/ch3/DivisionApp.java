package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει αριθμητή και παρονομαστή
 * για να εκτελέσει μία διαίρεση.
 *
 * Αν ο παρονομαστής είναι 0 δεν μπορεί να εκτελεστεί
 * η διαίρεση και ο χρήστης πρέπει να λάβει κατάλληλο
 * μήνυμα και να του δοθεί η ευκαιρία να ξαναπροσπαθήσει.
 *
 * Αν ο αριθμητής είναι 0 τότε αυτό σημαίνει έξοδος από
 * το πρόγραμμα.
 *
 */
public class DivisionApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        while (true) {

            // Data input & validation
            System.out.print("Εισάγετε τον αριθμητή");
            numerator = sc.nextInt();

            if (numerator == 0) {
                System.out.println("Έξοδος από το πρόγραμμα.");
                break;
            }

            System.out.println("Εισάγετε το παρονομαστή");
            denominator = sc.nextInt();

            if (denominator == 0) {
                System.out.println("Ο παρονομαστής δεν πρέπει να είναι 0. Προσπαθήστε ξανά.");
                continue;
            }

            // Process data
            result = numerator / denominator;

            // Εκτύπωση αποτελεσμάτων
            System.out.printf("Το αποτέλεσμα της διαίρεσης %d / %d = %d\n", numerator, denominator, result);
        }
    }
}
