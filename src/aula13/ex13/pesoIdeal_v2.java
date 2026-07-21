package aula13.ex13;

import java.util.Scanner;

public class pesoIdeal_v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual a sua altura?");
        double altura = scanner.nextDouble();

        System.out.println("Qual é o seu sexo? f = feminino, m = masculino");
        String sexo = scanner.next();
        double pesoIdeal = 0.0;
//        double idealMulher = 0.0;
        if (sexo.equals("M") || sexo.equals("m")){
            pesoIdeal = (72.7 * altura) - 58;
        }
        else if(sexo.equals("F") || sexo.equals("f")){
            pesoIdeal = (62.1 * altura) - 44.7;
        }
        else
            return;

        System.out.println("Qual é o seu peso atual?");
        double pesoAtual = scanner.nextDouble();
        if(pesoAtual > pesoIdeal){
            System.out.println("Está acima do peso.");
        } else if (pesoAtual < pesoIdeal) {
            System.out.println("Está abaixo do peso.");
        } else if (pesoAtual == pesoIdeal){
            System.out.println("O seu peso é o ideal.");
        }
        scanner.close();
    }
}
