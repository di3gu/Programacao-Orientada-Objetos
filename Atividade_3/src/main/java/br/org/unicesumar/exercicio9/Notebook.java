package br.org.unicesumar.exercicio9;

public class Notebook extends Eletronico {
    private int memoriaRAM;

    public Notebook(String marca, int memoriaRAM) {
        super(marca);
        this.memoriaRAM = memoriaRAM;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Memória RAM: " + memoriaRAM + "GB");
    }
}
