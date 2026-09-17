package br.org.unicesumar.exercicio1;

public class Veiculo {
    protected String marca;
    protected String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca + " | Modelo: " + modelo);
    }
}
