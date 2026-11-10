package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Εμφανίζει ένα μενού επιλογών στον χρήστη και του ζητάει
 * να εισάγει μία επιλογή. Ανάλογα με την επιλογή δίνουμε feedback.
 */
public class SwitchApp {

    public static void main(String[] args) {

        final int EXIT = 5;
        Scanner in = new Scanner(System.in);
        int choice = 0;

        while (true) {
            System.out.println("Επιλέξτε μία από τις παρακάτω επιλογές:");
            System.out.println("1. Προβολή προφίλ");
            System.out.println("2. Επεξεργασία προφίλ");
            System.out.println("3. Ρυθμίσεις...");
            System.out.println("4. Βοήθεια");
            System.out.println("5. Έξοδος");

            choice = in.nextInt();

            if (choice == EXIT) {
                System.out.println("Έξοδος");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.println("Προβολή προφίλ.");
                    break;
                case 2:
                    System.out.println("Επεξεργασία προφίλ.");
                    break;
                case 3:
                    System.out.println("Ρυθμίσεις.");
                    break;
                case 4:
                    System.out.println("Βοήθεια.");
                    break;
                default:
                    System.out.println("Μη έγκυρη επιλογή.");
                    break;
            }
        }
    }
}
