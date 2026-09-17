package br.org.unicesumar.exercicio6;

public class Pagamento {
    protected double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public void exibirInformacoes() {
        System.out.printf("Valor do pagamento: R$ %.2f%n", valor);
    }
}
