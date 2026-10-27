package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει δύο ακεραίους από το stdin (keyboard)
 * και υπολογίζει το άθροισμα και το εκτυπώνει.
 */
public class AddScannerApp {

    public static void main(String[] args) {

        // Δήλωση και Αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        // Input
        System.out.println("Εισάγετε δύο ακεραίους");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        // Process - Επεξεργασία δεδομένων
        sum = num1 + num2;

        // Εκτύπωση αποτελεσμάτων
        System.out.printf("Το άθροισμα των %d και %d είναι %d\n",  num1, num2, sum);
    }
}
