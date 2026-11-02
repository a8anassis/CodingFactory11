package gr.aueb.cf.ch2;

/**
 * Demo on expression syntax.
 */
public class Expressions2 {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        int num1 = 20;
        int num2 = 60;
        int num3 = 25;
        int result = 0;
        int times = 10;
        int counter = 0;
        int rightDigit = 0;
        int leftDigit = 0;

        // Επεξεργασία με expressions
        result = (num1 + 20) * (num2 - 30);
        counter = times++;      // post-increment   counter -> 10, times -> 11

        counter = times;
        times++;

        counter = ++times;      // pre-increment    counter -> 11, times -> 11

        times++;
        counter = times;


        leftDigit = num3 / 10;          // η διαίρεση ακεραίων δίνει ακέραιο, απαγορεύεται η διαίρεση με το 0
        rightDigit = num3 % 10;

        // Εκτύπωση αποτελεσμάτων
        System.out.println("Result: " + result);
        System.out.println("Counter: " + counter);
        System.out.println("Left: " + leftDigit);
        System.out.println("Right: " + rightDigit);
    }
}
