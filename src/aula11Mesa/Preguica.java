package aula11Mesa;

public class Preguica extends Animal {
    public Preguica(String nome, int idade) {

        super(nome, idade);
    }

    @Override
    void emitirSom() {
        System.out.println("ZzZz!");
    }

    void subirArvore() {
        System.out.println("Estou escalando!");
    }
}
