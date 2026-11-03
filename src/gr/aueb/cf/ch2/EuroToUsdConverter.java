package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Ο χρήστης δίνει ένα ακέραιο ποσό σε ευρώ και
 * το πρόγραμμα το μετατρέπει σε δολάρια ΗΠΑ με
 * βάση μία ισοτιμία. Έστω 1 Ευρώ = 99 USA cents.
 *
 * Για παράδειγμα, αν ο χρήστης δώσει 100 ευρώ, τότε
 * τα συνολικά USA cents είναι 9900 και αυτό αντιστοιχεί
 * σε 99 USA Dollars και 0 USA cents.
 */
public class EuroToUsdConverter {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        final int PARITY = 99;
        final int CENTS_PER_DOLLAR = 100;

        Scanner input = new Scanner(System.in);
        int inputEuros = 0;
        int totalUsaCents = 0;
        int usaDollars = 0;
        int usaCents = 0;

        // Data Input
        System.out.println("Εισάγετε ποσό σε Ευρώ");
        inputEuros = input.nextInt();

        // Data Processing
        totalUsaCents = inputEuros * PARITY;
        usaDollars = totalUsaCents / CENTS_PER_DOLLAR;
        usaCents = totalUsaCents % CENTS_PER_DOLLAR;

        // Εκτύπωση Αποτελεσμάτων
        System.out.printf("%d ευρώ = %d USA δολάρια και %d USA cents",  inputEuros, usaDollars, usaCents);
    }
}
