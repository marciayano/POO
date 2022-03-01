package aula14Mesa;
//nao precisamos criar a interface comparable pq ela eh propria do java
public class Jogador implements Comparable<Jogador> { //estamos indicando que vamos comparar o objeto Jogador, se colocar T quer dizer que eu nao sei ql tipo de objeto/classe, mas evitamos o generico por exigir mais processamento da maquina
    private int numCamisa;
    private String nome;
    private boolean lesionado;
    private boolean titular;

    public Jogador(int numCamisa, String nome, boolean lesionado, boolean titular) {
        this.numCamisa = numCamisa;
        this.nome = nome;
        this.lesionado = lesionado;
        this.titular = titular;
    }

    public boolean isLesionado() {
        return lesionado;
    }

    public void setLesionado(boolean lesionado) {
        this.lesionado = lesionado;
    }

    public boolean isTitular() {
        return titular;
    }

    public void setTitular(boolean titular) {
        this.titular = titular;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumCamisa() {
        return numCamisa;
    }

    public void setNumCamisa(int numCamisa) {
        this.numCamisa = numCamisa;
    }

    @Override
    public int compareTo(Jogador o) {
        if(o.numCamisa==this.numCamisa){
            return 0;
        }else if(this.numCamisa<o.numCamisa){//essa ordem importa o objeto que invoca num.camisa<objeto que criamos o.num camisa
            return -1;
        }else{
            return 1;
        }
    }

}
