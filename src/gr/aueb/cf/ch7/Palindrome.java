package gr.aueb.cf.ch7;

/**
 * Παλινδρομική (ή καρκινική) λέξη είναι μια λέξη που διαβάζεται το ίδιο και από τα δύο άκρα.
 * Για παράδειγμα, οι λέξεις "level", "radar" και "madam".
 */
public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("level"));
        System.out.println(isPalindrome("radar"));
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("hello"));
    }

    public static boolean isPalindrome(String s) {

        for  (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindromeV2(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        return reversed.equals(s);

//        return new StringBuilder(s)
//                .reverse()
//                .toString()
//                .equals(s);
    }

}
