package main.java.com.github.raffoulricardo.variable;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A, B, sum;

        A = sc.nextInt();
        B = sc.nextInt();

        sum = A + B;

        sc.close();

        System.out.println("SOMA= " + sum);
    }
}
