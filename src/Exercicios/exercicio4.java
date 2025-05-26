package Exercicios;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        float altura = scanner.nextFloat();
        System.out.println("Digite seu peso: ");
        float peso = scanner.nextFloat();

        float IMC;
        IMC = peso / (altura*altura);

        System.out.println("Carregando seu IMC....");
        System.out.println("Seu IMC: " + IMC);

        if (IMC <= 18.5){
            System.out.println("abaixo do peso");
        } else if (IMC <= 29.9f) {
            System.out.println("levemente acima do peso");
        } else if (IMC <= 34.9f) {
            System.out.println("Obesidade grau |");
        } else if (IMC <= 39.9f){
            System.out.println("Obesidade Grau ||(severa)");
        } else if (IMC >= 40.0f) {
            System.out.println("Obesidade Grau ||| (Mórbida)");

        }else{
            System.out.println("Impossivel carregar");
        }


    }

}
