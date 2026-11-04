package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το παραγοντικό του n! = 1 * 2 * 3 * .. * n
 * όπου το n είναι ακέραιος και το εισάγει ο χρήστης.
 *
 * Παράδειγμα: 5! = 1 * 2 * 3 * 4 * 5 = 120
 */
public class FactorialApp {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int factorial = 1;
        int i = 1;

        System.out.println("Enter number: ");
        n = sc.nextInt();

        while (i <= n) {
            factorial *= i;    // factorial = factorial * i;
            i++;
        }

        System.out.printf("%d! = %d\n", n, factorial);
    }
}
