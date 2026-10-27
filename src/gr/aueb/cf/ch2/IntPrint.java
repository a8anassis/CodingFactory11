package gr.aueb.cf.ch2;

/**
 * Prints integers.
 */
public class IntPrint {

    public static void main(String[] args) {
        int num = 10;
        int num2 = 20;

        System.out.print(num);
        System.out.println(num);
        System.out.printf("%d\n", num);

        System.out.println("Η τιμή του num είναι: " + num);
        System.out.printf("Η τιμή του num είναι: %d\n", num);

        System.out.println("Η τιμή του num είναι: " + num + " και του num2 είναι: " + num2);
        System.out.printf("Η τιμή του num είναι %d και του num2 είναι: %d\n", num, num2);
    }
}
