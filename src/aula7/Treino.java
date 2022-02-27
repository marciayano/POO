package aula7;

import java.util.List;

/*
Existem vários tipos relacionamentos entre as classes.
As classes/objetos podem se comunicar entre si.
Isso divide responsabilidades, torna o codigo mais reutilizavel, e escalonavel.
Abaixo alguns tipos:
Associação "tem/sabe um" seta simples A -> B
            ex. Pessoa -> Endereco (Pessoa conhece endereco, mas enderecao nao sabe/nem faz ideia q Pessoa sabe, qm mora)
Agregação "usa um" losangulo vazio e seta simples A <>-> B um obj usa outro para funcionar
            ex. Zoologico contem <>-> Animal (ambas podem continuar existindo independente)
Composição "faz parte" losangulo preenchido e seta simples A <>-> B
            ex. Pessoa contem <>-> Orgao (uma delas nao faz sentido sozinha, ela depende da outra)
Generalização "é um" (proximas aulas)
Especialização (proximas aulas)

Essas relacoes nao querem dizer que existe apenas uma classe, (um para muitos ou muitos para muitos)
ex. uma pessoa pode ter muitos endereos ou um endereco podem ter relacao com muitas pessoas.
representamos um para muitos == 1 para N/*

 */
public class Treino {


    // Relac. Associacao 1 para 1, o mais simples de implementar
    public class Auto{
        private Motor motor;
        private String OutraCaracteristicaQlqr;
    }
    public class Motor {
        private String fabricante;
    }

    //Relac. Agregacao = um usa o outro para funcionar, mas podem continuar existindo sem depender do outro
    public class Computador{
        private Mouse mouse;
        private String OutraCaracteristicaQlqr;
    }
    public class Mouse{
        private String tipo;
    }

    ////Relac. Composicao = um nao existe sem o outro
    public class Televisao{
        private Tela tela;
        //usamos o construtor para criar uma tela toda vez que tiver uma televisao
        public Televisao(){
            tela = new Tela();
        }
    }
    private class Tela{
        private int polegadas;
    }

    //A forma de aplicar no codigo e igual, nao se preocupe se nao puder distinguir entre agregacao, composicao, associacao.
    //o que distingue e a cardinalidade 1:N, N:N (quando e N podemos implementar como array, lista)

    // Relac. Associacao 1 para N, relacao de colaboracao continua
    public class Dono{
        private Object Animal;
        //private List animais = Animal;
        private String OutraCaracteristicaQlqr;
    }
    public class Animal {
        private String tipo; //cao, gato, tartaruga..
        private String cor;
    }

    //Relaca. Agregacao "usa um" relacao de colaboracao temporal seta simples e pontilhada
    public abstract class TocaDisco{
        //reproduzir(Disco); esta classe recebeu o metodo disco num parametro
    }
    public class Disco {

    }

    //no UML nao colocamos o atributo da classe que esta comunicando pq ja sinalizamos com as setas
    //Apenas para reforcar:
    //a relacao de Associacao ex. Cliente "tem um" Pedido: nao tem dependencia entre eles, posso criar pedido sem ter criado Cliente e ambos funcionam independente
    //Agregacao ex. Cliente "usa um" Pedido: sem dependencia tb, mas pedido nao funciona se nao ter um cliente
    //Composicao ex. Cliente "faz parte" Pedido: nao tem como criar pedido se nao tiver cliente.
    //A forma como interpretar o negocio sera refletido no codigo.

}

