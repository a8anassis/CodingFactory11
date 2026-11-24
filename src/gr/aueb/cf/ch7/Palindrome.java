package gr.aueb.cf.ch7;

/**
 * Παλινδρομική είναι μία πρόταση (String) που
 * διαβάζεται το από την αρχή και το τέλος.
 */
public class Palindrome {

    public static void main(String[] args) {

    }

    public static boolean isPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome2(String s) {
        return new StringBuilder(s)
                .reverse()
                .toString()
                .equals(s);
    }
}
