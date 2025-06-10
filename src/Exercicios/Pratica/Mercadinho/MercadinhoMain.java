package Exercicios.Pratica.Mercadinho;

import java.util.Scanner;

public final class MercadinhoMain {
    private static Gerente gerente;
    private static Vendedor vendedor;
    private static Atendente atendente;

    public void Contas() {
        Conta conta = new Conta();
        Vendedor vendedor = new Vendedor();
        Atendente atendente = new Atendente();
        Gerente gerente = new Gerente();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println("Escolha uma opção");
            String escolha = scanner.next();

            switch (escolha) {
                case "1", "Relatorio" -> Gerente.GerarRelatorio();
                case "2", "Realizar Venda" -> Vendedor.realizarVenda();
                case "3", "Inserir Pagamento" -> {

                    System.out.println("Insira o Valor a ser pago: ");
                    int pagamento = Integer.parseInt(scanner.next());
                    if (atendente.Caixa) {
                        System.out.println("Caixa está aberto para pagamentos\n" +
                                "pagamento realizado com sucesso\n" +
                                "Valor do pagemento: " + pagamento);
                    } else {
                        System.out.println("Caixa fechado\n" +
                                "pagamento não pode ser realizado");
                    }
                    scanner.close();
                }
                case "4", "Sair" -> {
                    System.out.println("Fechando a loja");
                    scanner.close();
                    return;
                }
            }
        }

//     Gerente.GerarRelatorio();
//     Vendedor.realizarVenda();
//
//        System.out.println(Vendedor.RelatorioDeVendas());
    }

   public void GerenteMenu(){
       System.out.println("Nome/usuario: \n" + gerente.getUsuario() +
                         "Email: \n" + "Tipo de conta: "+gerente.isAdministrador());
       System.out.println("Relatorios de vendas \n"+ Gerente.GerarRelatorio()+"\n"+
                             "Vendas realizadas: "+ Vendedor.RelatorioDeVendas());
   }







}

