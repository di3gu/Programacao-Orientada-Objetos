package br.org.unicesumar.exercicio7;

public class Professor extends Pessoa {
    private String disciplina;

    public Professor(String nome, String disciplina) {
        super(nome);
        this.disciplina = disciplina;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Disciplina: " + disciplina);
    }
}
