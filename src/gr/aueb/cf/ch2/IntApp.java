package gr.aueb.cf.ch2;

/**
 * Demo for int wrapper classes.
 */
public class IntApp {

    public static void main(String[] args) {
        System.out.printf("Type: int, Size: %d, Min: %,d, Max: %,d\n", Integer.BYTES, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("Type: byte, Size: %d, Min: %,d, Max: %,d\n", Byte.BYTES, Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("Type: short, Size: %d, Min: %,d, Max: %,d\n", Short.BYTES, Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("Type: long, Size: %d, Min: %,d, Max: %,d\n", Long.BYTES, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}
