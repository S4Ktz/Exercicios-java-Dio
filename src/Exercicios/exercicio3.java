package Exercicios;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        var numero = scanner.nextInt();
        var resultado = numero;
        if (numero==numero){
                System.out.println(
                       "Multiplicação de " + resultado + " : " +numero*1 + "\n"  +
                        "Multiplicação de " + resultado + " : " +numero*2 + "\n" +
                        "Multiplicação de " + resultado + " : " +numero*3 + "\n" +
                        "Multiplicação de " + resultado + " : " +numero*4 + "\n" +
                        "Multiplicação de " + resultado + " : " +numero*5 + "\n" +
                        "Multiplicação de " + resultado + " : " +numero*6 + "\n" +
                        "Multiplicação de " + resultado + " : " +numero*7 + "\n" +
                        "Multiplicação de " + resultado + " : " +numero*8 + "\n" +
                        "Multiplicação de " + resultado + " : " +numero*9 + "\n" +
                        "Multiplicação de " + resultado + " : "  +numero*10 + "\n");



        }
    }
}
