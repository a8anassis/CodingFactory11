package gr.aueb.cf.ch7;

/**
 * Traverse ένα string (και reverse) με τη
 * χρήση της charAt(i).
 */
public class StrTraverse {

    public static void main(String[] args) {
        String s = "Coding Factory";

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
        }

        // reverse string
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
    }
}
