package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει το άθροισμα των βαθμών σε
 * κάποια μαθήματα καθώς και το πλήθος των μαθημάτων
 * και το πρόγραμμα υπολογίζει τον μέσο όρο και στη
 * συνέχεια με βάση τον μέσο όρο, δίνει στο χρήστη το
 * ακόλουθο feedback: 9-10 Άριστα, 7-8 Πολύ καλά,
 * 5-6 Καλά, <5 Αποτυχία. Υποθέτουμε ότι οι βαθμοί
 * είναι στην κλίμακα 0-10
 *
 * Αν άθροισμα των βαθμών είναι -1 τότε έξοδος
 *
 * Data Rules (Validate)
 *      Το άθροισμα των βαθμών δεν είναι αρνητικό
 *      Το πλήθος των μαθημάτων δεν μπορεί να είναι αρνητικό ή μηδέν
 *
 * Rule (invariant)
 *      Ο μέσος όρος πρέπει να είναι μεταξύ 0-10
 */
public class GradesApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int totalMarks = 0;
        int modulesCount = 0;
        int average = 0;

        while (true) {
            System.out.println("Εισάγετε το άθροισμα των βαθμών (-1 για έξοδο)");
            totalMarks = sc.nextInt();

            if  (totalMarks == -1) {
                System.out.println("Επιλέξατε έξοδο...");
                break;
            }

            if (totalMarks < 0) {
                System.out.println("Το άθροισμα των βαθμών πρέπει να είναι θετικός.");
                continue;
            }

            System.out.println("Εισάγετε το πλήθος των μαθημάτων");
            modulesCount = sc.nextInt();

            if (modulesCount <= 0) {
                System.out.println("Το πλήθος των μαθημάτων πρέπει να είναι θετικός");
                continue;
            }

            average = totalMarks / modulesCount;

            if (average > 10 ) {            // || average < 0
                System.out.println("Ο μέσος όρος πρέπει να είναι μεγαλύτερος ή ίσος από το 0 " +
                        "και μικρότερος ίσος από 10");
                continue;
            }

            if (average >= 9) {
                System.out.println("Άριστα");
            } else if (average >= 7) {
                System.out.println("Πολύ καλά");
            } else if (average >= 5) {
                System.out.println("Καλά");
            } else {
                System.out.println("Αποτυχία");
            }






        }
    }
}
