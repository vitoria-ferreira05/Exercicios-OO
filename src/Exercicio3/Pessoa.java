package Exercicio3;

public class Pessoa {
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Pessoa(String nome, int idade, double peso, double altura){
        this.nome = nome;
        this.idade = idade;
        this.peso = 0.0;
        this.altura = altura;
    }

    public int getEnvelhecer(){
        return idade++;
    }

    private double crescer(double crescer) {
        if (idade < 21){
            crescer(0.5);
        }
        return crescer;
    }

    public double getEngordar(double pesoAMais){
       return peso += pesoAMais;
    }
    public double getEmagrecer(double pesoAMenos){
        return peso -= pesoAMenos;
    }

    public double getCrescer(double alturaMaior){
        return altura = alturaMaior;
    }

   public void informarDadosDaPessoa(){

       System.out.println("Nome: " + nome);
       System.out.println("Idade: " + idade);
       System.out.println("Peso: " + peso + " kg");
       System.out.println("Altura: " + altura + " cm");

   }
}
