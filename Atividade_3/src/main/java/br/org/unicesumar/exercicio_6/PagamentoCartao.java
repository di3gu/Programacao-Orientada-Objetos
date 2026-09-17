package br.org.unicesumar.exercicio6;

public class PagamentoCartao extends Pagamento {
    private String numeroCartao;

    public PagamentoCartao(double valor, String numeroCartao) {
        super(valor);
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Cartão: **** **** **** " + numeroCartao.substring(numeroCartao.length() - 4));
    }
}
