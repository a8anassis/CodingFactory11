package gr.aueb.cf.ch2;

/**
 * Expressions Demo.
 */
public class ExpressionsApp {

    public static void main(String[] args) {
        int wallet = 50;
        int productCost = 10;
        int productsCount = 5;
        int totalCost = 0;

        totalCost = productCost * productsCount;
        wallet -= totalCost;     // wallet = wallet - totalCost;

        productsCount++;        // productsCount += 1;  productsCount = productsCount + 1;
        productCost--;          // productCost -= 1;    productCost = productCost - 1;
        wallet += 100;          // wallet = wallet + 100;

        System.out.printf("Product count = %d, Product cost = %d\n", productsCount, productCost);
        System.out.println("Wallet: " + wallet);        // System.out.printf("Wallet: %d", wallet);
    }

}
