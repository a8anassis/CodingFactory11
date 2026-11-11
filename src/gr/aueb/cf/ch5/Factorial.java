package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει με τη χρήση μεθόδου το
 * παραγοντικό του n! = 1 * 2 * .. * n
 */
public class Factorial {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        int n = 0;
        int result = 0;

        // Data input
        System.out.println("Εισάγετε ένα θετικό ακέραιο");
        n = in.nextInt();

        // Delegation - Call the service
        result = facto(n);

        // Εκτύπωση του αποτελέσματος
        System.out.println("Το παραγοντικό του " + n + " είναι: " + result);
    }

    /**
     * Calculates the factorial of n.
     *
     * @param n     the number to calculate the factorial for.
     * @return      the factorial of n.
     */
    public static int facto(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}
