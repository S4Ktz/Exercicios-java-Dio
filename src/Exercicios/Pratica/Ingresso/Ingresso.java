package Exercicios.Pratica.Ingresso;

public class Ingresso {
   protected double valor = 15;
   protected String filme;;
   protected String Ingresso;

    protected void IngressoInteiro(){
        System.out.println("Filme: "+this.getFilme()+"\n"+
                            "Valor: "+this.getValor());
    }

    public double getValor() {
        return valor;
    }

    public int setValor(double valor) {
        this.valor = valor;
        return 0;
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
