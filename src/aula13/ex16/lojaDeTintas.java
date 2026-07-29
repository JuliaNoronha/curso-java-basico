package aula13.ex16;

import java.util.Scanner;

public class lojaDeTintas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos metros quadrados você irá pintar?");
        double metrosQuadrados = scanner.nextDouble();

        double litrosNecessarios = metrosQuadrados / 3.0;
        int latas = (int)(Math.ceil(litrosNecessarios/18.0));
        double pretoTotal = (double)(latas * 80.0);
        System.out.printf("A quantidade de latas é %d e o preço total é %.2f", latas, pretoTotal);
        scanner.close();
    }
}
