package br.org.unicesumar.exercicio10;

public class Produto {
    protected String nome;
    protected double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void exibirInformacoes() {
        System.out.printf("Produto: %s | Preço: R$ %.2f%n", nome, preco);
    }
}
