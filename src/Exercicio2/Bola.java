package Exercicio2;

public class Bola {
    private double circunferencia;
    private String cor;
    private String marca;
    private String material;
    private int velocidade;

    public Bola(double circunferenciaBola, String corBola, String marcaBola, String materialBola, int velocidadeBola){
            this.circunferencia = circunferenciaBola;
            this.cor = corBola;
            this.marca = marcaBola;
            this.material = materialBola;
            this.velocidade = velocidadeBola;
    }

    public void trocarCor(String corNova){
        cor = corNova;
    }

    public void mostraCor() {
        System.out.println("A cor da bola é: " + cor);
    }
}
