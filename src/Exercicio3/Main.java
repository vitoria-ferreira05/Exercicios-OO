package Exercicio3;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Joao", 17, 69.6, 1.78);

        pessoa.informarDadosDaPessoa();

        pessoa.getEnvelhecer();
        pessoa.getEmagrecer(2.0);
        pessoa.getEngordar(1.0);
        pessoa.getCrescer(1.0);
        pessoa.informarDadosDaPessoa();
    }
}
