package main.java.com.github.raffoulricardo;

import java.util.Scanner;

public class Question18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número: ");

        int x = sc.nextInt();

        System.out.println("Informe outro número: ");

        int y = sc.nextInt();

        int s = x + y;

        System.out.println("A soma entre " + x + " e " + y + " é igual a " + s + "!");

        sc.close();
    }
}
