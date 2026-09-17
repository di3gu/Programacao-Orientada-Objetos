package br.org.unicesumar.exercicio3;

public class Main {
    public static void main(String[] args) {
        Animal[] animais = {
            new Cachorro("Rex"),
            new Gato("Mimi")
        };

        for (Animal animal : animais) {
            animal.fazerSom();
        }
    }
}
