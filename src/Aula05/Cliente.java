package Aula05;

public class Cliente {
    private int numeroCliente;
    private String nome;
    private double divida;

    public Cliente(int numero, String nome){
        this.numeroCliente = numero; //uso o this sempre que preciso de atributo privado, boas praticas
        this.nome = nome; //preciso de (variavel local) pq nao consigo chamar atributo private
        this.divida = 0;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public int getNumeroCliente(){
        return this.numeroCliente;
    }

    public void  setNumeroCliente(int numero){
        this.numeroCliente = numero;
    }
    public double getDivida(){
        return this.divida;
    }

    public void aumentarDivida(double valor){
        this.divida += valor; // ou escreve this.divida = this.divida + valor;
        System.out.println("Sua divida agora é de: " + this.divida);
    }

    public void pagarDivida(double valor){
        if (this.divida == 0) {
            System.out.println("Você não tem divida!");
        }else {
            this.divida -= valor; //nao precisa de chave com apenas uma linha de codigo
        }
    }

}
