package br.org.unicesumar.exercicio1;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 4);
        Moto moto = new Moto("Honda", "CB 500", "500cc");

        System.out.println("--- Carro ---");
        carro.exibirInformacoes();

        System.out.println("\n--- Moto ---");
        moto.exibirInformacoes();
    }
}
