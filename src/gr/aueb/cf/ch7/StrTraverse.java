package gr.aueb.cf.ch7;

/**
 * Διάσχιση (Traverse) ενός String και reverse
 * με τη χρήση της charAt().
 */
public class StrTraverse {

    public static void main(String[] args) {
        String s = "Coding Factory";

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }
        System.out.println();

        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i) + " ");
        }
        System.out.println();
        // String Traverse με την substring()
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.substring(i, i + 1) + " ");
        }
        System.out.println();

        for (char c : s.toCharArray()) {
            System.out.print(c + " ");
        }
    }
}
