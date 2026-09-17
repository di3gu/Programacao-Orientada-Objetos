package br.org.unicesumar.exercicio1;

public class Moto extends Veiculo {
    private String cilindrada;

    public Moto(String marca, String modelo, String cilindrada) {
        super(marca, modelo);
        this.cilindrada = cilindrada;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Cilindrada: " + cilindrada);
    }
}
