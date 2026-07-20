package aula13.ex06;

import java.util.Scanner;

public class circulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o raio do círculo?");
        double raio = scanner.nextDouble();
        double pi = 3.14;
        double area = pi * (Math.pow(raio, 2));
        System.out.printf("Área do círculo é %f\n", area);
        scanner.close();
    }
}
