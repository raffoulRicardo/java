package main.java.com.github.raffoulricardo;

import java.util.Scanner;

public class Program20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o valor do empréstimo?");
        double emprestimo = sc.nextDouble();
        System.out.println("Quantas parcelas?");
        double parcela = sc.nextDouble();
        double valorParcela = emprestimo / parcela;
        double valorParcelaComJuros = ((valorParcela * 20) / 100) + valorParcela;
        System.out.println("Vou pagar " + parcela + " parcelas de R$" + valorParcelaComJuros);

        sc.close();
    }
}
