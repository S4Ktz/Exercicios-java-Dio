package Exercicios.Pratica.Mercadinho;

import java.util.Scanner;

public class MercadinhoMain {
    Scanner scanner = new Scanner(System.in);
    Conta conta = new Conta();
    Vendedor vendedor = new Vendedor();
    Atendente atendente = new Atendente();
    Gerente gerente = new Gerente();



   public void GerenteMenu(){
       System.out.println("Nome/usuario: \n" +this.gerente.getUsuario() +
                         "Email: \n" + "Tipo de conta: "+this.gerente.isAdministrador());
       System.out.printf();
   }







}

