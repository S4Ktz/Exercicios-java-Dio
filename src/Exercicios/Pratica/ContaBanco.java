package Exercicios.Pratica;

import java.util.Scanner;

public class ContaBanco {
    private int saldo;
    private int ChequeEspecial;
    private int boleto;
    private int saque;

    public void ConsultarSaldo(){
        System.out.println("Seu Saldo: "+ this.getSaldo());
    }
    public void ConsultarCheque(){
        System.out.println("Seu Cheque: " + this.getChequeEspecial());
    }
    public void DepositarDinheiro(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Deposite um valor: ");
        saldo = (scanner.nextInt());

       if (getSaldo() <= 500){
           System.out.println("Cheque Especial de 50$");
           setChequeEspecial(50);
       }else{
          int saldo = this.getSaldo() % 50;
       }
    }
    public void SacarDinheiro(int saque){
       //int s = this.setSaque(getSaldo() - getSaque());
       if (getSaldo() < saque){
           System.out.println("impossivel Sacar");
       }else{
           setSaldo(getSaldo() - saque);
           System.out.println("Saque Efetuado com Sucesso");
           System.out.println("Saldo após saque: " +this.getSaldo());
       }
    }
    public void pagarBoleto(int boleto){
       // int saldo = getSaldo() - getBoleto();
        if (saldo <= boleto){
            System.out.println("Impossivel pagar Boleto");
        }else{
            setSaldo(getSaldo() - boleto);
            System.out.println("Pagamento efetuado com sucesso");
            System.out.println("Saldo após pagamento: "+this.getSaldo());
        }
    }

    public ContaBanco() {
        System.out.println(getSaldo());
        System.out.println(getBoleto());
        System.out.println(getSaque());
    }

    public static void main(String[] args) {

        ContaBanco ContaBanco = new ContaBanco();
        ContaBanco.DepositarDinheiro();
        ContaBanco.SacarDinheiro(50);



    }

    public int getSaque() {
        return saque;
    }

    public int setSaque(int saque) {
        this.saque = saque;
        return saque;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getChequeEspecial() {
        return ChequeEspecial;
    }

    public void setChequeEspecial(int chequeEspecial) {
        ChequeEspecial = chequeEspecial;
    }

    public int getBoleto() {
        return boleto;
    }

    public void setBoleto(int boleto) {
        this.boleto = boleto;
    }
}
