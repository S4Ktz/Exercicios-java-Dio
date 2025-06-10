package Exercicios.Pratica.Mercadinho;

import java.util.Scanner;

public non-sealed class Vendedor extends Conta  {

static int quantidadeDeVendas;

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

    public void VendedorAlterarSenha(){
        System.out.println("Deseja alterar sua senha?(S/N) ");
      var resposta = scanner.next();
        if (scanner.next().equalsIgnoreCase("s")){
            System.out.println("Altere sua senha: ");
          senha = scanner.nextInt();
            System.out.println("senha alterada com sucesso");
        }else{
            System.out.println("Sua senha não será alterada");
        }
        scanner.close();
    }

    public void VendedorAlterarDados() {

        System.out.println("Deseja alterar Email?: ");
       var resposta = scanner.next();
        if (resposta.equalsIgnoreCase("sim")){
            System.out.println("Insira seu novo email: ");
            email = scanner.next();
            if (email.endsWith("@gmail.com")){
                System.out.println("Email trocado com sucesso\n" +
                        "Novo email: "+getEmail());
            }
        }else{
            System.out.println("impossivel trocar email");
        }

        System.out.println("Deseja mudar usuario? ");
       var resposta2 = scanner.next();
        if (resposta2.equalsIgnoreCase("sim")){
            System.out.println("Digite um novo nome de usuario: ");
            Usuario = scanner.next();
            System.out.println("usuario alterado com sucesso\n" +
                    "Novo usuario: "+this.getUsuario());
        } else if (resposta2.equalsIgnoreCase("não")) {
            System.out.println("Usuario não alterado");
        }else{
            System.out.println("impossivel alterar usuario");
        }
        scanner.close();
    }

    public static void realizarVenda(int quantidadeDeVendas){
       setQuantidadeDeVendas(quantidadeDeVendas + getQuantidadeDeVendas());

        System.out.println("-----> Realizando Vendas...🚚💨 <-----" +"\n"+
                             "Vendas realizada com sucesso"+ "\n"+
                                "Vendas feitas: "+getQuantidadeDeVendas());

    }
    public static Object  RelatorioDeVendas(){
        System.out.println("-----> Gerando Relatorio De Vendas <-----");
        System.out.println("Quantidade de vendas: "+getQuantidadeDeVendas());
       return "";
    }
    public static int getQuantidadeDeVendas() {
        return quantidadeDeVendas;
    }

    public static void setQuantidadeDeVendas(int quantidadeDeVendas) {
        Vendedor.quantidadeDeVendas = quantidadeDeVendas;
    }
}
