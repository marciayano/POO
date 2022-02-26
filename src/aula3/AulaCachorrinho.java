package aula3;

import java.util.Scanner;

/*
Na clínica veterinária cada cao come uma quantidade fixa de alimentos balanceados por dia.
O provedor de alimentos envia a você um pacote com diferentes quantidades de alimentos.

Precisamos fazer um programa que nos ajude a simular a situação:
primeiro perguntará o nome e a quantidade de comida que o cachorro come
e por meio de uma função chamada quantosPacotes, retorne quantos pacotes ele usará.
Dada a quantidade necessária, a função quantosPacotes pedirá um a um os pesos de cada pacote,
até atingir aquela quantidade dada como parâmetro da função.
 */

//primeiro criar o Main pedindo as informacoes dos usuarios
//depois criamos a funcao quantos pacotes, e criamos novamente o scanner por causa do escopo (por serem funcoes separadas podemos usar o mesmo nome)

public class AulaCachorrinho {

    public static void quantosPacotes(float quantidade){

        Scanner entrada = new Scanner(System.in);

        float kilo = 0.0f;
        int pacote = 0;

        while(kilo < quantidade){
            System.out.println("Digite o peso do pacote: ");
            String entradaAux = entrada.nextLine(); //pedindo peso do pacote
            float aux = Float.parseFloat(entradaAux); //armazenando o valor na variavel aux
            kilo = kilo + aux; //somando os pesos que o usuario vai informando
            pacote ++; //conta os pacotes pode escrever pacote = pacote + 1;
        }
        System.out.println("Você vai precisar de  " + pacote + " pacote(s): ");

    }

    public static void main(String[] args) {
        //entrada eh um objeto da classe Scanner ela nao eh static pq sempre que precisar usar scanner precisamos usar entrada
        Scanner entrada = new Scanner(System.in);

        //pedindo e armazenando nome
        System.out.println("Digite o nome do pet: ");
        String nome = entrada.nextLine();

        //pedindo e armazenando qtd racao
        System.out.println("Digite a qtd de ração: ");
        String quantAux = entrada.nextLine();

        //armazenando resultado de quantAux
        //nao posso chamar a funcao quantosPacotes(quantAux) pq esta como String
        float quantidade = Float.parseFloat(quantAux); //converteu o tipo para float agora aceita 4.5

        //chamamos a funcao quantosPacotes
        //sem precisar de nenhum objeto pq ela eh static (!= entrada scanner)
        //isso eh bom pq podemos salvar essa info por exemplo: int info = quantosPacotes(quantidade);
          quantosPacotes(quantidade);

//        float quantidade = entrada.nextFloat();           esse da erro porque aceita ',' e isso qr dizer 2 numeros
//        scanner.useLocale(Locale.US); // setar o locale
//        float number = scanner.nextFloat();
//        System.out.println(number);
//        String quantAux = entra.nextLine();
    }
}
