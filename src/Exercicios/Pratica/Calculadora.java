package Exercicios.Pratica;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Insira um numero: ");
        var NumeroInserido = scanner.nextInt();

        System.out.println("Faça os calculos em +/x/%/- etc...");
        var Escolha = scanner.next();


         var x = (Escolha.equalsIgnoreCase("X")) ;

        System.out.println("insira outro numero:");
        var NumeroInserido2 = scanner.nextInt();

        var resultado = NumeroInserido + NumeroInserido2; //usando para conta de adição
        var resultado2 = NumeroInserido / NumeroInserido2; // usando para conta de divisão
        var resultado3 = NumeroInserido * NumeroInserido2; // usando para conta de Multiplicação

        switch (Escolha) {
            case "+" -> System.out.println("A soma dos valores é igual á: " + resultado);
            case "X" -> System.out.println("A Multiplicação dos valores é: " + NumeroInserido * NumeroInserido2);
            case "%" -> System.out.println("A Divisão dos valores é: " + NumeroInserido / NumeroInserido2);
            default -> System.out.println("Impossivel processar");
        }
        System.out.println("Deseja continua o calculo? (S/N)");
        var SimOuNao = scanner.next();
        var s = (SimOuNao.equalsIgnoreCase("s"));
        var n = (SimOuNao.equalsIgnoreCase("n"));

        if (SimOuNao.equals("s")){

            System.out.println("Faça os calculos em +/x/%/- etc...");
            var Escolha2 = scanner.next();
            var xx = (Escolha.equalsIgnoreCase("X")) ;

            System.out.println("insira outro numero:");
            var Numero2 = scanner.nextInt();

            var resultado4 = resultado + Numero2;

            switch (Escolha2) {
                case "+" -> System.out.println("A soma dos valores é igual á: " + resultado4 );
                case "X" -> System.out.println("A Multiplicação dos valores é:" + resultado3*Numero2);
                case "%" -> System.out.println("A Divisão dos valores é: " + resultado2 / Numero2);
                default -> System.out.println("Impossivel processar");
            }
        }else{
            System.out.println("Calculo encerrado");
        }
    }

}
