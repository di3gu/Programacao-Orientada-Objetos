package br.org.unicesumar.exercicio1;

public class Carro extends Veiculo {
    private int numeroPortas;

    public Carro(String marca, String modelo, int numeroPortas) {
        super(marca, modelo);
        this.numeroPortas = numeroPortas;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Número de portas: " + numeroPortas);
    }
}
