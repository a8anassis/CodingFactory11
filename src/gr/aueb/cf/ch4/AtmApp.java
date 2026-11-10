package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Demo ενός Bank ATM. Εμφανίζουμε ένα μενού
 * επιλογών: Ανάληψη, Κατάθεση και το πρόγραμμα
 * υλοποιεί την επιλογή και δίνει feedback στον χρήστη.
 */
public class AtmApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 0;
        int choice = 0;
        int amount = 0;

        while (true) {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Ανάληψη");
            System.out.println("2. Κατάθεση");
            System.out.println("3. Έξοδος");
            System.out.println("Επιλογή:");

            choice = sc.nextInt();

            if (choice == 3) {
                System.out.println("Έξοδος...");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Εισάγετε ποσό ανάληψης: ");
                    amount = sc.nextInt();

                    if (amount <= 0) {
                        System.out.println("Το ποσό πρέπει να είναι θετικό.");
                        continue;
                    }

                    if (amount > balance) {
                        System.out.println("Ανεπαρκές υπόλοιπο.");
                        continue;
                    }

                    balance -= amount;  // balance = balance - amount;

                    System.out.println("Νέο υπόλοιπο: " + balance);
                    break;
                case 2:
                    System.out.println("Εισάγετε ποσό κατάθεσης");
                    amount = sc.nextInt();

                    if (amount <= 0) {
                        System.out.println("Το ποσό κατάθεσης πρέπει να είναι θετικό");
                        continue;
                    }

                    balance += amount;

                    System.out.println("Νέο υπόλοιπο: " +  balance );
                    break;
                default:
                    System.out.println("Λάθος επιλογή");
                    break;
            }
        }

        System.out.println("Ευχαριστούμε που χρησιμοποιήσατε την εφαρμογή.");
    }
}
