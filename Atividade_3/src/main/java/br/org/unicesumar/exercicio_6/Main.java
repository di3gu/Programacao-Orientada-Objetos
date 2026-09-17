package br.org.unicesumar.exercicio6;

public class Main {
    public static void main(String[] args) {
        Pagamento p1 = new PagamentoCartao(150.0, "1234567812345678");
        Pagamento p2 = new PagamentoBoleto(320.50, "34191.79001 01043.510047 91020.150008 1 92340000032050");

        System.out.println("--- Pagamento com Cartão ---");
        p1.exibirInformacoes();

        System.out.println("\n--- Pagamento com Boleto ---");
        p2.exibirInformacoes();
    }
}
