package course;

import java.util.Scanner;

public class Program13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu Nome:");

        String nome = sc.nextLine();

        System.out.println("Muito prazer, " + nome);

        sc.close();
    }
}
