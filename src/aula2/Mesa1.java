package aula2;
/*Enunciado: Faça uma função que, dado um número, indica se é um número primo ou não. (número primo é aquele que só pode ser dividido por 1 e ele mesmo).
             Por exemplo: 25 não é primo, pois 25 é divisível por 1, 5 e 25.
                          17 é primo porque só pode ser dividido por 1 e por 17.
             Para usar esta função que iremos criar, podemos permitir a entrada de apenas um número do usuário para verificar se o número é primo ou não.
             Para resolvê-lo, use a função obtida no exercício desenvolvido na aula assíncrona, Boolean eDivisível (int n, int divisor).*/

import java.util.Scanner;

public class Mesa1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = scan.nextInt();
        ehPrimo(numero);
    }

    //funcao eh Primo
    public static void ehPrimo(int num) {
        boolean divisivel = false;
        if (num > 0) {
            for (int j = 2; j < num; j++) {
                if (num % j == 0) divisivel = true;
            }
        } else if (num < 0) {
            for (int j = -2; j > num; j--) {
                if (num % j == 0) divisivel = true;
            }
        }
        if (divisivel || num == 1 || num == -1)
            System.out.println("O número " + num + " NÃO É primo!");
        else
            System.out.println("O número " + num + " é primo!");
    }

}
