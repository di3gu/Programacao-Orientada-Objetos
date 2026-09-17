package br.org.unicesumar.exercicio8;

public class Main {
    public static void main(String[] args) {
        Onibus onibus = new Onibus(45);
        Trem trem = new Trem(300);

        System.out.println("--- Ônibus ---");
        onibus.exibirInformacoes();
        onibus.abrirPorta();

        System.out.println("\n--- Trem ---");
        trem.exibirInformacoes();
        trem.acoplarVagao();
    }
}
