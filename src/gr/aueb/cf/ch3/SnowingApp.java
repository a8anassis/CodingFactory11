package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει αν βρέχει και τη
 * θερμοκρασία και το πρόγραμμα αποφασίζει
 * αν χιονίζει. Χιονίζει σημαίνει ότι βρέχει
 * ΚΑΙ η θερμοκρασία είναι κάτω από το μηδέν,
 */
public class SnowingApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean isRaining = false;
        int temperature = 0;
        boolean isSnowing = false;

        System.out.print("Εισάγετε αν βρέχει (true/false): ");
        isRaining = in.nextBoolean();

        System.out.print("Εισάγετε τη θερμοκρασία: ");
        temperature = in.nextInt();

        isSnowing = isRaining && (temperature < 0);

        System.out.println("Χιονίζει: " + isSnowing);
    }
}
