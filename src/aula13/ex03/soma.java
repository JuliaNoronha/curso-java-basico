package aula13.ex03;

import java.util.Scanner;

public class soma {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        int soma = num1 + num2;
        System.out.printf("A soma é: %d\n", soma);
        scanner.close();
    }
}
