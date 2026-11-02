package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει έναν ακέραιο που αντιστοιχεί
 * σε ώρες (hours). Το πρόγραμμα μετατρέπει σε λεπτά
 * (minutes) και δευτερόλεπτα (seconds) και τα εκτυπώνει.
 */
public class HoursToMinSec {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        final int MINUTES_PER_HOUR = 60;
        final int SECONDS_PER_HOUR = 60 * 60;
        int inputHours = 0;
        int minutes = 0;
        int seconds = 0;

        // Data input
        System.out.println("Εισάγετε τον αριθμό των ωρών");
        inputHours = in.nextInt();

        // Process
        minutes = inputHours * MINUTES_PER_HOUR;
        seconds = inputHours * SECONDS_PER_HOUR;

        // Εκτύπωση αποτελεσμάτων
        System.out.printf("Ώρες=%d, Λεπτά=%d, Δευτερόλεπτα=%d\n", inputHours, minutes, seconds);
    }
}
