package aula13.ex12;

import java.util.Scanner;

public class pesoIdeal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual a sua altura?");
        double altura = scanner.nextDouble();

        double pesoIdeal = (72.7 * altura)-58;
        System.out.printf("O seu peso ideal é %.2f\n", pesoIdeal);
        scanner.close();
    }
}
