package Exercicios.Pratica.Mercadinho;

import java.util.Scanner;

public final class Atendente extends Conta {
    Scanner scanner = new Scanner(System.in);
    int ValorDoCaixa;

    @Override
    public void setAdministrador(boolean administrador) {
        super.setAdministrador(administrador = false);
    }

    public void AtendenteLogin() {
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




    public int getValorDoCaixa() {
        return ValorDoCaixa;
    }

    public void setValorDoCaixa(int valorDoCaixa) {
        ValorDoCaixa = valorDoCaixa;
    }
}
