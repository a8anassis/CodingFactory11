package gr.aueb.cf.ch6;

/**
 * Traverse an array. Επίσκεψη σε κάθε στοιχείο
 * του πίνακα και εκτύπωση.
 */
public class ArrayTraverse {

    public static void main(String[] args) {
        int[] scores = { 10, 20, 30, 40, 50};

        // Traverse the array using a for loop
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");  // IndexOutOfBoundsException
        }

        System.out.println();

        // Enhanced for
        for (int num : scores) {
            System.out.print(num + " ");
        }
    }
}
