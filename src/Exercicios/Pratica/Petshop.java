package Exercicios.Pratica;

import javax.print.attribute.standard.MediaSize;

public class Petshop {
    private int aguaL;
    private int shaampoL;
    private int quantidadePet;
    private String Pet;
    private boolean Limpo;
    private boolean maquinaLimpa;

    public void PetshopMenu(){
        System.out.println("-----> 🐶PetShop🐶 <-----\n" +
                "Quantidade de Pet na maquina: \n"+quantidadePet+
                "Litros de água: \n"+this.getAguaL() +
                "Litros de Shaampo: \n"+this.getShaampoL()+
                "Estado de Limpeza da maquina: "+ (maquinaLimpa ? "Limpa" : "Suja")+
                             "----->🐶 PetShop🐶 <-----");

    }
    public void PET() {

        boolean isLimpo = false;
        if (!isLimpo) {
            System.out.println("O pet precisa de um banho");
        } else {
            System.out.println("O pet está limpo e não precisa de um banho");
        }

    }
    public void maquinaDeBanho(){

       maquinaLimpa = true;

        //quantidade de pet/animal que pode ser colocado na maquina
        if (quantidadePet < 1){
            System.out.println("A maquina está livre ✔");
        }else{
            System.out.println("A maquina está ocupada❌\n" +
                    "quantidade de pet: "+quantidadePet);
        }

        // quantidade de água que pode ser colocada na maquina
        if (aguaL <= 30){
            System.out.println(//"Enchendo a maquina de banho\n" +
                    "quantidade de agua: "+this.aguaL);
        }else{
            System.out.println("A maquina não suporta essa quantidade de agua\n" +
                    "insira entre (10L-30L)");
        }


        // quantidade de shaampo que pode ser colocado na maquina
        if (shaampoL <= 10){
            System.out.println(//"Enchendo a maquina com Shaampo\n" +
                    "quantidade de shaampo na maquina: "+this.shaampoL);
        }else{
            System.out.println("A maquina não suporta essa quantidade de shaampo\n" +
                    "insira entre (2L-10L)");
        }

    }
    public  void limparMaquina(){
        System.out.println("Limpando a maquina...");
        aguaL -=3;
        shaampoL -=1;
        System.out.println("Limpeza da maquina concluida");
        maquinaLimpa = true;
    }
    public void reabastecerMaquina(int AbastecerAgua, int AbastecerShaampo){


        if (AbastecerAgua <= 2){
            System.out.println("Adicionando agua:"+ AbastecerAgua +"Litros");
            aguaL += AbastecerAgua;
        }else{
            System.out.println("Insira entre (1L-2L)");
        }

        if (AbastecerShaampo <= 2){
            System.out.println("Adicionando Shaampo:"+ AbastecerShaampo+"Litros");
            shaampoL += AbastecerShaampo;
        }else{
            System.out.println("Insira entre (1L- 2L)");
        }

    }
    public void retirarPet(){
        quantidadePet --;
        maquinaLimpa = false;
        System.out.println("Pet retirado da maquina");

    }

    public void banho(){

        var utilizarAgua  = aguaL -=10;
        var utilizarShaampo = shaampoL -=2;

        if (maquinaLimpa && !isLimpo() && aguaL <= 30 && shaampoL <= 10){
            System.out.println("Preparando Banho....\n" +
                    "Dando banho no Pet");
        }else if (!maquinaLimpa || aguaL < 10 || shaampoL < 2){
            System.out.println("A maquina não pode ser utilizada");
        }

    }
    public void adicionarPet(){
        quantidadePet++;

    }

    public int getAguaL() {
        return aguaL;
    }

    public void setAguaL(int aguaL) {
        this.aguaL = aguaL;
    }

    public int getShaampoL() {
        return shaampoL;
    }

    public void setShaampoL(int shaampoL) {
        this.shaampoL = shaampoL;
    }

    public int getQuantidadePet() {
        return quantidadePet;
    }

    public void setQuantidadePet(int quantidadePet) {
        this.quantidadePet = quantidadePet;
    }

    public String getPet() {
        return Pet;
    }

    public void setPet(String pet) {
        Pet = pet;
    }

    public boolean isLimpo() {
        return Limpo;
    }

    public void setLimpo(boolean limpo) {
        Limpo = limpo;
    }
}
