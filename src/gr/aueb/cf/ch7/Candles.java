package gr.aueb.cf.ch7;

/**
 * Δίνεται ένας πίνακας με τα ύψη κεριών (π.χ. {3, 2, 1, 3}).
 * Μετρήστε πόσα κεριά έχουν το μέγιστο ύψος.
 *
 * Για παράδειγμα, είσοδος: {4, 4, 1, 3}
 * Έξοδος: 2 (υπάρχουν δύο κεριά με ύψος 4, το μέγιστο ύψος είναι 4).
 */
public class Candles {

    public static void main(String[] args) {
        int[] candles = {5, 5, 1, 3, 4, 5, 1, 4};
        System.out.println(candlesCount(candles));
    }

    public static int candlesCount(int[] candles) {
        int maxHeight = candles[0];
        int count = 0;

        for  (int i = 1; i < candles.length; i++) {
            if (candles[i] > maxHeight) {
                maxHeight = candles[i];
            }
        }

        for (int height : candles) {
            if (height == maxHeight) count++;
        }

        return count;
    }


}
