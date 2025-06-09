package Exercicios.Pratica.Mercadinho;

import java.util.Scanner;

public non-sealed class Gerente extends Conta {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void setAdministrador(boolean administrador) {
        super.setAdministrador(administrador = true);
    }

    public void GerenteLogin() {
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

        System.out.println(isAdministrador() ? "Conta Administrativa" : "Conta Normal");

        scanner.close();

    }


    public void GerenteLogOff() {
        Usuario = null;
        email = null;
        System.out.println(this.getUsuario() +"\n" +
                            this.getEmail());
    }

    public void GerenteAlterarDados() {

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
    public void GerenteAlterarSenha(){
        
    }

    public void GerarRelatorio(){
       return ;
    }

}
