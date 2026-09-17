package br.org.unicesumar.exercicio4;

public class ContaCorrente extends ContaBancaria {
    private double limiteCredito;

    public ContaCorrente(String titular, double saldo, double limiteCredito) {
        super(titular, saldo);
        this.limiteCredito = limiteCredito;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.printf("Limite de crédito: R$ %.2f%n", limiteCredito);
    }
}
