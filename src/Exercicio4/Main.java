package Exercicio4;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(545486787, "João", 500.00);
        contaCorrente.informarDadosConta();

        contaCorrente.depositoConta(1000.0);
        contaCorrente.saqueConta(500.0);
        contaCorrente.informarDadosConta();

    }
}
