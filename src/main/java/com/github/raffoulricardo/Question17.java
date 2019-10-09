package main.java.com.github.raffoulricardo;

import java.util.Scanner;

public class Question17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            }
            else if (x < 0 && y > 0) {
                System.out.println("segundo");
            }
            else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            }
            if (x > 0 && y < 0) {
                System.out.println("quarto");
            }

            x = sc.nextInt();
            y = sc.nextInt();
        }

        sc.close();
    }
}
