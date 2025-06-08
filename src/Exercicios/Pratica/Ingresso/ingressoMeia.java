package Exercicios.Pratica.Ingresso;

public class ingressoMeia extends Ingresso{


    public void IngressoMeiaEntrada(){
     double Meiovalor = valor / 2;
        System.out.println("O valor da Meia entrada: "+Meiovalor);
        System.out.println("Você comprou um Ingresso de meia entrada\n");
        this.setIngresso("Meia Entrada: "+Meiovalor);
    }
}
