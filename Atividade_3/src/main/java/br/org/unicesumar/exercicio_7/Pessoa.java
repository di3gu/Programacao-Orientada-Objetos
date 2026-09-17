package br.org.unicesumar.exercicio7;

public class Pessoa {
    protected String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
    }
}
