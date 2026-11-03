package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Σε ένα χώρο στάθμευσης η 1η ώρα κοστίζει 2 ευρώ (200 λεπτά)
 * και κάθε επιπλέον ώρα κοστίζει 1.5 ευρώ (150 λεπτά). Ελάχιστος
 * χρόνος στάθμευσης είναι 1 ώρα.
 *
 * Ο χρήστης εισάγει τον αριθμό των ωρών που στάθμευσε και το
 * πρόγραμμα επιστρέφει το συνολικό κόστος.
 *
 *
 *
 * Αν για παράδειγμα ο χρήστης εισάγει 6 ώρες, τότε το
 * συνολικό κόστος είναι 9 ευρώ και 50 λεπτά.
 */
public class ParkingApp {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        int inputHours = 0;
        int euros = 0;
        int cents = 0;
        int totalCostInCents = 0;
        final int FIRST_HOUR_PRICE = 200;
        final int EACH_ADDITIONAL_HOURS_COST = 150;
        final int CENTS_PER_EURO = 100;

        // Data Input
        System.out.println("Εισάγετε ώρες στάθμευσης");
        inputHours = in.nextInt();

        // Process
        totalCostInCents = FIRST_HOUR_PRICE + (inputHours - 1) * EACH_ADDITIONAL_HOURS_COST;
        euros = totalCostInCents / CENTS_PER_EURO;
        cents = totalCostInCents % CENTS_PER_EURO;

        // Εκτύπωση αποτελεσμάτων
        System.out.printf("Συνολικό κόστος στάθμευσης: %d ευρώ και %d λεπτά\n",  euros, cents);
    }
}
