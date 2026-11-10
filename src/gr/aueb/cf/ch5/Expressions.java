package gr.aueb.cf.ch5;

/**
 * Demo για floating point numbers.
 */
public class Expressions {

    public static void main(String[] args) {
        final double PI = 3.141592;
        int myInt = 10;
        float myFloat = 10.5f;      // type suffix -> typecast
        double myDouble = 10.5;
        double result = 0.0;

        result = myInt + myFloat + myDouble;    // auto-widening

        System.out.println("Result = " + result);
        System.out.printf("Formatted Result = %.2f\n", result);

        System.out.printf("PI: %.5e", PI);
    }
}
