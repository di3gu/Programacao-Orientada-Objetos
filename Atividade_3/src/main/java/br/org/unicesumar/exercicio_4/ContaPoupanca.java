package br.org.unicesumar.exercicio4;

public class ContaPoupanca extends ContaBancaria {
    private double rendimento;

    public ContaPoupanca(String titular, double saldo, double rendimento) {
        super(titular, saldo);
        this.rendimento = rendimento;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.printf("Rendimento mensal: %.2f%%%n", rendimento);
    }
}
