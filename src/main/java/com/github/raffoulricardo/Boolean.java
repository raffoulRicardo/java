package main.java.com.github.raffoulricardo;

import java.util.Scanner;

public class Boolean {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro lado: ");
        double L1 = sc.nextDouble();
        System.out.println("Digite o segundo lado: ");
        double L2 = sc.nextDouble();
        System.out.println("Digite o terceiro lado: ");
        double L3 = sc.nextDouble();

        boolean TRI = (L1 < L2 + L3) && (L2 < L1 + L3) && (L3 < L1 + L2);
        boolean EQ = (L1 == L2) && (L2 == L3);
        boolean ES = (L1 != L2) && (L2 != L3) && (L1 != L3);

        System.out.println("O triângulo é Equilátero? " + EQ);
        System.out.println("O triângulo é Escaleno? " + ES);
        System.out.println("Pode formar uma Triângulo? " + TRI);

        sc.close();
    }
}
