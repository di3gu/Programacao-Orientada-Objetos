package br.org.unicesumar.exercicio2;

public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, double salario, double bonus) {
        super(nome, salario);
        this.bonus = bonus;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.printf("Bônus: R$ %.2f | Salário total: R$ %.2f%n", bonus, salario + bonus);
    }
}
