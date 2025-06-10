package Exercicios.Pratica.Mercadinho;

import java.util.Scanner;

public class MercadinhoMain {
    private static Gerente gerente;
    private static Vendedor vendedor;
    public void Contas() {
        Conta conta = new Conta();
        Vendedor vendedor = new Vendedor();
        Atendente atendente = new Atendente();
        Gerente gerente = new Gerente();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma opção");
        String escolha = scanner.next();
        switch (escolha){
            case "1" -> Gerente.GerarRelatorio();
            case "2" -> Vendedor.realizarVenda(10);
        }
     Gerente.GerarRelatorio();
     Vendedor.realizarVenda(10);
        System.out.println(Vendedor.RelatorioDeVendas());
    }

   public void GerenteMenu(){
       System.out.println("Nome/usuario: \n" + gerente.getUsuario() +
                         "Email: \n" + "Tipo de conta: "+gerente.isAdministrador());
       System.out.println("Relatorios de vendas \n"+ Gerente.GerarRelatorio()+"\n"+
                             "Vendas realizadas: "+ Vendedor.RelatorioDeVendas());
   }







}

