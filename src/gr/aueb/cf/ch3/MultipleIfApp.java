package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υλοποιεί ένα μενού με επιλογές
 * και πολλαπλά if - else if - else
 */
public class MultipleIfApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while (true) {
            System.out.println("Επιλέξτε μία από τις παρακάτω επιλογές:");
            System.out.println("1. Προβολή προφίλ");
            System.out.println("2. Επεξεργασία προφίλ");
            System.out.println("3. Ρυθμίσεις...");
            System.out.println("4. Βοήθεια");
            System.out.println("5. Έξοδος");

            choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Επιλέξατε έξοδο");
                break;
            }

            if (choice < 1 || choice > 5) {
                System.out.println("Μη έγκυρη τιμή.");
                continue;
            }

            if (choice == 1) {
                System.out.println("Προβολή προφίλ");
            } else if (choice == 2) {
                System.out.println("Επεξεργασία προφίλ");
            } else if (choice == 3) {
                System.out.println("Ρυθμίσεις...");
            } else { // if (choice == 4)
                System.out.println("Βοήθεια");
            }
        }
    }
}
