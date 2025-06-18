package Exercicios.Pratica;

import java.util.ArrayList;

public class pratica1 {
    public static void main(String[] args) {


        ArrayList<String> teste = new ArrayList<String>();
        teste.add("lalalala");
        teste.add("teste");
        teste.add("Lula");
        teste.add("goku");
        teste.add("dingling");
        teste.add("ronaldinho");
        teste.add("joão");

        System.out.println("Imprimindo ArrayList");

       // for (int i = 0; i < teste.size(); i++){
           // System.out.println(teste.get(i));

        //For Melhorado
            for (String nome : teste) {
                System.out.println(nome);
            }
        }

    }

