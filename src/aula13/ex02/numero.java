package aula13.ex02;

import java.awt.*;
import java.util.Scanner;

public class numero {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual sua idade?");
        int idade = scanner.nextInt();
        System.out.println("O número informado foi " + idade);
        scanner.close();
    }
}
