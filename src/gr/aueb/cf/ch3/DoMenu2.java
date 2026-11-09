package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Εναλλακτικό της do .. while
 * με while (true)
 */
public class DoMenu2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while (true) {
            System.out.println("Επιλέξτε μία από τις παρακάτω επιλογές:");
            System.out.println("1. Εισαγωγή προϊόντος");
            System.out.println("2. Ενημέρωση προϊόντος");
            System.out.println("3. Διαγραφή προϊόντος");
            System.out.println("4. Αναζήτηση προϊόντος");
            System.out.println("5. Έξοδος");

            choice = sc.nextInt();

            if (choice == 5) {
                break;
            }
        }
    }
}
