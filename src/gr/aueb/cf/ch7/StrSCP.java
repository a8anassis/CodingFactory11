package gr.aueb.cf.ch7;

/**
 * SCP (String Constant Pool) is a special memory area in the heap where
 * string literals are stored. SCP works due to the immutability of strings
 */
public class StrSCP {

    public static void main(String[] args) {
        String s1 = "Coding Factory";
        String s2 = "Coding Factory";

        s2 = "Coding Plus";     // no side effect for s1, because strings are immutable
    }
}
