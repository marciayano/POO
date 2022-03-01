package aula14Mesa2;

import java.util.ArrayList;
import java.util.Collections;

public class Porto {

    private String nomePorto;
    private ArrayList<Container> listaContainers = new ArrayList<>();

    public Porto(String nomePorto) {this.nomePorto = nomePorto;};

    public void addContainer(Container container) {listaContainers.add(container);}

    public void mostrarContainers(){
        Collections.sort(listaContainers);

        for (Container container: listaContainers){
            System.out.println("ID Container: " + container.getNumId() + " PaÃ­s de origem: " + container.getPais());
        }
    }

    public int containersPerigosos(){
        int contador = 0;
        for (Container container: listaContainers) {
            if (container.isPerigoso() || container.getPais()=="Desconhecido") {
                contador++;
            }
        }
        return contador;
    }
}
