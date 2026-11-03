package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει ένα ακέραιο αριθμό,
 * έστω n και το πρόγραμμα υπολογίζει το
 * 1 + 2 + ... + n
 */
public class SumApp2 {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        int i = 1;

        // Data input
        System.out.println("Εισάγετε ένα ακέραιο για να υπολογίσετε το άθροισμα");
        num = sc.nextInt();

        // Process
        while (i <= num) {
            sum += i;
            i++;
        }

        // Εκτύπωση αποτελεσμάτων
        System.out.println("Το άθροισμα είναι: " + sum);

    }
}
