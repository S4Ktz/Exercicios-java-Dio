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

        ArrayList<Integer> teste2 = new ArrayList<>(); // Integer -> para Numeros inteiros(int)
        ArrayList<Float> teste3 = new ArrayList<>(); // Float -> para Numeros flutuantes = 2.0 (float)
        ArrayList<Double> teste4 = new ArrayList<>(); // Double -> para Numeros flutuantes = 2.0 (double)
        ArrayList<Character> teste5 = new ArrayList<>(); // Character -> para letras (char)
        
        System.out.println("Imprimindo ArrayList");

       // for (int i = 0; i < teste.size(); i++){
           // System.out.println(teste.get(i));

        //For Melhorado
            for (String nome : teste) {
                System.out.println(nome);
            }
        }

    }

