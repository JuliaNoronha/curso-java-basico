package aula13.ex10;

import java.util.Scanner;

public class toFarenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual a temperatura em Celsius?");
        double celsius = scanner.nextDouble();

        double toFarenheit = ((celsius * 1.8)+32);
        System.out.printf("A temperatura em Farenheit é de %.2f", toFarenheit);
        scanner.close();
    }
}
