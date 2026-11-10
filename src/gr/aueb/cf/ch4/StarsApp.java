package gr.aueb.cf.ch4;

/**
 * Εκτυπώνει οριζόντια, κάθετα,
 * από 1...10, από 10...1, 10χ10
 * αστεράκια.
 */
public class StarsApp {

    public static void main(String[] args) {

        // Δέκα οριζόντια αστεράκια
        for (int i = 1; i <= 10; i++) {
            System.out.print("*");
        }

        // Κάθετα αστεράκια
        for (int i = 1; i <= 10; i++) {
            System.out.println("*");
        }

        // 10 x 10 αστεράκια
        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 1η γραμμή 1, 2η γραμμή 2, 3η γραμμή 3, .... 10η γραμμή 10 αστεράκια
        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 1η γραμμή 10, 2η γραμμή 9, 3η γραμμή 8, 10η γραμμή 1
        for (int i = 1; i <= 10; i++) {

            for (int j = i; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
