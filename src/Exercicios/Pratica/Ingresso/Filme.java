package Exercicios.Pratica.Ingresso;

import java.util.Scanner;

public class Filme extends Ingresso {
    Scanner scanner = new Scanner(System.in);
    public void  filmesEmCartaz(){
        System.out.println("-----> 🎭Filmes🎭 <-----");
        System.out.println("Homem aranha");

    }
    public void escolherFilme(){
        System.out.println("Escolha um filme do cartaz: ");
        filme = scanner.nextLine();

        if(filme.equalsIgnoreCase("Homem aranha")){
            System.out.println("filme escolhido: "+getFilme());
        }else{
            System.out.println("filme invalido");
        }

    }
    public void escolherDubladoOuLegendado(){
        System.out.println("Você escolheu o filme: "+getFilme());
        System.out.println("Agora escolha se deseja dublado ou legendado: ");
        var TipoFilme = scanner.nextLine();

        if (TipoFilme.equalsIgnoreCase("Dublado")){
            System.out.println("Você escolheu um filme: "+TipoFilme);
        } else if (TipoFilme.equalsIgnoreCase("Legendado")) {
            System.out.println("Você escolheu um filme: "+TipoFilme);
        }

    }

    public static void main(String[] args) {
        Filme filme = new Filme();
        IngressoFamilia ingressoFamilia = new IngressoFamilia();
        ingressoMeia ingressoMeia = new ingressoMeia();

        ingressoMeia.IngressoMeiaEntrada();

        //filme.filmesEmCartaz();
       // filme.escolherFilme();
        //filme.escolherDubladoOuLegendado();

    }
}
