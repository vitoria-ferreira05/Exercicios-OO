package Exercicio5;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro(4, "Corsa", "Chevrolet", 2.0);
        System.out.println("Informações do carro");
        System.out.println("Portas: " + carro.getQuantidadePortas());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Potencia: " + carro.getPotencia());

        System.out.println("Informações atualizadas");
        carro.setMarca("Fiat");
        System.out.println("Nova marca: " + carro.getMarca());
        carro.setPotencia(1.0);
        System.out.println("Nova potencia: " + carro.getPotencia());
        carro.setModelo("Cronos");
        System.out.println("Novo modelo: " + carro.getModelo());
        carro.ligarCarro();
    }
}
