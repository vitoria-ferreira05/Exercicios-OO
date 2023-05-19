package Exercicio6;

public class Main {
    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado(2.0);

        System.out.println("O lado do quadrado: " + quadrado.getLado());
        System.out.println("A area do quadrado: " + quadrado.calcularArea());

        quadrado.setLado(4.0);

        System.out.println("Novo lado do quadrado: " + quadrado.getLado());
        System.out.println("Nova area do quadrado: " + quadrado.calcularArea());
    }
}
