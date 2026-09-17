package br.org.unicesumar.exercicio2;

public class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void exibirInformacoes() {
        System.out.printf("Nome: %s | Salário: R$ %.2f%n", nome, salario);
    }
}
