package Exercicio1;

public class Caixa {
    private double saldo;

    public Caixa() {
        saldo = 1000.00;
    }

    public void creditar(double valor) {
        saldo += valor;
    }

    public void debitar(double valor) {
        saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }
}
