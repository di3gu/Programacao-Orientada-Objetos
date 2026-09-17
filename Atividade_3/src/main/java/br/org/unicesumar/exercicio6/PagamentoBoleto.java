package br.org.unicesumar.exercicio6;

public class PagamentoBoleto extends Pagamento {
    private String codigoBarras;

    public PagamentoBoleto(double valor, String codigoBarras) {
        super(valor);
        this.codigoBarras = codigoBarras;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Código de barras: " + codigoBarras);
    }
}
