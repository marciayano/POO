package Aula01;

/* O que e JAVA?
E uma linguagem de alto nivel == mais semelhante a linguagem humana do que das maquinas/mais facil de ler, escrever e manter por humanos.
Linguagem fortemente tipada == a variavel uma vez declarada mantem o tipo dela, Java nao permite guardar uma string na variavel double Saldo por exemplo.
Linguagem compilada e interpretada == o programa compilado pode ser executado em qlqr sistema operacional desde que tenhamos um compilador.
Podemos: Acessar banco de dados, fazer comunicacao entre aparelhos, capturar dados, calculos matematicos...
Programa Java -> Compilador Java Bytecode -> Java Virtual Machine (compilador)-> Windows, linus, mac...

O que e Metodo Main?
Por padrao, metodo Main e o primeiro metodo que sera executado pelo aplicativo.
Uma aplicacao JAVA deve ter pelo menos uma classe e um metodo Main.
assinatura da Main: public static void main(String[] args) {  }
publico, estatico, void == sem retorno argumento string

Tipos de dados:
numericos integer, Double, float - idade...
texto String - nome, email...
boolean - true, false
colecoes - array, dicionarios

Variavel (tipo de dado que quero salvar, nome da variavel):
String nome = "Jose";
Nao esquecer o ponto e virgula no final
String use "string e mais de um caracter"
char usa ' char e apenas um caracter '
 */

public class Main {
    public static void main(String[] args) {
        //variaveis
        int idade = 29;
        String nome = "Maria";
        char inicial = 'M';

        //metodo
        System.out.println("Hello World!!"); //println pula a linha
        System.out.println("Nome: " + nome + " Idade: " + idade);
        System.out.println("Primeira Linha" +"\nSegunda Linha");

        String nome1 = "Shesheu";
        String nome2 = "Nemo";
        String nome3 = "Snow";

        int idade1 = 2;
        int idade2 = 1;
        int idade3 = 3;

        Double come1 = 1.5; //usar para numeros maiores
        float come2 = 0.14f;//numeros menores usar float, nao esquecer do f no final
        float come3 = 0.5f;

        String resposta1 = "Au Au!";
        String resposta2 = "Glub Glub!";
        String resposta3 = "Miau Miau!";

        System.out.println("O pet 1 se chama "+ nome1 + " tem " + idade1 + " anos, come "+ come1 + "kg e responde com "+ resposta1);
        System.out.println("O pet 2 se chama "+ nome2 + " tem " + idade2 + " anos, come "+ come2 + "kg e responde com "+ resposta2);
        System.out.println("O pet 3 se chama "+ nome3 + " tem " + idade3 + " anos, come "+ come3 + "kg e responde com "+ resposta3);
    }
}