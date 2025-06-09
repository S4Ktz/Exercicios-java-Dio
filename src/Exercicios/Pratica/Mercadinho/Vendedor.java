package Exercicios.Pratica.Mercadinho;

import java.util.Scanner;

public non-sealed class Vendedor extends Conta  {

int quantidadeDeVendas;

    Scanner scanner = new Scanner(System.in);

    @Override
    public void setAdministrador(boolean administrador) {
        super.setAdministrador(administrador = false);
    }

    public void VendedorLogin() {

        System.out.println("Digite seu Usuario/nome: ");
        Usuario = scanner.next();

        System.out.println("Digite sua senha: ");
        senha = scanner.nextInt();
        if (senha == 12345) {
            System.out.println("senha correta");
        } else {
            System.out.println("senha incorreta");

        }


        System.out.println("Digite seu email: ");
        email = scanner.next();

        if (this.getEmail().endsWith("@gmail.com")) {
            System.out.println("Email logado com sucesso");
        } else {
            System.out.println("User@gmail invalido");
        }

        System.out.println(isAdministrador() ? "Conta Administrativa":"Conta Normal");

        scanner.close();
    }
    public void VendedorLogOff(){
        System.out.println("-----> Realizando LogOff <-----");
        email = null;
        Usuario = null;
    }

    public void alterarSenha(){
        System.out.println("Deseja alterar sua senha?(S/N) ");
        scanner.next();
        if (scanner.next().equalsIgnoreCase("s")){
            System.out.println("Altere sua senha: ");
          senha = scanner.nextInt();
            System.out.println("senha alterada com sucesso");
        }else{
            System.out.println("Sua senha não será alterada");
        }
        scanner.close();
    }

    public void alterarDados(){
        System.out.println("Deseja alterar Email?: ");
        email = scanner.next();
        switch ()
    }

    public void realizarVenda(int quantidadeDeVendas){
        System.out.println("-----> Realizando Vendas...🚚💨 <-----" +"\n"+
                             "Vendas realizada com sucesso");

    }
    public int getQuantidadeDeVendas() {
        return quantidadeDeVendas;
    }

    public void setQuantidadeDeVendas(int quantidadeDeVendas) {
        this.quantidadeDeVendas = quantidadeDeVendas;
    }
}
