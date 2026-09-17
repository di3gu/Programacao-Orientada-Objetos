package br.org.unicesumar.exercicio9;

public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("Samsung", "Android");
        Notebook notebook = new Notebook("Dell", 16);

        System.out.println("--- Smartphone ---");
        smartphone.exibirInformacoes();

        System.out.println("\n--- Notebook ---");
        notebook.exibirInformacoes();
    }
}
