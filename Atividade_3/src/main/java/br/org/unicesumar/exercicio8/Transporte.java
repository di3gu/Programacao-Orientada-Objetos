package br.org.unicesumar.exercicio8;

public class Transporte {
    protected int capacidade;

    public Transporte(int capacidade) {
        this.capacidade = capacidade;
    }

    public void exibirInformacoes() {
        System.out.println("Capacidade: " + capacidade + " passageiros");
    }
}
