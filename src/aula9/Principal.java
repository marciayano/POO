package aula9;

public class Principal {
    public static void main(String[] args) { //quando vamos instanciar/criar objetos fazemos na main, pq e aqui que o programa inicia
        Associado associado = new Associado("123", "Yana", 90, "Musculação");

        AssociadoHabilitado associadoHabilitado = new AssociadoHabilitado("456", "Chris",
                "Natação", 120, 50);


        System.out.println(associado); //pedido para imprimir objeto que criamos (linha 5)
        //quando pedidos para imprimir o objeto ele retorna o endereco onde esta armazenado este objeto: aula9.Associado@4617c264 e isso muda toda vez q pedir
        //por isso precisamos sobreescrever o toString = metodo da classe objeto (classe objeto e o padrao do java, toda classe que criamos herda da classe objeto)
        //quer dizer que o objeto quando criado ocupa um espaco na memoria para ficar armazenado
        System.out.println(associado.custoMensal()); // na hora que criou, colocou 90, entao aparece 90

        System.out.println(associadoHabilitado);
        System.out.println(associadoHabilitado.custoMensal());//deu 120,pq nao habilitamos ele, quando criamos um objeto boolean ele inicia como false

        associadoHabilitado.setHabilitado(true);
        System.out.println(associadoHabilitado.custoMensal());
        associadoHabilitado.setHabilitado(false);
        System.out.println(associadoHabilitado.custoMensal());
    }

}
