package br.org.unicesumar.exercicio7;

public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor("Marcos Andrade", "Matemática");
        Aluno aluno = new Aluno("Beatriz Costa", "2026001234");

        System.out.println("--- Professor ---");
        professor.exibirInformacoes();

        System.out.println("\n--- Aluno ---");
        aluno.exibirInformacoes();
    }
}
