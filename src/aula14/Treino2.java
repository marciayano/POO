package aula14;

/*
ARRAY
Em Java, um array é um objeto, e como tal, o operador new deve ser usado para criar uma instância,
mas ao contrário das coleções, os arrays são de comprimento fixo, que deve ser definido na criação, sendo imutáveis.

String[] nomes = new String[5];
Pode ser qlqr tipo de objeto: primitivo ou nao.. String, etc
[] indica uma array
5 indica o tamanho da array

//acessando a array
nomes[0]="Maria"; //indica que o primeiro item da array é "Maria"
nomes[10]="Teste"; //Tentar acessar um índice fora do intervalo, levanta uma exceção/erro.

Podemos percorrer um array por meio de for, while ou for each
e também usar a propriedade length que indica o tamanho do array.

                            Array               Coleções
Estrutura                  Estática             Dinâmica
Tipos primitivos      Usa tipos primitivos      Você deve usar as classes Integer, Float, Double
Longitude                nomes.lenght           nomes.size()
Obter um valor              nomes[2]            nomes.get(2)
Estabelecer um valor   nomes[2] = “Carlos”      nomes.set(2,”Carlos”)
Incluir um elemento      Não é possível         nomes.add(“Juan”)
Remover um elemento      Não é possível         nomes.remove(“Juan”)
Acesso a um elemento
   fora do limite         Erro Exceção          Não traz erro
   estabelecido
Ordenamento                 Não pode            Pode

Devido aos benefícios, facilidade de manutenção e para evitar bugs,
sempre usaremos coleções ao armazenar um conjunto de objetos.



Igualdade e ordenamento

Elementos iguais
Devemos estabelecer o critério pelo qual um objeto é igual a outro,
se esse critério não for atendido, diremos que são diferentes.
Em colecoes para determinar se dois objetos são iguais, você deve substituir os métodos equals() e hashCode().
as coleções podem determinar se o item que armazenam é igual a outro.
No caso de Set, eles servirão para impedir sua inserção.


Ordem entre elementos
No caso das coleções TreeSet e TreeMap, os elementos são armazenados de maneira ordenada
 e para isso devemos implementar a interface Comparable.
Não basta determinarmos a igualdade, neste caso, devemos também compará-los,
avaliando qual é maior, menor ou igual a outro.
Em Java, para comparar objetos em coleções, devemos implementar a interface Comparable.
Podemos utilizar a interface Comparable
para ordenar os elementos de uma List (ArrayList ou LinkedList) invocando seu método sort().


 */

public class Treino2 {
}
