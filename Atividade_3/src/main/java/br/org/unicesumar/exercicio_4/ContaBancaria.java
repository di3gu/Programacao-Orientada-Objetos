package br.org.unicesumar.exercicio4;

public class ContaBancaria {
    protected String titular;
    protected double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void exibirInformacoes() {
        System.out.printf("Titular: %s | Saldo: R$ %.2f%n", titular, saldo);
    }
}
