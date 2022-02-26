package aula3;

import java.util.Scanner;

/*
Faça um programa que permita jogar o jogo "Pedra-Papel-Tesoura".
Primeiro, o aplicativo solicita o nome de cada jogador e, em seguida, qual a opção esse jogador escolhe para jogar:
pedra, papel ou tesoura. O jogo consiste em perguntar qual opção cada um escolhe e somar pontos ao vencedor —se houver—.
Defina e use uma função chamada whichWin com dois parâmetros com as jogadas de cada um dos jogadores,
que retorna 0 em caso de empate, 1 se o primeiro vencer, 2 se o segundo vencer. O jogo termina quando o primeiro
escolhe "*" como indicador de fim.
*/

public class Mesa3PedraPapelTesoura {

    public static void whichWin() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do jogador 1:");
        String nome1 = entrada.nextLine();
        System.out.println("Digite o nome do jogador 2:");
        String nome2 = entrada.nextLine();

        while (true) {
            System.out.println("Digite * para finalizar, Qlqr letra para continuar");
            String sair = entrada.nextLine();

            if (sair.equals("*")) {
                System.out.println("Jogo Finalizado, obrigado por jogar!");
                break;
            }

            System.out.println(nome1 + " digite uma opção (pedra, papel ou tesoura): ");
            String opcao1 = entrada.nextLine();
            System.out.println(nome2 + " digite uma opção (pedra, papel ou tesoura): ");
            String opcao2 = entrada.nextLine();

            if ((opcao1.equals("pedra") && opcao2.equals("tesoura")) || (opcao1.equals("papel") && opcao2.equals("pedra")) ||
                    (opcao1.equals("tesoura") && opcao2.equals("papel"))) {
                System.out.println("1 ponto");
            } else if ((opcao2.equals("pedra") && opcao1.equals("tesoura")) || (opcao2.equals("papel") && opcao1.equals("pedra")) ||
                    (opcao2.equals("tesoura") && opcao1.equals("papel"))) {
                System.out.println("2 pontos");
            } else if (opcao1.equals(opcao2)) {
                System.out.println("0 ponto");
            } else {
                System.out.println("0 ponto");
            }
        }
    }

    public static void main(String[] args) {

        whichWin();
    }
}
