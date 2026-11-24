package gr.aueb.cf.ch7;

/**
 * s1 δείχνει σε νέα τιμή στο Heap, ενώ
 * το 'παλιό string' μένει χωρίς αναφορά
 * (reference) και γίνεται garbage collected.
 *
 * Επομένως, τα strings είναι immutable.
 */
public class ImmutableApp {

    public static void main(String[] args) {
        String s1 = "Coding Factory";

        s1 = "Coding Plus";
    }
}
