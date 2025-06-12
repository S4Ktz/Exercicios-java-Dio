package Exercicios.Pratica.PraticandoLambda;

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class exercicio1 {
    public static void main(String[] args) {
        //Runnable teste = () -> System.out.println("teste");
        //teste.run();


        List<String> nomes = Arrays.asList("joao", "ana", "lucas", "amanda", "alice",
                "anastacia", "alisson", "fernando");

      nomes.stream()
               .filter( nome -> nome.toLowerCase().startsWith("a"))
             .forEach(System.out::println);

    }
}
