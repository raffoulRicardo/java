package main.java.com.github.raffoulricardo.variable;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é a temperatura aqui nos EUA? (°F)");
        double fahrenheit = sc.nextDouble();
        double celsius = (fahrenheit - 32) / 1.8;
        System.out.printf("No Brasil estaria " + "%.2f", celsius);

        sc.close();
    }
}
