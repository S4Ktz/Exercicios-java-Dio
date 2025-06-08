package Exercicios.Pratica.Ingresso;

public class IngressoFamilia extends Ingresso {
    int membrosdafamilia;

    public void AdicionarMembro(){
        membrosdafamilia++;
    }

    public void IngressoFamiliar(){
        if (membrosdafamilia > 3){
           double valortotal = (valor * membrosdafamilia) / 5;
            System.out.println("valor do ingresso: "+valortotal+ "\n" +
                    "Você comprou o Ingresso familiar");
        }else{
            System.out.println("Erro ao comprar ingresso");
        }
    }


    public int getMembrosdafamilia() {
        return membrosdafamilia;
    }

    public void setMembrosdafamilia(int membrosdafamilia) {
        this.membrosdafamilia = membrosdafamilia;
    }
}
