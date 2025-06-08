package Exercicios.Pratica.Ingresso;

public class Ingresso {
   protected double valor;
   protected String filme;;
   protected String Ingresso;

    protected Ingresso(){
        System.out.println("Filme: "+this.getFilme()+"\n"+
                            "Valor: "+this.getValor());
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
