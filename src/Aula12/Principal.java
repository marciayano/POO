package Aula12;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        //polimorfismo geral aceita o especifico, nao o contrario
        Funcionario funcionario = new Assistente("Pedro",3000,"123");
        Funcionario funcionario2 = new Tecnico("Fabio", 5000, "456", 3000);
        Empresa dh = new Empresa("DH", "12345678");
                dh.addFuncionario(funcionario);
                dh.addFuncionario(funcionario2);

    }
}
