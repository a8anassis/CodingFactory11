package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει το base και το power και
 * το πρόγραμμα υπολογίζει και εκτυπώνει το
 * base^power.
 *
 * Για παράδειγμα, 2^10=1024.
 *  2 * 2 * 2 ... * 2 = 1024
 */
public class PowerApp {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner sc = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 1;

        // Data input
        System.out.println("Εισάγετε τη βάση και τη δύναμη:");
        base = sc.nextInt();
        power = sc.nextInt();

        // Process
        for (int i = 1; i <= power; i++) {
            result *= base;             // result = result * base
        }

        // Εκτύπωση αποτελεσμάτων
        System.out.printf("%d^%d = %d\n", base,  power, result);
    }
}
