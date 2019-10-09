package main.java.com.github.raffoulricardo;

import java.util.Locale;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
        //código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

        int cod1, cod2, qtd1, qtd2;
        double preco1, preco2, total;

        cod1 = sc.nextInt();
        qtd1 = sc.nextInt();
        preco1 = sc.nextDouble();

        cod2 = sc.nextInt();
        qtd2 = sc.nextInt();
        preco2 = sc.nextDouble();

        total = qtd1 * preco1 + qtd2 * preco2;

        System.out.printf("VALOR A PAGAR: %.2f%n", total);

        sc.close();
    }
}
