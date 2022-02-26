package aula3;
//Implemente um programa que nos permita exibir os primeiros "n" números primos pelo console,
// onde "n" é um valor numérico inserido pelo usuário.
// Por exemplo: Com n = 7, o que o programa deve retornar é "Os primeiros 7 números primos são: 2, 3, 5, 7, 11, 13, 17".

public class Mesa1 {

    //1- validar que queremos apenas numeros primos
    public static boolean isNumeroPrimo(int numero) {
        for (int i = 2; i < numero; i++){
            if (numero % i == 0) { return false; }
                                        }  return true;
    }

    //2-instruir as condicoes, imprima apenas a quantidade pedida
    public static void imprimirNPrimeirosNumerosPrimos(int quantidadeDeNumeros) {
        //2.3 - comecamos com o primeiro numero que e primo, 3,4,5..
        //      nao comecamos do 0 pq precisaria arrumar isNumeroPrimo...
        int numero = 2;
        //2.2 - precisamos de um contador para criar a condicao de parar e ate atingir quantidade de numeros primos pedido
        int contador = 0;
        //2.1 - criamos o loop while
        while (contador < quantidadeDeNumeros) {
            if (isNumeroPrimo(numero)) { System.out.println(numero);
                                         contador++;
                                         numero++;
            } else { numero++; }
        }

    }

    //para rodar o programa clicar na seta verdinha linha 6 (Run...) tem outras formas tb..
    public static void main(String[] args) {
        imprimirNPrimeirosNumerosPrimos(4);
    }
}
