package br.org.unicesumar.exercicio8;

public class Trem extends Transporte {
    public Trem(int capacidade) {
        super(capacidade);
    }

    public void acoplarVagao() {
        System.out.println("Trem: vagão acoplado com sucesso.");
    }
}
