package gr.aueb.cf.ch3;

/**
 * Special cases of while
 * 1. Zero iterations
 * 2. One iteration
 * 3. Eternal loop
 */
public class WhileSpecialCases {

    public static void main(String[] args) {
        int i = 1;

        // Zero iterations
        while (i <= 0) {
            System.out.println("Δεν μπαίνει στη while");
            i++;
        }

        // One iteration
        while (i <= 1) {
            System.out.println("Μόνο μία!");
            i++;
        }

        while (true) {
            System.out.println("Είμαι ατέρμονο loop");
        }

    }
}
