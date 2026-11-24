package gr.aueb.cf.ch7;

/**
 * Αρχικοποίηση String. Ο πιο συχνά χρησιμοποιούμενος τύπος
 * δεδομένων.
 */
public class StrInit {

    public static void main(String[] args) {
        String s1 = "Coding Factory";
        String s2 = new String("Coding Factory");   // do not use

        System.out.println(s1);
        System.out.printf("%s\n", s1);
        System.out.println("Length: " + s1.length());
    }
}
