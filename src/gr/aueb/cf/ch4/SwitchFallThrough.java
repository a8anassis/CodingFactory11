package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Λαμβάνει ένα βαθμό (int) από τον χρήστη και εμφανίζει
 * κατάλληλο μήνυμα (feedback).
 */
public class SwitchFallThrough {

    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int grade = 0;

        System.out.println("Δώστε ένα βαθμό (1-10");
        grade = sc.nextInt();

        switch (grade) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Αποτυχία");
                break;
            case 5:
            case 6:
                System.out.println("Καλώς");
                break;
            case 7:
            case 8:
                System.out.println("Λίαν καλώς");
                break;
            case 9:
            case 10:
                System.out.println("Άριστα");
                break;
            default:
                System.out.println("Μη έγκυρος βαθμός");
                break;
        }

        // Arrow syntax, no break needed, >=Java14
        switch (grade) {
            case 1, 2, 3, 4 -> System.out.println("Αποτυχία");
            case 5, 6 -> System.out.println("Καλώς");
            case 7, 8 -> System.out.println("Λίαν καλώς");
            case 9, 10 -> System.out.println("Άριστα");
            default -> System.out.println("Μη έγκυρος βαθμός");
        }
    }
}
