package br.org.unicesumar.exercicio3;

public class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void fazerSom() {
        System.out.println(nome + " diz: Au au!");
    }
}
