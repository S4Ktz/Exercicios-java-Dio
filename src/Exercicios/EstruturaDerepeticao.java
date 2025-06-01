package Exercicios;

import java.util.Scanner;

public class EstruturaDerepeticao
{
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var name = "";
        /*
        estruturas de repetição
       for(int i = 0; i< 5 ; i++;)

         */
        // Do pode ser usado abaixo
        /*
        do{

         System.out.println("Digite um nome:");
         name = scanner.nextLine();
         System.out.println(name);

         while(!name.equalsIgnoreCase("exit") break;

         */
        while (true) {
            System.out.println("Digite um nome: ");
            name = scanner.nextLine();
            System.out.println(name);

            if (!name.equalsIgnoreCase("exit")) break;
        }
    }
}
