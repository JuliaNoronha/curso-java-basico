package aula13.ex08;

import java.util.Scanner;

public class salario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanto você ganha por hora?");
        double valorHora = scanner.nextDouble();

        System.out.println("Quantas horas você trabalhou no último mês?");
        double horasTrabalhadas = scanner.nextDouble();

        double salario = valorHora * horasTrabalhadas;
        System.out.printf("Seu salário nesse mês é de %.2f reais. \n", salario);
    }
}
