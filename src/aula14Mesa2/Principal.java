package aula14Mesa2;

public class Principal {

    public static void main(String[] args){

        Container container1 = new Container(21, "Arroz", "China", false);
        Container container2 = new Container(7, "Feijão", "Brasil", false);
        Container container3 = new Container(49, "Munição", "EUA", true);
        Container container4 = new Container(2, "Roupas", "Desconhecido", true);

        Porto nomePorto = new Porto ("Buenos Aires");

        nomePorto.addContainer(container1);
        nomePorto.addContainer(container2);
        nomePorto.addContainer(container3);
        nomePorto.addContainer(container4);

        nomePorto.mostrarContainers();

        System.out.println(nomePorto.containersPerigosos());
    }
}
