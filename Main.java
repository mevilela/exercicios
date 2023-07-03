/*DESCRICAO DO EXERCICIO
Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do
titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito
inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua
conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.
Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já
o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por
exemplo).
Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger
isso. O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque
realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for
suficiente para realizar o saque e/ou pagar a taxa.
Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não
informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre
mostrando os dados da conta após cada operação.*/

/*
 * NUMERO DA CONTA -NAO ALTERA - GET
 * NOME TITULAR - PODE ALTERAR - GET SET
 * VALOR DEPOSITO INICIAL - GET SET
 * SALDO CONTA - GET
 * SAQUE - $5
 * Saque
 * Deposito
 *
 * */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Numero da conta");
        int numeroConta = sc.nextInt();
        System.out.println("Nome Titular");
        sc.nextLine();
        String titular = sc.nextLine();
        System.out.println("Deposito Inicial? Y/N");
        char resposta = sc.next().charAt(0);

        //com sobrecarga
        Conta novaConta;
        if (resposta == 'Y' || resposta == 'y'){
            System.out.println("Qual quantia?");
            double depositoInicial = sc.nextInt();
            novaConta = new Conta(numeroConta, titular, depositoInicial);
        }
        else {
            novaConta = new Conta(numeroConta, titular);
        }

        /*SEM sobrecarga
        Conta novaConta;
        double depositoInicial = 0;
        if (resposta == 'Y' || resposta == 'y'){
            System.out.println("Qual quantia?");
            depositoInicial = sc.nextInt();
            novaConta = new Conta(numeroConta, titular, depositoInicial);
        }
        else {
            novaConta = new Conta(numeroConta, titular, depositoInicial);
        }*/

        System.out.println("Nova Conta Numero = " + novaConta.getNumeroConta() + "; Titular: " + novaConta.getTitular() + "; Saldo: " + novaConta.getDepositoInicial());

        //DEPOSITO
        System.out.println("quanto quer depositar?");
        sc.nextLine();
        novaConta.setDeposito(sc.nextDouble());
        System.out.println("Novo Saldo = " + novaConta.getSaldo());

        //SAQUE
        System.out.println("quanto quer retirar?");
        sc.nextLine();
        novaConta.setSaque(sc.nextDouble());
        System.out.println("Novo Saldo = " + novaConta.getSaldo());
    }
}

class Conta {
    private int numeroConta;
    private String titular;
    private double depositoInicial;
    private double saque;
    private double deposito;
    private double saldo;
    private int taxaSaque;


    public Conta(int numeroConta, String titular, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.depositoInicial = depositoInicial;
    }
    public Conta(int numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public double getDepositoInicial() {
        return depositoInicial;
    }

    public double getSaque() {
        return saque;
    }

    public double getSaldo() {
        return saldo + depositoInicial;
    }

    public int getTaxaSaque() {
        return taxaSaque;
    }

    public double getDeposito() {
        return deposito;
    }


    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaque(double quantia){
        saldo -= quantia + 5;
    }

    public void setDeposito(double quantia){
        saldo += quantia;
    }
}

