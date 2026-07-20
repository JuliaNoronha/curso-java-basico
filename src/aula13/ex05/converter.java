package aula13.ex05;

import java.util.Scanner;

public class converter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos converter metro em cm. Digite a metragem:");
        int metro = sc.nextInt();

        int conversao = metro * 100;
        System.out.printf("A conversão é: %d\n", conversao);
        sc.close();
    }
}
