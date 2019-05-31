package course;

import java.util.Scanner;

public class Program16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int idade = calculaIdade(sc);
        System.out.println("Minha idade será: " + idade);

        sc.close();
    }

    private static int calculaIdade(Scanner sc) {
        System.out.println("Em que ano nós estamos?");
        int anoAtual = sc.nextInt();
        System.out.println("Em que ano eu nasci?");
        int anoNascimento = sc.nextInt();
        return anoAtual - anoNascimento;
    }
}
