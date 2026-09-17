package br.org.unicesumar.exercicio10;

public class Eletronico extends Produto {
    private int garantia; // em meses

    public Eletronico(String nome, double preco, int garantia) {
        super(nome, preco);
        this.garantia = garantia;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Garantia: " + garantia + " meses");
    }
}
