package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Απλός υπολογιστής τσέπης που εμφανίζει ένα
 * μενού με πρόσθεση, αφαίρεση, πολλ/μο, διαίρεση και
 * mod. Ο χρήστης επιλέγει, στη συνέχεια δίνει τιμές
 * εισόδου και λαμβάνει το αποτέλεσμα, μέσα σε while
 * μέχρι να επιλέξει έξοδο.
 */
public class CalculatorApp {

    public static void main(String[] args) {
        final int EXIT = 6;
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        int result = 0;
        int num1 = 0;
        int num2 = 0;

        while (true) {
            printMenu();
            choice = sc.nextInt();

            if (choice == EXIT) {
                System.out.println("Έξοδος...");
                break;
            }

            if (!isChoiceValid(choice)) {
                System.out.println("Η επιλογή πρέπει να είναι μεταξύ 1 - 5.");
                continue;
            }

            System.out.println("Εισάγετε δύο ακεραίους");
            num1 = sc.nextInt();
            num2 = sc.nextInt();

            // Delegation Design Pattern
            result = getResultOnChoice(choice, num1, num2);

            System.out.println("Το αποτέλεσμα είναι: " + result);
        }
    }

    public static void printMenu() {
        System.out.println("\nΕπιλέξτε μία από τις παρακάτω επιλογές:");
        System.out.println("1. Πρόσθεση");
        System.out.println("2. Αφαίρεση");
        System.out.println("3. Πολλαπλασιασμός");
        System.out.println("4. Διαίρεση");
        System.out.println("5. Υπόλοιπο Διαίρεσης");
        System.out.println("6. Έξοδος");
    }

    public static boolean isChoiceValid(int choice) {
        return choice >= 1 && choice <= 5;
    }

    public static int getResultOnChoice(int choice, int num1, int num2) {
        return switch (choice) {
            case 1 -> add(num1, num2);
            case 2 -> subtract(num1, num2);
            case 3 -> multiply(num1, num2);
            case 4 -> divide(num1, num2);
            case 5 -> modulo(num1, num2);
            default -> 0;
        };
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            return 0;   // επιστρέφει 0 ή μπορεί να χειριστεί διαφορετικά
        }
        return a / b;
    }

    public static int modulo(int a, int b) {
        if (b == 0) {
            return 0;   // επιστρέφει 0 ή μπορεί να χειριστεί διαφορετικά
        }
        return a % b;
    }
}
