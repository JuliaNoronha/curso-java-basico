package aula13.ex11;

import java.util.Scanner;

public class calculosMatematicos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.println("Escreva o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        System.out.println("Escreva um número real: ");
        double num3 = scanner.nextDouble();

        int dobro = (num1 * 2) * (num2/2);
        System.out.printf("Resposta A: %d\n", dobro);

        double triplo = (num1 * 3) + num3;
        System.out.printf("Resposta B: %.2f\n", triplo);

        double cubo = Math.pow(num3, 3);
        System.out.printf("Resposta C: %.2f", cubo);

        scanner.close();
    }
}
