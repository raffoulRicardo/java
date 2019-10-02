package course;

import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program24 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double dollarsBought = sc.nextDouble();

        double dollarMultiplication = dollarPrice * dollarsBought;

        double total = CurrencyConverter.amountPaid(dollarMultiplication);

        System.out.printf("Amount to be paid in reais = %.2f%n", total);

        sc.close();
    }
}
