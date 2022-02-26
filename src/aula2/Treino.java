package aula2;
/*  tipo de dados como int, float, double e char (letra minuscula) so permitem armazenar um valor. nao permite null.

    Classe propria do java como String, Float, Integer..(letra maiuscula pq e classe) alem de armazenar dados
    permite realizar operacoes ja programadas. permite valor null!
    Tenha em mente que quando usamos essas classes não podemos usar operadores como "==", para fazer uma comparação, usamos o .equals ()
    Se quisermos comparar se um valor é maior ou menor que outro, devemos usar .compareTo ()

    Scanner: classe propria do JAVA que permite inserir dados.
    Metodos: nextByte() para ler um dado do tipo byte.
             nextShort() para ler um dado do tipo short.
             nextInt() para ler um dado do tipo int.
             nextLong() para ler um dado do tipo long.
             nextFloat() para ler um dado do tipo float.
             nextDouble() para ler um dado do tipo double.
             nextBoolean() para ler um dado do tipo boolean.
             nextLine() para ler uma String até encontrar uma ruptura na linha.
             next() para ler uma string para o primeiro delimitador, geralmente até uma pausa em branco ou até uma linha.

    Funcoes
    - dar nomes descritivos em suma calcularTotal, inserirData...
    - indicar o tipo de dado no parametro (int quantidade, int posicao, String nome)...
    - o que ela retorna, por ex. um numero: double calcularTotal(double número, int quantidade)
    - nao retorna nada: void mostrarMensagem(String mensagem) //nao tem return, so um SystemPrintOutLn
    Usamos funções do tipo void quando queremos que nossa função execute apenas uma série de etapas ou ações e não retorne nada.
    - quando nao precisamos vincular nenhum objeto para utilizar ela, ela eh static.
    Por exemplo: ver Aula3 aulaCachorrinho

 */

//classe Treino
public class Treino {

    //atributos
    int num1;
    float num2 = 0.2f;
    double num3 = 1;
    String nome = "Pessoa";
    char inicial = nome.charAt(0); //armazenou a letra P
    Integer ano = 2022;
    Double anoSeguinte = 2.1;

    //funcao public pode ser acessada em outra classe, como ainda nao sei haha.. proximas aulas..
    public static void mostrarMensagem (String mensagem){
        int num1 = 0; //escopo: variavel que criei, so existe aqui dentro das {}
        System.out.println("Hello World!");
    }



}
