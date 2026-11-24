package gr.aueb.cf.ch7;

/** s1 θα δείξει σε νέα θέση στο heap, ενώ το
 * 'παλιό string' μένει χωρίς αναφορά (reference)
 * και θα διαγραφεί από τον garbage collector.
 *
 * Επομένως, τα strings είναι immutable (αμετάβλητα).
 */
public class StrImmutableApp {

    public static void main(String[] args) {
        String s1 = "Coding Factory";
        s1 = "Coding Plus";
    }
}
