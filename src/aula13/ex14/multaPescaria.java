package aula13.ex14;

import java.util.Scanner;

public class multaPescaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos quilos você pescou?");
        double kgPescado = scanner.nextDouble();
        double excesso = 0;
        double multa = 0;
        if(kgPescado > 50){
            excesso = kgPescado - 50;
            multa = excesso * 4;
            System.out.printf("O valor a ser pago é %.2f", multa);
        }else {
            System.out.println("Excesso = 0");
            System.out.println("Multa = 0");
        }
        scanner.close();
    }
}
