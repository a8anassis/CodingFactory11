package gr.aueb.cf.ch5;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Demo of using and rounding with BigDecimal.
 */
public class RoundingAndBigDecimal {

    public static void main(String[] args) {
        BigDecimal bigNum = new BigDecimal("7.245678");
        BigDecimal divisor = new BigDecimal("5.56");
        BigDecimal result = BigDecimal.ZERO;

        result = bigNum.divide(divisor, 2, RoundingMode.HALF_UP);
    }
}
