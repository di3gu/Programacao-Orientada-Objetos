package br.org.unicesumar.exercicio4;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("Carlos Lima", 2500.0, 1000.0);
        ContaPoupanca cp = new ContaPoupanca("Fernanda Reis", 5000.0, 0.5);

        System.out.println("--- Conta Corrente ---");
        cc.exibirInformacoes();

        System.out.println("\n--- Conta Poupança ---");
        cp.exibirInformacoes();
    }
}
