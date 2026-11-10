package gr.aueb.cf.ch4;

/**
 * Demo of infinite loop.
 */
public class ForeverApp {

    public static void main(String[] args) {
        final int MAX_COUNT = 100;
        int count = 0;

        for (;;) {
            System.out.print("Forever");
            count++;
            if (count % 10 == 0) System.out.println();
            if (count == MAX_COUNT) break;
        }
    }
}
