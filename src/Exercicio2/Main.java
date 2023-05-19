package Exercicio2;

public class Main {
    public static void main(String[] args) {
        Bola bola = new Bola(66,"verde","penalty","microfibra",130 );

        //vai mostrar a cor anterior e a nova cor
        bola.mostraCor();
        bola.trocarCor("Azul");
        bola.mostraCor();
    }
}
