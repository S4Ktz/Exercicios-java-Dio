package Exercicios.Pratica;

import java.util.Scanner;

public  class Ingresso {
   private double valor;
   private String filme;;
   private String Ingresso;

    public Ingresso() {
        System.out.println("Filme: \n"+this.getFilme()+
                            "Valor: \n"+this.getValor());
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

    public String getIngresso() {
        return Ingresso;
    }

    public void setIngresso(String ingresso) {
        Ingresso = ingresso;
    }
}
