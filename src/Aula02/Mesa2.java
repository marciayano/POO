package Aula02;

import java.util.Scanner;

//Enunciado: Escreva uma função que receba três números e retorne o maior valor entre os três números.
// Em seguida, faça um programa que permita a entrada de 3 valores pelo usuário,
// use a função e exiba o resultado.
public class Mesa2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite tres numeros: ");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float num3 = sc.nextFloat();
        float maior = Math.max(Math.max(num1,num2),num3);
        System.out.println("O maior num eh: "+ maior);
    }

}
