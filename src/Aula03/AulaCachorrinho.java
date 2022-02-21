package Aula03;

import java.util.Scanner;

public class AulaCachorrinho {

    public static void quantosPacotes(float quantidade){
        Scanner entrada = new Scanner(System.in);
        float kilo = 0.0f;
        int pacote = 0;

        while(kilo < quantidade){
            System.out.println("Digite o peso do pacote: ");
            String entradaAux = entrada.nextLine();
            float aux = Float.parseFloat(entradaAux);
            kilo = kilo + aux;
            pacote = pacote + 1;

        }
        System.out.println("Você vai precisar de  " + pacote + "pacote(s): ");

    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do pet: ");
        String nome = entrada.nextLine();
        System.out.println("Digite a qtd de ração: ");
//        float quantidade = entrada.nextFloat();           esse da erro porque aceita a , mas qr dizer 2 numeros
//        enScanner scanner = new Scanner(System.in);       primeira opção
//        scanner.useLocale(Locale.US); // setar o locale
//        float number = scanner.nextFloat();
//        System.out.println(number);
        //String quantAux = entra.nextLine(;
        String quantAux = entrada.nextLine();
        float quantidade = Float.parseFloat(quantAux);

        quantosPacotes(quantidade);

    }
}
