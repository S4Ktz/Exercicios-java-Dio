package Exercicios;

import java.util.Scanner;

public class exercicio6 {
    /*
    * Escreva um codigo onde o usuário informa um número inicial,
    * posteriormente irá informar outros N números,
    * a execução do código irá continuar até que o número informado
    *  divido pelo primieiro número tenha resto diferente de 0 na divisão,
    * números menos que o primeiro número devem ser ignorados
    * */
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("informe o número incial: ");
        var numeroI = scanner.nextInt();
        var verify = true;
        while (verify){
            System.out.println("Informe numero para verificação: ");
            var numeroV = scanner.nextInt();
            if (numeroV < numeroI){
                System.out.println("Informe um numero maior que "+numeroI);
                continue;
            }
            var resultado = numeroV % numeroI;
             verify = resultado == 0;
            System.out.println("teste " + numeroV % numeroI + " resultado " + resultado);


        }
    }
}
