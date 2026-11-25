package gr.aueb.cf.ch7;

/**
 * Ένας Armstrong αριθμός είναι ένας αριθμός που ισούται με το άθροισμα των ψηφίων του,
 * καθένα από τα οποία υψώνεται στη δύναμη του αριθμού των ψηφίων.
 *
 * Για παράδειγμα, ο αριθμός 153 είναι ένας Armstrong αριθμός, επειδή:
 * 1^3 + 5^3 + 3^3 = 153
 */
public class Armstrong {

    public static void main(String[] args) {
        int number = 153;
        System.out.println(number + " is Armstrong: " + isArmstrong(number));
    }

    public static boolean isArmstrong(int num) {
        int numberOfDigits = 0;
        int temp = 0;
        int digit = 0;
        int sum = 0;

        temp = num;
        while (true) {
            numberOfDigits++;
            temp /= 10; // temp = temp / 10
            if (temp == 0) {
                break;
            }
        }

        temp = num;
        while (true) {
            digit = temp % 10;           // Get the last digit
            sum += (int) Math.pow(digit, numberOfDigits); // Add the digit raised to the power of numberOfDigits
            temp /= 10;                 // Remove the last digit
            if (temp == 0) {
                break;
            }
        }

        return sum == num;
    }
}
