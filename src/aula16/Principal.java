package aula16;

public class Principal {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Lelia", "Sales", "12345", 100);
        try {
            cliente.comprar(500);
        }catch (ClienteException e){
            System.err.println(e);
        }

    }
}
