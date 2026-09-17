package br.org.unicesumar.exercicio2;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Ana Silva", 6000.0, 1500.0);
        Estagiario estagiario = new Estagiario("João Souza", 1200.0, 20);

        System.out.println("--- Gerente ---");
        gerente.exibirInformacoes();

        System.out.println("\n--- Estagiário ---");
        estagiario.exibirInformacoes();
    }
}
