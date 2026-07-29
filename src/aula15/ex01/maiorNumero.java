package aula15.ex01;

import java.util.Scanner;

public class maiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva dois números");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if(num1 > num2){
            System.out.printf("O maior número é %d", num1);
        }
        else if(num2 > num1){
            System.out.printf("O maior número é %d", num2);
        }
        scanner.close();
    }
}
