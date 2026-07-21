package aula13.ex07;

import java.util.Scanner;

public class quadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o lado do Quadrado: ");
        int lado = scanner.nextInt();
        int areaQuadrado = lado * lado;
        System.out.printf("A área do quadrado é de %d\n", areaQuadrado);
        scanner.close();
    }
}
