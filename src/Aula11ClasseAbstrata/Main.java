package Aula11ClasseAbstrata;

public class Main {
    public static void main(String[]args){
        Cachorro tibi = new Cachorro ("tibi", 1);
        tibi.correr();
        tibi.emitirSom();

        Cavalo tod = new Cavalo("tod", 3);
        tod.correr();
        tod.emitirSom();

        Preguica zizi = new Preguica("zizi", 5);
        zizi.subirArvore();
        tod.emitirSom();
    }
}
