package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει έναν ακέραιο. Το πρόγραμμα
 * υπολογίζει το απόλυτο του ακεραίου. Το απόλυτο
 * ενός ακεραίου είναι πάντα θετικός.
 *
 * Για παράδειγμα, το απόλυτο του -5 είναι 5, ενώ
 * το απόλυτο του 5 είναι 5.
 */
public class AbsApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int abs = 0;

        System.out.print("Εισάγετε ένα ακέραιο: ");
        num = sc.nextInt();

        System.out.println("Το απόλυτο του " + num + " είναι: " + abs);
    }
}
