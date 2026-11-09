package gr.aueb.cf.ch4;

/**
 * char demo.
 */
public class CharApp {

    public static void main(String[] args) {
        char ch1 = 'A';
        char ch2 = '*';
        char ch3 = ' ';

        System.out.println("ch1 = " + ch1);
        System.out.println("ch2 = " + ch2);
        System.out.println("ch3 = " + ch3);

        System.out.printf("ch1=%c, ordinal=%d\n", ch1, (int)ch1);
        System.out.printf("ch2=%c, ordinal=%d\n", ch2, (int)ch2);
        System.out.printf("ch3=%c, ordinal=%d\n", ch3, (int)ch3);
    }
}
