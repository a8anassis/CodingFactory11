package gr.aueb.cf.ch4;

/**
 * Εκτυπώνει κάθε iteration number μέσα
 * σε μια for.
 */
public class ForApp {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int j = 10; j >= 1; j--) {
            System.out.print(j + " ");
        }
    }
}
