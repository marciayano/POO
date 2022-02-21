package Aula03;

import java.util.Scanner;
public class Mesa11 {

    public static void numerosPrimos(int num){
        int i = 2, j = 2;

        for (i=2; i<= num; i++){
            for (j=2; j < i; j++){
                if (i % j == 0){
                    break;
                }
            }
            if (j == i){
                System.out.println(j);
            }
        }
    }


    public static void whichWin() {
        Scanner entrada = new Scanner(System.in);

        while (true){
            System.out.println("Digite o nome do jogador 1 (se for * o jogo para): ");
            String nome1 = entrada.nextLine();

            if (nome1.equals("*")){
                System.out.println("Fim de jogo");
                break;
            }
            System.out.println("Digite a opção do jogador 1 (pedra, papel ou tesoura): ");
            String opcao1 = entrada.nextLine();
            System.out.println("Digite o nome do jogador 2: ");
            String nome2 = entrada.nextLine();
            System.out.println("Digite a opção do jogador 2 (pedra, papel ou tesoura): ");
            String opcao2 = entrada.nextLine();
            if ((opcao1.equals("pedra") && opcao2.equals("tesoura")) || (opcao1.equals("papel") && opcao2.equals("pedra")) ||
                    (opcao1.equals("tesoura") && opcao2.equals("papel"))) {
                System.out.println("1");;
            } else if ((opcao2.equals("pedra") && opcao1.equals("tesoura")) || (opcao2.equals("papel") && opcao1.equals("pedra")) ||
                    (opcao2.equals("tesoura") && opcao1.equals("papel"))) {
                System.out.println("2");
            } else if (opcao1.equals(opcao2)) {
                System.out.println("0");
            }
        }
    }



    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = entrada.nextInt();

        numerosPrimos(num);

        whichWin();
    }
}
