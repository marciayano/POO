package aula5;

public class Main {
    public static void main(String[] args) {
        //criando objeto / instanciando
        Cliente cliente1 = new Cliente(123, "Diego");
        System.out.println(cliente1.getNome());
        cliente1.aumentarDivida(100);
        cliente1.pagarDivida(10);
        System.out.println(cliente1.getDivida());
    }
}
