package aula13.ex15;

import java.util.Scanner;

public class salario_v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanto você ganha por hora e quantas horas trabalhou esse mês?");
        double ganhoPorHora = scanner.nextDouble();
        double horasTrabalhadas = scanner.nextDouble();
        double salario = ganhoPorHora * horasTrabalhadas;
        double impostoDeRenda = 0.11 * salario;
        double inss = 0.08 * salario;
        double sindicato = 0.05 * salario;

        System.out.println("Salário Bruto = " + salario);
        System.out.println("INSS = " + inss);
        System.out.println("impostoDeRenda = " + impostoDeRenda);
        System.out.println("Sindicato = " + sindicato);

        double salarioLiquido = salario - inss - impostoDeRenda - sindicato;
        System.out.printf("Salário Líquido = %.2f", salarioLiquido);

        scanner.close();
    }
}
