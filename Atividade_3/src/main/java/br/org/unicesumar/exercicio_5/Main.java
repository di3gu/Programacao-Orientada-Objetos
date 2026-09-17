package br.org.unicesumar.exercicio5;

public class Main {
    public static void main(String[] args) {
        Forma retangulo = new Retangulo(4, 5);
        Forma circulo = new Circulo(3);

        System.out.printf("Área do retângulo: %.2f%n", retangulo.calcularArea());
        System.out.printf("Área do círculo: %.2f%n", circulo.calcularArea());
    }
}
