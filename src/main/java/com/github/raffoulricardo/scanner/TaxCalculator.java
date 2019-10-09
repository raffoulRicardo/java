package main.java.com.github.raffoulricardo.scanner;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o valor do produto?");
        double preco = sc.nextDouble();
        double imposto = (preco * 60) / 100;
        System.out.printf("O imposto será de " + "%.2f", imposto);

        sc.close();
    }
}