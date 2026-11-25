package gr.aueb.cf.ch7;

/**
 * String Substring operations.
 */
public class StrSubstring {

    public static void main(String[] args) {
        String s1 = "Coding";

        // startIndex, endIndex - 1
        String s2 = s1.substring(0, 3); // "Cod"
        String s3 = s1.substring(3);    // "ing"


        System.out.println(s2);
        System.out.println(s3);
    }
}
