package aula14Mesa;

import java.util.ArrayList;
import java.util.Collections;

public class Equipe {

    private String nome;
    //aqui precisamos indicar a relacao 1:N (um para muitos) e ja inicializa o construtor
    private ArrayList<Jogador> listaJogadores = new ArrayList<>();


    //construtor so precisa colocar atributo nome.
    public Equipe(String nome){
        this.nome = nome;
    }
    //metodos
    public void addJogador(Jogador jogador){
        listaJogadores.add(jogador);//add possui duas assinaturas uma que recebe so o objeto, e outra que recebe o objeto e a posicao (se escolhemos usar esta opcao, e a posicao que vamos inserir ja estiver ocupada ele apaga o antigo e salva o novo, sobreEscreve. Por isso, cuidado)
    }
    //aqui pede para ordenar os titulares do maior para menor, por isso que criamos o compareTo no classe Jogador qm eh maior e menor.
    public void mostrarJogadoresTitulares(){
        //vamos precisar de get set lesionados, titulares, nome, numCamisa
        //for ou foreach
        Collections.sort(listaJogadores);
        for(Jogador jogador: listaJogadores){
            if(jogador.isTitular()){
                System.out.println("Nome: "+jogador.getNome()+" Numero camisa: "+jogador.getNumCamisa());
            }
        }
    }

    //jogadores ser titular e estar lesionado
    public int getQuantidadeJogadoresLesionados(){
        int contador = 0;
        for(Jogador jogador: listaJogadores){
            if(jogador.isLesionado()&& jogador.isTitular()){
                contador++;
            }
        }return contador;
    }
}
