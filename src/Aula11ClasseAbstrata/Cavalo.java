package Aula11ClasseAbstrata;

public class Cavalo extends Animal {
    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    void emitirSom() {
        System.out.println("Relincho!");
    }

    void correr() {
        System.out.println("Estou correndo!");
    }
}