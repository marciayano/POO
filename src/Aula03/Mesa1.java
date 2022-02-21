package Aula03;
//Implemente um programa que nos permita exibir os primeiros "n" números primos pelo console,
// onde "n" é um valor numérico inserido pelo usuário.
// Por exemplo: Com n = 7, o que o programa deve retornar é "Os primeiros 7 números
//              primos são: 2, 3, 5, 7, 11, 13, 17".

public class Mesa1 {

    public static boolean isNumeroPrimo(int numero) {
        for (int i = 2; i < numero; i++){
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void imprimirNPrimeirosNumerosPrimos(int quantidadeDeNumeros) {
        int numero = 2;
        int contador = 0;

        while (contador < quantidadeDeNumeros) {
            if (isNumeroPrimo(numero)) {
                System.out.println(numero);
                contador++;
                numero++;
            } else {
                numero++;
            }
        }
    }
    public static void main(String[] args) {

        imprimirNPrimeirosNumerosPrimos(3);
    }
}
