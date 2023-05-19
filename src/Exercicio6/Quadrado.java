package Exercicio6;

public class Quadrado {
        private double lado; // Tamanho do lado

        public Quadrado(double lado) {
            this.lado = lado;
        }

        public void setLado(double lado) {
            this.lado = lado;
        }

        public double getLado() {
            return lado;
        }

        public double calcularArea() {
            return lado * lado;
        }
}
