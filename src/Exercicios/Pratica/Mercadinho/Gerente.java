package Exercicios.Pratica.Mercadinho;

import java.util.Scanner;

public non-sealed class Gerente extends Conta{
    Scanner scanner = new Scanner(System.in);
    @Override
    public void setAdministrador(boolean administrador) {
        super.setAdministrador(administrador = true);
    }

    public Gerente() {
        System.out.println("Digite seu Usuario/nome: ");
        getUsuario()
    }
}
