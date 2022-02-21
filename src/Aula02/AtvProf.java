package Aula02;

import java.sql.SQLTransactionRollbackException;
import java.util.Scanner;

public class AtvProf {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String nome = entrada.nextLine();
        String sobrenome = entrada.nextLine();

        String dia = entrada.nextLine();
        String mes = entrada.nextLine();
        String ano = entrada.nextLine();

        char inicialN = nome.charAt(0);
        char inicialS = sobrenome.charAt(0);

        System.out.println("Nome: " + nome + "Sobrenome: " + sobrenome +
                "\nIniciais: " + inicialN + " " + inicialS +
                "\nData de Nascimento: " + dia + "/" + mes + "/" + ano);

    }
}
