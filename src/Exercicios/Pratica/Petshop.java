package Exercicios.Pratica;

public class Petshop {
    int aguaL;
    int shaampoL;
    int quantidadePet;

    public void maquinaDeBanho(){


        if (quantidadePet < 1){
            System.out.println("A maquina está livre ✔");
        }else{
            System.out.println("A maquina está ocupada❌\n" +
                    "quantidade de pet: "+quantidadePet);
        }


    }

    public void banho(){


        var utilizarAgua  = aguaL -=10;
        var utilizarShaampo = shaampoL -=2;
        

    }
}
