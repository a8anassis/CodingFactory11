package gr.aueb.cf.ch7;

/**
 *
 */
public class StrEqualAndCompare {

    public static void main(String[] args) {
        String s1 = "Coding Factory";
        String s2 = "Coding Factory";

        System.out.println(s1 == s2);       // ισότητα δεικτών
        System.out.println(s1.equals(s2));  // ισότητα περιεχομένου με equals

        String s3 = new String("Coding Factory");
        System.out.println(s1 == s3); // false
        System.out.println(s1.equals(s3)); // true
        System.out.println(s1.equalsIgnoreCase(s3)); // true


        // compareTo
        if (s1.compareTo(s2) > 0) {
            System.out.println("s1 > s2");
        } else if (s1.compareTo(s2) < 0) {
            System.out.println("s1 < s2");
        } else {        // if s1.compareTo(s2) == 0
            System.out.println("s1 == s2");
        }
    }
}
