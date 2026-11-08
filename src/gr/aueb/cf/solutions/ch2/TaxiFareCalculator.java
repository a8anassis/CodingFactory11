package gr.aueb.cf.solutions.ch2;

import java.util.Scanner;

/**
 * Calculates taxi fare.
 * Base fare: 3€ (300 cents) + 0.74€ (74 cents) per km.
 * All calculations in cents (int) to avoid decimals.
 *
 * @author thanos
 */
public class TaxiFareCalculator {

    public static void main(String[] args) {
        final int BASE_FARE = 300;
        final int TAXI_RATE = 74;
        Scanner scanner = new Scanner(System.in);
        int km = 0;
        int totalCents = 0;
        int euros = 0;
        int cents = 0;

        System.out.print("Δώστε απόσταση σε χιλιόμετρα: ");
        km = scanner.nextInt();

        totalCents = BASE_FARE + (TAXI_RATE * km);
        euros = totalCents / 100;
        cents = totalCents % 100;

        System.out.println("Κόστος: " + euros + " ευρώ και " + cents + " λεπτά.");
    }
}