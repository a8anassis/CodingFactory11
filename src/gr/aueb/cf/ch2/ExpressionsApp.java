package gr.aueb.cf.ch2;

/**
 * Expressions Demo
 */
public class ExpressionsApp {

    public static void main(String[] args) {
        int wallet = 50;
        int productCost = 10;
        int productsCount = 5;
        int totalCost = 0;

        totalCost = productCost * productsCount;
        wallet -= totalCost;     // wallet = wallet - totalCost;

    }

}
