package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει έκταση τεμαχίου με
 * 6 δεκαδικά ψηφία και υπολογίζουμε τη
 * στρογγυλοποιημένη έκταση στα 2 δεκαδικά ψηφία.
 */
public class RoundingDoubles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double area = 0.0;
        double roundedArea = 0.0;
        double truncatedArea = 0.0;

        System.out.println("Εισάγετε την έκταση με 6 δεκαδικά ψηφία:");
        area = sc.nextDouble();

        roundedArea = Math.round(area * 100) / 100.0;
        truncatedArea = (int) (area * 100) / 100.0;

        System.out.printf("Αρχική έκταση: %.6f\n", area);
        System.out.printf("Rounded έκταση: %.2f\n", roundedArea);
        System.out.printf("Truncated έκταση: %.2f\n", truncatedArea);
    }
}
