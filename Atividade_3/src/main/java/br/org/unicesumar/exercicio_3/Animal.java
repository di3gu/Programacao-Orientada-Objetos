package br.org.unicesumar.exercicio3;

public class Animal {
    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void fazerSom() {
        System.out.println(nome + " faz um som genérico.");
    }
}
