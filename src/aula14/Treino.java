package aula14;
/*
Programação paramétrica, tipo de dado parametrico
Existem outras linguagens que incorporam esse recurso, como Ada, C ++ (por meio de modelos), D, Eiffel, Delphi, TypeScript, etc.
Alguns chamam de tipo de dado genérico, em Java é chamado: Generics.
Simplificando, Generics é sobre adiar a pergunta ''Que tipo é este objeto?''
Assim, o "tipo" do objeto fica como parâmetro que o programador irá definir ao trabalhar com aquele objeto.
para definir um tipo de dado paramétrico, usamos o "<>"

ex. um balde. Pode conter muitas coisas, sujeira, areia, água, combustível, etc.
public class Balde<T> {

   private T conteudo;
   public Balde() {   }
   public preencher(T conteudo) {   this.conteudo = conteudo;   }
   public T obterConteudo() {  return conteudo;   }
}

    Agua a = new Agua();
    Combustivel c = new Combustivel();
    Balde<Agua> b = new Balde<>();
    b.setConteudo(a);
    b.setConteudo(c); // NÃO COMPILA! Não posso colocar combustível em um balde com água!

    System.out.println(“Vou tomar” + b.obterConteudo()); // se o balde é de água, eu sempre terei água nele
    //se fosse um objeto eu poderia trocar facilmente, mas nao queremos o resultado "Vou tomar"+ combustivel;

 */


/*
Colecao = grupo de objetos/itens
usado em relacionamento 1:N (um para muitos), N:N (muitos para muitos)
eh java usamos uma interface de colecao generica: podemos armazenar qlqr tipo de objeto
e usar metodos comuns como add, remove, size(qtde), interator
a partir desse interface generica surge as interfaces filhas cada uma com funcao diferente set, list ....
interface set: contem apenas os metodos e dados da colecao
               -nao permite itens duplicados
               -para verificar duplicidade deve ter equals e hashcod implementados corretamente
interface list:permite itens duplicados
interface map: unica que nao extends da interface pai
               -associa os valores com chaves
               -chave nao duplica
               -cada chave pode ter apenas um valor

ArrayList
Pelas suas características, esta será a coleção que mais utilizaremos.
-Implementa a interface List. Armazena itens de forma contígua, portanto, tem acesso sequencial aos itens.
É muito eficiente quando temos que armazenar e acessar os elementos diretamente através de sua posição (pos).
Seus métodos mais importantes são:
-.add(Object o)-Adiciona um elemento.
-.add(Object o, int pos)-Adiciona um elemento em uma posição determinada.
-.remove(Object o)-Retira um elemento.
-.remove(int pos)-Retira um elemento em uma posição determinada.
-.get(int pos)-Obtém um elemento em uma posição determinada.
.size()-Permite conhecer a quantidade de elementos de uma lista.

LinkedList
-Implementa a interface List. Esta implementação tem mais desempenho quando precisamos fazer inserções em locais próximos ao meio da lista,
ou seja, quando estamos manipulando seus elementos, mas não é muito eficiente quando precisamos apenas adicionar ou acessar os elementos.
Nestes casos, o ArrayList é melhor escolha.
Seus métodos mais importantes são:
-.add(Object o)-Adiciona um elemento.
-.add(Object o, int pos)-Adiciona um elemento em uma posição determinada.
-.remove(Object o)-Retira um elemento.
-.remove(int pos)-Retira um elemento em uma posição determinada.
-.get(int pos)-Obtém um elemento em uma posição determinada.
-.size()-Permite conhecer a quantidade de elementos de uma lista.

HashSet
-Implementa a interface Set. Ao contrário de ArrayList e LinkedList, HashSets não pode armazenar valores duplicados ou nulos.
É a implementação com o melhor desempenho de todas, mas não garante nenhuma ordem ao percorrê-la.
Em outras palavras, quando o percorremos, os elementos não estão na ordem em que os inserimos, por isso não possui um método get.
Seus métodos mais importantes:
-.add(Object o)-Adiciona um elemento.
-.remove(Object o)-Retira um elemento.
-.size()-Permite conhecer a quantidade de elementos.

HashMap
-Implementa a interface do mapa. Os mapas são um conjunto de pares (valor-chave).
É razoável pensar que as chaves não podem ser repetidas e cada chave corresponde a apenas um valor.
Tanto no HashMap quanto no HashSet, os elementos não são armazenados na mesma ordem de inserção.
Seus métodos mais importantes são:
-.put(Object key, Object value)-Adiciona um elemento.
-.get(Object key)-Permite obter um elemento segundo a chave determinada.
-.remove(Object key)-Retira um elemento segundo a chave determinada.
-.size()-Permite conhecer a quantidade de elementos.

LinkedHashMap
-Implementa a interface do mapa. Ao contrário do HashMap, os elementos são armazenados com base na ordem de inserção.
Seus métodos mais importantes são:
-.put(Object key, Object value)-Adiciona um elemento.
-.get(Object key)-Permite obter um elemento segundo a chave determinada.
-.remove(Object key)-Retira um elemento segundo a chave determinada.
-.size()-Permite conhecer a quantidade de elementos.

LinkedHastSet
-Implementa a interface Set. Eles não podem armazenar valores duplicados ou nulos,
mas os elementos são armazenados na mesma ordem de inserção.
Com o que, ao percorrermos, veremos que os elementos estarão na mesma ordem em que foram inseridos.
É um pouco menos eficiente do que o HashSet e não tem um método get.
Seus métodos mais importantes são:
-.add(Object o)-Adiciona um elemento.
-.remove(Object o)-Retira um elemento.
-.size()-Permite conhecer a quantidade de elementos.

TreeSet
-Implementa a interface Set, mas também herda de uma classe chamada SortedSet e
isso permite que TreeSet armazene seus elementos de acordo com o valor desses elementos.
Seus métodos mais importantes são:
-.add(Object o)-Adiciona um elemento.
-.remove(Object o)-Retira um elemento.
-.size()-Permite conhecer a quantidade de elementos.

TreeMap
-Implementa a interface do mapa. Os itens são armazenados em ordem de acordo com a chave.
É importante esclarecer que eles são ordenados de acordo com a chave e não de acordo com o valor do objeto que armazenam.
Seus métodos mais importantes são:
-.put(Object key, Object value)-Adiciona um elemento.
-.get(Object key)-Permite obter um elemento segundo a chave determinada.
-.remove(Object key)-Retira um elemento segundo a chave determinada.
-.size()-Permite conhecer a quantidade de elementos.

 */

/*
Percorrendo Colecoes

Uma das maneiras de acessar uma coleção é através de um ciclo FOR:
for(int i = 0; i < nomes.size(); i++) {
   System.out.println(nomes.get(i));
}
.size() Será igual a 5. Já que temos 5 nomes armazenados na coleção.
.get() Com get obteremos o valor de cada uma das posições.

Outra maneira, é através do ciclo WHILE.
Essa forma é muito útil quando precisamos parar o ciclo antes de acessar todos os elementos.
int i = 0;
while( i < nomes.size())
{  System.out.println(nomes.get(i));
   i++; }

for / while
para encontrar "Carlos" (posicao 2, comeca a contar da posicao 0),
e uma vez encontrado, podemos sair do loop para não continuar percorrendo desnecessariamente.
                int i = 0;
   boolean encontrado = false;
while( i < nomes.size() && !encontrado){
        if(nomes.get(i) == "Carlos")
        encontrado = true;
        System.out.println(nomes.get(i));
        i++;
}
Para poder percorrer uma coleção com um ciclo for ou while,
podemos observar que necessitamos dos métodos size() e get().
Nem todas as coleções têm esses métodos, portanto, não poderemos usar essas opções em algumas coleções.
Podemos utilizar esses métodos apenas com List, ou seja, com ArrayList e LinkedList.

ITERATOR
Em java, as coleções implementam a interface Iterator, que obriga a implementar o método iterator().
Utilizar o método iterator() é uma outra maneira de termos acesso às coleções e podemos usá-lo em todos os tipos de coleção.

FOR EACH
Muitas linguagens têm uma maneira simples e elegante de percorrer uma coleção para cada loop.
Desde a versão 1.5 do Java, esta maneira simples de navegar pelas coleções foi incluída.
        for(Object nome: nomes){
           System.out.println(nome);
        }
        //Para cada objeto na coleção de nomes, traga-o e coloque-o no nome do objeto.

 */

/*
CRIANDO UMA COLECAO
As coleções em Java são implementadas por meio dessa família de classes e interfaces.
Saber disso permitirá criar as coleções de forma genérica.
                        <<interface>>
                         Collection
            <<interface>>              <<interface>>                              <<interface>>
                List                        Set                                        Map
        ArrayList LinkedList    HashSet LinkedHashSet TreeSet              HashMap LinkedHashMap TreeMap
        ex.
 List nomes = new ArrayList();  Set nomes = new HashSet();                  Map nomes = new HashMap();
 List nomes = new LinkedList(); Set nomes = new LinkedHashSet();            Map nomes = new LinkedHashMap();
                                Set nomes = new TreeSet();                  Map nomes = new TreeMap();

Ao criar uma coleção ou qualquer tipo de objeto,
é uma boa prática digitar a referência do modo mais genérico possível.
List nomes = new ArrayList(); //ArrayList "é um" List

 */
public class Treino {


}
