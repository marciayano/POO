package aula9;
/*
Uma academia já possui um sistema que contém um módulo para cobrança de mensalidades de seus associados.
Os associados no sistema têm um código de associado, nome, taxa mensal, atividade que realizam -
este é apenas o nome da atividade.
A academia incorporou nas suas instalações uma piscina, pelo que oferece acessos adicionais à mesma,
esta tem um custo extra fixo e para entrar o membro deve estar habilitado, ou seja, fazer um check-up médico.
Para incorporar este novo serviço, o analista propõe estender as classes existentes da seguinte forma:
a academia precisa saber qual é a taxa que o integrante deve pagar, caso não esteja habilitado a entrar na piscina,
não há cobrança de custo adicional.
 */


public class Associado {
    private String numAssociado;
    private String nome;
    private double valorMensal;
    private String atividade;


    public Associado(String numAssociado, String nome, double valorMensal, String atividade){
        this.numAssociado = numAssociado;
        this.nome = nome;
        this.valorMensal = valorMensal;
        this.atividade = atividade;
    }

    public double custoMensal(){
        return this.valorMensal;
    }

    @Override
    public String toString() {
        return "Associado - " +
                "numAssociado='" + numAssociado + '\'' +
                ", nome='" + nome + '\'' +
                ", valorMensal=" + valorMensal +
                ", atividade='" + atividade + '\'';
    }
}
