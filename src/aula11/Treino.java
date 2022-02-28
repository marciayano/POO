package aula11;
/*
Classes abstratas == Super classe/ classe pai São feitas para serem modelos de suas sub classes.
ex. super classe: animal subclasse: cao. vamos instanciar cao1, cao2, cao3, mas nao faz sentido instanciar animal1, 2...
no UML coloca <<abstract>> em cima do nome da classe.
se colocamos um metodo da super classe como abstratos quer dizer que ela mesma nao vai utilizar, ela e so um molde
o metodo abstrato obriga a sobreescrita na subclasse, como um contrato.
podemos ter metodo abstrato ou nao. so classe abstrata pode ter metodo abstrato.
mesmo abstrata ela continua sendo uma super classe como ja estudamos antes
e pode ter construtor, assim podemos reutilizar codigo quando alguma classe herdar

Ligacao dinamica/ dynamic binding
Doberman cachoro = new Doberman();// referencia/variavel Doberman, objeto Doberman ambos sao igual, mas podem ser diferentes
Em linguagens que não são tipadas, a referência e o objeto podem ser de qualquer tipo, em linguagens fortemente tipadas como Java,
o objeto deve ser de uma classe que tenha um relacionamento do tipo "é um" sobre a referência.
Cachorro cachorro = new Doberman; //cachorro != Doberman, mas atende a condicao "é um"
Cachorro cachorro = new Poodle(); //tb ok. ps. Cachorro nao e classe abtrata
Doberman cachorro = new Cachorro();//nesse caso nao ok..

Polimorfismo
É a capacidade do mesmo objeto de se comportar como outro.
Em outras palavras, é a capacidade de um objeto funcionar de várias maneiras.

Casting
Cachorro cachorro = new Doberman;
Para forçar esse novo objeto chamado cachorro a ser um Doberman, usamos o casting.
Dessa forma, podemos invocar os próprios métodos do Doberman.

Classe Abstrata                  vs                 Classe concreta:
Geralmente tem implementação                        Elas sempre têm uma implementação
parcial ou nenhuma implementação.                   completa de seu comportamento.

Elas não podem ser instanciadas.                    Elas podem ser instanciadas.

Pode conter métodos abstratos.                      Elas não podem conter métodos abstratos.

Têm que ser estendidos (extends)
para que sua existência tenha sentido.



*/
public abstract class Treino {

    //metodo
    public abstract String treinar();

}
