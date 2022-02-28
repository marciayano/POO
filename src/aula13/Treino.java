package aula13;
/*
Classe Interface
parecido com heranca, ao inves de criar varios metodos
imprimir word, imprimir pdf, impr.... cria a classe interface imprimivel
e imprimir word... viram classes filhas. na classe Imprimir tem o metodo imprimir(Arquivo)
UML <<Interface>> em cima do nome e nao tem atributos.
seta tracejada das filhas para interface
-nao permite instanciar objeto do tipo imprimivel
-as interfaces nos dao caracteristicas compartilhadas pelas classes
-uma classe so herda de outra, mas pode herdar varias interfaces
-heranca herda atributos tambem
-interface e um contrato, obriga a implementar os seus metodos

Comparacao
Ao comparar tipos primitivos, fazemos isso com os operadores
"==", ">", "<", "> =", "<=", "!", "! =",
mas como podemos fazer se quisermos comparar dois objetos?

Para comparar dois objetos,
a primeira coisa que devemos saber é por qual ou quais de seus atributos iremos compará-los.
O método equals() só nos serve para comparar a igualdade, mas não conseguimos dizer se é maior ou menor que outro objeto.

método compareTo que recebe como parâmetro o outro objeto com o qual se deseja fazer a comparação e retorna, por exemplo:
Zero: se forem iguais.
Maior que zero: se o objeto que invoca o método for maior que o recebido como parâmetro.
Menor que zero: se o objeto que invoca o método for menor que o recebido como parâmetro.
Com as interfaces, podemos fazer com que: quem as implementa tenha um método compareTo e possa estabelecer sua própria implementação.

Não precisamos criar uma interface para comparar objetos porque Java tem a sua própria, é a interface Comparable e é necessário usá-la em outras circunstâncias para comparar objetos, por exemplo, para ordená-los em coleções.
O método compareTo deve retornar:
Se eles forem iguais: 0.
Se for maior: um número maior que zero.
Se for menor: um número menor que zero.




 */
public class Treino {
}
