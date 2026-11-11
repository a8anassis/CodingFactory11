package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει τις τρεις πλευρές του τριγώνου
 * και το πρόγραμμα αποφασίζει αν το τρίγωνο είναι ορθογώνιο.
 */
public class RightTriangle {

    public static void main(String[] args) {
        final double EPSILON = 0.000005;
        Scanner input = new Scanner(System.in);
        double a = 0;
        double b = 0;
        double c = 0;
        boolean isRight = false;

        System.out.println("Εισάγετε τις τρεις πλευρές του τριγώνου " +
                "(ξεκινώντας από την υποτίνουσα)");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        isRight = Math.abs(a * a - b * b - c * c) < EPSILON;

        System.out.println("Το τρίγωνο είναι ορθογώνιο: " + isRight);
    }
}
