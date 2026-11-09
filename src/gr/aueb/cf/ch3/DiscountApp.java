package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει την τιμή ενός
 * προϊόντος και το ποσοστό έκπτωσης
 * και το πρόγραμμα υπολογίζει την τελική τιμή.
 *
 * Rules:
 *      price == 0 -> Έξοδος
 *      price > 0
 *      discount >= 0 && discount <= 100
 */
public class DiscountApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = 0;
        int discount = 0;
        int finalPrice = 0;

        while (true) {

            System.out.println("Εισάγετε την τιμή του προϊόντος (Έξοδος με 0");
            price = sc.nextInt();

            if (price == 0) {
                System.out.println("Έξοδος από το πρόγραμμα");
                break;
            }

            if (price < 0) {
                System.out.println("Η τιμή δεν μπορεί να είναι αρνητική.");
                continue;
            }

            System.out.println("Εισάγετε το ποσοστό έκπτωσης (0-100");
            discount = sc.nextInt();

            if (discount < 0 || discount > 100) {
                System.out.println("Η έκπτωση πρέπει να είναι μεταξύ 0-100.");
                continue;
            }

            finalPrice = price * (100 - discount) / 100;

            System.out.println("Η τελική τιμή είναι: " + finalPrice);
        }

        System.out.println("Ευχαριστούμε που χρησιμοποιήσατε το πρόγραμμα!");
    }
}
