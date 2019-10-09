package main.java.com.github.raffoulricardo.variable;

import java.util.Scanner;

public class ConversionToDollar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos reais eu tenho? R$");
        double reais = sc.nextDouble();
        double dolares = 3.98;
        System.out.printf("Posso ter US$ " + "%.2f", reais / dolares);

        sc.close();
    }
}
