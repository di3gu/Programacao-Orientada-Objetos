package br.org.unicesumar.exercicio10;

public class Roupa extends Produto {
    private String tamanho;

    public Roupa(String nome, double preco, String tamanho) {
        super(nome, preco);
        this.tamanho = tamanho;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Tamanho: " + tamanho);
    }
}
