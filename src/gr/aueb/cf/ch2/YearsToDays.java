package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει την ηλικία του σε έτη (έστω ακέραιος)
 * και το πρόγραμμα επιστρέφει την ηλικία του σε ημέρες, όπου
 * θεωρούμε ότι 1 έτος είναι = με 365 ημέρες.
 */
public class YearsToDays {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        int inputAgeInYears = 0;
        int ageInDays = 0;
        final int DAYS_IN_YEAR = 366;

        // Data Input
        System.out.println("Εισάγετε την ηλικία σας σε έτη");
        inputAgeInYears = in.nextInt();

        // Process
        ageInDays = inputAgeInYears * DAYS_IN_YEAR;

        // Εκτύπωση των αποτελεσμάτων
        System.out.printf("Ηλικία σε έτη=%d, Ηλικία σε ημέρες=%d\n", inputAgeInYears, ageInDays);
    }
}
