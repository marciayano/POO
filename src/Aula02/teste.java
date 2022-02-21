package Aula02;

import java.util.Scanner;


public class Solution {

    public static void ehPar(int num) {
        boolean par = false;
        if ((num % 2) == 0) { par = true;}
        else {par = false;}
    } if (par==false || 5 < numero < 2){System.out.println("Not Weird");}
        else if(par==true || 20 < numero < 6) {System.out.println("Weird");}
        else (par==true || numero >20) {System.out.println("Not Weird");}

    public static void main(String[] args) {
        Scanner parImpar = new Scanner(System.in);
        int  numero = parImpar.nextInt();
        ehPar (numero);
    }
}
