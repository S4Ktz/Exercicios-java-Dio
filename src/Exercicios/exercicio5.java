package Exercicios;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Digite um Numero: ");
        var numero1 = scanner.nextInt();

        System.out.println("Digite um numero maior que o anterior: ");
        var numero2 = scanner.nextInt();

        if (numero2 > numero1) {
           // System.out.println(numero1);
          //  System.out.println(numero2);

            if ((numero1 % 2 == 0 )) {
                System.out.println("o Numero " +numero1+ " é par");
            }else{
                System.out.printf("o Numero " +numero1+ " é impar");
            }
                if (numero2 % 2 == 0){
                    System.out.printf("o Numero "+numero2+" é par");
                }else{
                    System.out.printf("o Numero "+numero2+ " è impar");
                }


        } else {
            System.out.println("Impossivel informar numeros");
        }


    }


    }

