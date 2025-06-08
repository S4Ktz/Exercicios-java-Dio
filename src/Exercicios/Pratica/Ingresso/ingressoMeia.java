package Exercicios.Pratica.Ingresso;

public class ingressoMeia extends Ingresso{
    public void IngressoMeiaEntrada(){
      setValor(getValor()/2);
        System.out.println("Você comprou um Ingresso de meia entrada");
        this.setIngresso("Meia Entrada");
    }
}
