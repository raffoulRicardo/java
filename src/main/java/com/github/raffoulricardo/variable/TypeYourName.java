package main.java.com.github.raffoulricardo.variable;

import java.util.Scanner;

public class TypeYourName {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu Nome:");

        String nome = sc.nextLine();

        System.out.println("Muito prazer, " + nome);

        sc.close();
    }
}
