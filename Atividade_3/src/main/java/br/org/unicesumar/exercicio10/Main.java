package br.org.unicesumar.exercicio10;

public class Main {
    public static void main(String[] args) {
        Roupa roupa = new Roupa("Camiseta Polo", 89.90, "M");
        Eletronico eletronico = new Eletronico("Fone de Ouvido Bluetooth", 199.90, 12);

        System.out.println("--- Roupa ---");
        roupa.exibirInformacoes();

        System.out.println("\n--- Eletrônico ---");
        eletronico.exibirInformacoes();
    }
}
