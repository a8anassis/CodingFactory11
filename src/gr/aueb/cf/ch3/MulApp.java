package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει ένα ακέραιο έστω n και το πρόγραμμα
 * υπολογίζει το γινόμενο 1 * 2 * 3 .. .* n
 */
public class MulApp {

    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int result = 1;
        int i = 1;

        // Data input
        System.out.println("Εισάγετε ένα ακέραιο για να υπολογίσετε το γινόμενο");
        num = sc.nextInt();

        // Process
        while (i <= num) {
            result *= i;        // result = result * i
            i++;
        }

        // Εκτύπωση αποτελεσμάτων
        System.out.printf("Το γινόμενο είναι: %,d",  result);
    }
}
