package Exercicio4;

public class ContaCorrente {
    private int numeroConta;
    private String nomeCliente;
    private double saldo;


    public ContaCorrente(int numeroConta, String nomeCliente, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public void depositoConta(double valorDepositado) {
        saldo += valorDepositado;
        System.out.println("O valor R$ " + valorDepositado + " foi depositado na conta");
    }

    public void saqueConta(double valorSacado) {
        if (valorSacado <= saldo) {
            saldo -= valorSacado;
            System.out.println("O saque foi realizado com sucesso.");
        } else {
            System.out.println("O saldo da conta é insuficiente para realizar o saque.");
        }
    }

    public void informarDadosConta() {
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Nome do correntista: " + nomeCliente);
        System.out.println("Saldo: R$" + saldo);
    }
}
