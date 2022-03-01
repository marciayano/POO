package aula16exComposicao;
//classe principal
public class Despertador {

    boolean ligado;
    Hora alarme;

    Despertador(){
        alarme = new Hora(8, 50,0);

    }
}
