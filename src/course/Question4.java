package course;

import java.util.Locale;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero, horas;
        double valorHora, salario;

        //numero do funcionario + hora trabalho * horas trabalhadas = salario

        numero = sc.nextInt();
        horas = sc.nextInt();
        valorHora = sc.nextDouble();
        salario = horas * valorHora;

        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f%n", salario);

        sc.close();
    }
}
