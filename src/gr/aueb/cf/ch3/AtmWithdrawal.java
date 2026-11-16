package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης να εισάγει ένα ποσό για ανάληψη (πολλαπλάσιο του 20)
 * και το πρόγραμμα να αφαιρεί το ποσό από το υπόλοιπο του λογαριασμού
 * ελέγχοντας 1) όταν το ποσό είναι 0, έξοδος, 2) όταν το ποσό
 * είναι αρνητικό δεν επιτρέπεται ανάληψη, και 3) όταν το ποσό δεν
 * είναι πολλαπλάσιο του 20, δεν επιτρέπται ανάληψη, 4) όταν το ποσό
 * υπερβαίνει το υπόλοιπο, δεν επιτρέπεται ανάληψη
 */
public class AtmWithdrawal {

    public static void main(String[] args) {
        final int EXIT = 0;
        final int EURO20 = 20;
        Scanner sc = new Scanner(System.in);
        int balance = 500;
        int amount = 0;

        while (true) {
            System.out.printf("Εισάγετε ποσό ανάληψης (πολλαπλάσιο του %d), %d για έξοδο)\n", EURO20, EXIT);
            amount = sc.nextInt();

            if (amount == EXIT) {
                System.out.println("Επιλέξατε έξοδο...");
                break;
            }

            if (amount < 0) {
                System.out.println("Το ποσό πρέπει να είναι θετικό.");
                continue;
            }

            if (amount % EURO20 != 0) {
                System.out.println("Το ποσό πρέπει να είναι πολλαπλάσιο του 20.");
                continue;
            }

            if (amount > balance) {
                System.out.println("Ανεπαρκές υπόλοιπο.");
                continue;
            }

            balance -= amount;
            System.out.printf("Ανάληψη %d ευρώ (%d χαρτονομίσματα των %d)\n", amount, amount / EURO20, EURO20);
        }

        System.out.printf("\nΤο υπόλοιπο είναι: %d \u20AC",  balance);
    }
}
