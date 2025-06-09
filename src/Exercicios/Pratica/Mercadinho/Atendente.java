package Exercicios.Pratica.Mercadinho;

import java.util.Scanner;

public final class Atendente extends Conta {
    Scanner scanner = new Scanner(System.in);
    int ValorDoCaixa;
    boolean Caixa;

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

    public void ReceberPagamentos(int pagamento){
        if (Caixa){
            pagamento = getValorDoCaixa();
            System.out.println("Pagamento realizado");
            System.out.println("Valor no caixa: "+this.getValorDoCaixa());
        }else{
            System.out.println("O caixa está fechado, impossivel realizar pagamento");
        }
        pagamento = getValorDoCaixa();
        System.out.println("Valor no caixa: "+this.getValorDoCaixa());
    }
    public void Caixa(boolean Caixa ){
        if (Caixa){
            System.out.println("Caixa está aberto para pagamentos" +
                    "\n" + "Valor no caixa: "+this.getValorDoCaixa());
        }else{
            System.out.println("Caixa fechado");
            System.out.println("Impossivel realizar pagamento");
        }

    }




    public int getValorDoCaixa() {
        return ValorDoCaixa;
    }

    public void setValorDoCaixa(int valorDoCaixa) {
        ValorDoCaixa = valorDoCaixa;
    }
}
