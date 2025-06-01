package Exercicios.Pratica;

public class Carro {
   private boolean Ligar;
   private boolean Desligar;
   private int Velocidade = 0;

    public void ligarCarro(){
     if (Ligar){
         System.out.print("O carro está ligando...\n" + "Carro ligado");
     }else{
         System.out.println("Impossivel ligar o carro");
     }
    }
    public void desligarCarro(){
        if (Desligar){
            System.out.println("Desligando carro\n"+"Carro desligado");
        }else{
            System.out.println("impossivel desligar");
        }
    }
    public void Acelerar(){
        if (isLigar()) {
            if (Velocidade < 120){
                Velocidade++;
                System.out.println("Acelerando");
            }if (Velocidade > 120){
                System.out.println("Impossivel Acelerar mais");
            }
        }else{
            System.out.println("Impossivel acelerar");
        }
    }
    public void Desacelerar(){
        if (isLigar()){
            if(Velocidade < 120){
                Velocidade--;
                System.out.println("Desacelerando");
            }
        }
    }

    public boolean isLigar() {
        return Ligar;
    }

    public void setLigar(boolean ligar) {
        Ligar = ligar;
    }

    public boolean isDesligar() {
        return Desligar;
    }

    public void setDesligar(boolean desligar) {
        Desligar = desligar;
    }

    public int getVelocidade() {
        return Velocidade;
    }

    public void setVelocidade(int velocidade) {
        Velocidade = velocidade;
    }
}
