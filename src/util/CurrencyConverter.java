package util;

public class CurrencyConverter {

    public static final double IOF = 6.00 / 100.00;

    public static double amountPaid(double dollarMultiplication) {
        return dollarMultiplication + (IOF * dollarMultiplication);
    }

}
