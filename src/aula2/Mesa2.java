package aula2;

import java.util.Scanner;

//Enunciado: Escreva uma função que receba três números e retorne o maior valor entre os três números.
// Em seguida, faça um programa que permita a entrada de 3 valores pelo usuário, use a função e exiba o resultado.

//classe se chama Mesa2
public class Mesa2 {

    //funcao chama main, atalho digite main + tecla tab
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //chamamos um objeto tipo Scanner; com nome "entrada"; new Scanner para instanciar
        System.out.println("Digite tres numeros: ");
        //criamos as variaveis para armazenar os dados fornecidos
        float num1 = entrada.nextFloat();
        float num2 = entrada.nextFloat();
        float num3 = entrada.nextFloat();
        //criamos variavel com metodo .max da classe Math
        //num1 e 2 estao entre () por causa da documentacao, mas incluiu o num3 sem problemas
        float maior = Math.max(Math.max(num1,num2),num3);

        System.out.println("O maior numero eh: "+ maior);
    }

}
