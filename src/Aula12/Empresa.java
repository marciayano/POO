package Aula12;

import java.util.ArrayList;

public class Empresa {
    private String nome;
    private String cnpj;
    //private Funcionario funcionario; seria se fosse relacao 1:1 um funcionario para uma empresa
    //para 1:N seria uma lista, array, arraylist (colecoes)
    private ArrayList<Funcionario>listafuncionarios = new ArrayList<>();

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public void addFuncionario(Funcionario funcionario){
        listafuncionarios.add(funcionario);//nos parametros podemos escolher uma posicao, mas nao precisa, ele adiciona no primeiro local vago, se indicar uma posicao e ja estiver ocupada ele substitui.
    }
}

