package gr.aueb.cf.ch2;

/**
 * Typecast demo.
 */
public class TypecastApp {

    public static void main(String[] args) {
        int myInt = 10;         // int 32-bit
        long myLong = 20L;      // type suffix

        myInt = (int)myLong;    // Error-prone
        myLong = myInt;         // Αυτόματα typecast
    }
}
