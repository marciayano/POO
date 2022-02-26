package aula5;
/*
Pasta SRC e a raiz do projeto, dela criamos as packages e dentro as classes
Crtl + Insert atalho para criar construtor, get, set....
Boa pratica: nome da Classe = nome da arquivo.java
             palavra em singular e primeira letra Maiuscula
Variavel da classe = atributo que e igual para todos os objetos
                    (exmplo da veterinaria: valor da consulta e o mesmo para cao, gato...)

    Classe:     Treino
    Atributos:  - descricao: String
                - precoVenda: double
                - estoque: int
                - valorCombustivel: double //sublinhado indica q e variavel da classe
    Construtor: + Artigo(descricao: String, quantidade: int, preco: Double)
    Metodo:     + temEstoque:Boolean
                + consultarPreco:Double
                + mudarValorCombustivel(double preco) //sublinhado indica q e metodo da classe

 Como nomear:
 Classe: CamelCase, PrimeiraLetraMaiuscula
 Atributo, metodo, objeto: portaCor, precoValor, primeiraPalavraMinusculo
 Pacote: tudo minusculo
 Constantes: TUDO-MAIUSCULO

 */
public class Treino{
    //Atributos
    private String descricao;
    private double precoVenda;
    private int estoque;
    static private double valorCombustivel;

    //Construtor
    public Treino (String descricao, int quantidade, double preco){
        this.descricao = descricao;
        this.precoVenda = preco;
        this.estoque = quantidade;
    }

    //Metodos
    public boolean temEstoque(){
        return true;
    }
     public double consultarPreco(){
        return precoVenda;
     }
     static public void mudarValorCombustivel (double preco){

     }

     //Para comecar a usar
     //vamos criar uma classe main
     public static void main(String[] args) {
         Treino artigo = new Treino ("Artigo 1", 100, 120.00);
     if (artigo.temEstoque()){
         System.out.println("Tem estoque disponivel");
    }
         System.out.println("Preco: "+ artigo.consultarPreco());

}
}
