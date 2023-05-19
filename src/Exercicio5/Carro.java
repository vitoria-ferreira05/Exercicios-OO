package Exercicio5;

import java.util.Scanner;

public class Carro {
    private int qtdadePortas;
    private String modelo;
    private String marca;
    private double potencia;

    public Carro(int qtdadePortas, String modelo, String marca, double potencia) {
        this.qtdadePortas = qtdadePortas;
        this.modelo = modelo;
        this.marca = marca;
        this.potencia = 2.0;
    }

    public int getQuantidadePortas() {
        return qtdadePortas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public void ligarCarro() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Você deseja ligar o carro? (sim / nao): ");
        String respostaUsuario = sc.next();
        if (respostaUsuario.equalsIgnoreCase("sim")){
            System.out.println("Seu carro está ligado");
        }else {
            System.out.println("Seu carro não está ligado");
        }

    }
}

