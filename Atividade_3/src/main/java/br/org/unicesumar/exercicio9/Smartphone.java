package br.org.unicesumar.exercicio9;

public class Smartphone extends Eletronico {
    private String sistemaOperacional;

    public Smartphone(String marca, String sistemaOperacional) {
        super(marca);
        this.sistemaOperacional = sistemaOperacional;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Sistema Operacional: " + sistemaOperacional);
    }
}
