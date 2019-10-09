package main.java.com.github.raffoulricardo;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if (N < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NAO NEGATIVO");
        }

        sc.close();
    }
}