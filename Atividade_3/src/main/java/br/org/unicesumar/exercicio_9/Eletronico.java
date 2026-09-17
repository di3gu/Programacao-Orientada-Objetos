package br.org.unicesumar.exercicio9;

public class Eletronico {
    protected String marca;

    public Eletronico(String marca) {
        this.marca = marca;
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
    }
}
