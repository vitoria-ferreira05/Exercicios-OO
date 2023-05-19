package Exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Caixa caixa = new Caixa();

        System.out.println("Valor do saldo inicial: " + caixa.getSaldo());

        System.out.println("Quantos lancamentos sera feito?");
        int lancamentos = sc.nextInt();

        String opcao = null;
        for (int i = 0; i < lancamentos; i++) {
            System.out.print("Deseja realizar um credito ou debito? ");
            opcao = sc.next();

        }

        if (opcao.equals("credito")) {
            System.out.print("Informe o valor a ser creditado: ");
            double valorCredito = caixa.getSaldo();
            caixa.creditar(valorCredito);
        } else if (opcao.equals("debito")) {
            System.out.print("Informe o valor a ser debitado: ");
            double valorDebito = caixa.getSaldo();
            caixa.debitar(valorDebito);
        }

        System.out.println("Saldo final: R$" + caixa.getSaldo());
    }
}

