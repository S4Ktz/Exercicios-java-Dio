package Exercicios.Pratica;

public class Carro {
   private boolean Ligado = false;
   private  int marcha = 0;
   private int Velocidade = 0;

    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.ligarCarro(true);
        carro.Acelerar();
    }
    public Carro() {
      this.setLigar(false);
      this.setMarcha(0);
      this.setVelocidade(0);
    }

    public void ligarCarro(boolean Ligar){
     if (Ligar){
       Ligado = true;
         System.out.print("O carro está ligando...\n" + "Carro ligado\n");
     }else{
         System.out.println("Impossivel ligar o carro");
     }
    }
    public void desligarCarro(boolean Desligar){
        if (Desligar && Velocidade ==0 && marcha==0){
            System.out.println("Desligando carro\n"+"Carro desligado");
        }else{
            System.out.println("impossivel desligar");
        }
    }
    public void Acelerar(){
        if (Ligado) {
            if (Velocidade <= 120){
                Velocidade++;
                System.out.println("Acelerando");
            }if (Velocidade >= 120){
                System.out.println("Impossivel Acelerar mais");
            }
        }else{
            System.out.println("Impossivel acelerar");
        }
    }
    public void Desacelerar(){
        if (isLigado()){
            if(Velocidade >= 0){
                Velocidade--;
                System.out.println("Desacelerando");
            }
        }else{
            System.out.println("Impossivel desacelerar");
        }
    }

   public void Marcha(int marcha, int velocidade){
       if (this.getMarcha() == 0){
           velocidade = 0;
           System.out.println("Não pode acelerar");
       }if (velocidade <= 20){
          this.setMarcha(1);
       }if (velocidade <= 40){
           this.setMarcha(2);
       }
       if (velocidade <= 60){
           this.setMarcha(3);
       }
       if (velocidade <= 80){
           this.setMarcha(4);
       }
       if(velocidade <= 100){
           this.setMarcha(5);
       }
       if (velocidade <= 120){
           this.setMarcha(6);
       }
   }
   public void Direcao(){
        if (Velocidade <= 40){
            System.out.println("Virando carro");
        }else{
            System.out.println("muito rapido pra virar");
        }
   }
    public boolean isLigado() {
        return Ligado;
    }

    public void setLigar(boolean ligado) {
        Ligado = ligado;
    }
    public int getVelocidade() {
        return Velocidade;
    }
    public void setVelocidade(int velocidade) {
        Velocidade = velocidade;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }
}
