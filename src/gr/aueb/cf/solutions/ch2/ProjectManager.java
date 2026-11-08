package gr.aueb.cf.solutions.ch2;

import java.util.Scanner;

/**
 * Distributes project work hours evenly among employees.
 * Remaining hours are assigned to the project manager.
 *
 * @author thanos
 */
public class ProjectManager {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int employees = 0;
        int hoursPerEmployee = 0;
        int remainingHours = 0;

        System.out.print("Δώστε συνολικές ώρες εργασίας: ");
        int totalHours = scanner.nextInt();

        System.out.print("Δώστε αριθμό εργαζομένων: ");
        employees = scanner.nextInt();

        hoursPerEmployee = totalHours / employees;
        remainingHours = totalHours % employees;

        System.out.println("Κάθε εργαζόμενος: " + hoursPerEmployee + " ώρες. Ώρες που περισσεύουν: " + remainingHours + ".");
    }
}
