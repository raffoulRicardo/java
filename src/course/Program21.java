package course;

import java.util.Locale;
import java.util.Scanner;

public class Program21 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        char resp;

        do {
            System.out.print("Enter a number: ");
            double n = sc.nextDouble();
            double sq = Math.sqrt(n);
            System.out.printf("Square root = %.3f%n", sq);
            System.out.println("Repeat y/n? ");
            resp = sc.next().charAt(0);
        } while (resp != 'n');
        sc.close();
    }
}
