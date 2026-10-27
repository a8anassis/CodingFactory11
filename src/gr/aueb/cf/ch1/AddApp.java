package gr.aueb.cf.ch1;

/**
 * Προσθέτει δύο ακεραίους και εκτυπώνει
 * το αποτέλεσμα.
 */
public class AddApp {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        int num1 = 5;
        int num2 = 10;
        int result = 0;

        // Εντολές επεξεργασίας δεδομένων
        result = num1 + num2;

        // Εκτύπωση αποτελέσματος
        System.out.println("Το αποτέλεσμα είναι: " + result);
        System.out.printf("Το αποτέλεσμα είναι %d\n", result);
    }
}
