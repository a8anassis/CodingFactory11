package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει ένα ακέραιο που
 * αναπαριστά θερμοκρασία. Το πρόγραμμα
 * αποφασίζει αν η θερμοκρασία είναι < 0 ή όχι
 * και αποθηκεύει το αποτέλεσμα σε μία μεταβλητή
 * boolean έστω isTempBelowZero.
 */
public class TemperatureApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temperature = 0;
        boolean isTempBelowZero = false;

        System.out.println("Εισάγετε τη θερμοκρασία (ακέραια τιμή)");
        temperature = in.nextInt();

        isTempBelowZero = temperature < 0;

        System.out.println("Η θερμοκρασία είναι κάτω από το μηδέν: " +  isTempBelowZero);
    }
}
