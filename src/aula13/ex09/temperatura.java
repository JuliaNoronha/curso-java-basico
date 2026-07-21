package aula13.ex09;

import java.util.Scanner;

public class temperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual a temperatura em grau Farenheit?");
        double grausF = scanner.nextDouble();

        double grausC = (5 * (grausF - 32) /9);
        System.out.printf("A temperatura em Celsius é de %.2f", grausC);
        scanner.close();
    }
}
