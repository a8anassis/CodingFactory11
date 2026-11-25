package gr.aueb.cf.ch7;

/**
 * Δημιουργήστε μία μέθοδο που να παίρνει ως είσοδο
 * ένα String και ένα char και να επιστρέφει το πλήθος
 * των εμφανίσεων του char μέσα στο String.
 *
 * Για, παράδειγμα αν s = "Coding Factory" και letter = 'o', η μέθοδος θα επιστρέψει 2.
 *
 * s[2] -> s.charAt(2)
 */
public class LetterCount {

    public static void main(String[] args) {

    }

    /**
     * Calculates the number of occurrences of a letter in a string.
     *
     * @param s         the string to search.
     * @param letter    the letter to count.
     * @return          the number of occurrences of the letter in the string.
     */
    public static int getLetterCount(String s, char letter) {
        if (s == null) return -1;

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }
}
