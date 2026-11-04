package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Μετράει το πλήθος των θετικών ακεραίων
 * που δίνει ο χρήστης. Σταματάει όταν
 * ο χρήστης δώσει αρνητικό ακέραιο (sentinel)
 */
public class PositivesApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int positivesCount = 0;

//        System.out.println("Εισάγετε ένα ακέραιο (αρνητικός για έξοδο");
//        num = sc.nextInt();
//
//        while (num >= 0) {
//            positivesCount++;
//            System.out.println("Εισάγετε ένα ακέραιο (αρνητικός για έξοδο");
//            num = sc.nextInt();
//        }

        while (true) {
            System.out.println("Εισάγετε ένα ακέραιο (αρνητικός για έξοδο");
            num = sc.nextInt();
            if (num < 0) {      // sentinel
                break;
            }
            positivesCount++;
        }

        System.out.println("Το πλήθος των θετικών είναι: " + positivesCount);
    }
}
