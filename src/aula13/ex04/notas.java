package aula13.ex04;

import java.util.Scanner;

public class notas {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vamos calcular a média das notas bimestrais.");

        System.out.println("Qual a sua nota do primeiro bimestre? ");
        int nota1 = scanner.nextInt();

        System.out.println("Qual a sua nota do segundo bimestre? ");
        int nota2 = scanner.nextInt();

        System.out.println("Qual a sua nota do terceiro bimestre? ");
        int nota3 = scanner.nextInt();

        System.out.println("Qual a sua nota do quarto bimestre? ");
        int nota4 = scanner.nextInt();

        int media = (nota1 + nota2 + nota3 + nota4)/4;

        System.out.printf("A sua média é: %d\n", media);
        scanner.close();
    }
}
