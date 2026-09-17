package br.org.unicesumar.exercicio8;

public class Onibus extends Transporte {
    public Onibus(int capacidade) {
        super(capacidade);
    }

    public void abrirPorta() {
        System.out.println("Ônibus: porta aberta para embarque/desembarque.");
    }
}
