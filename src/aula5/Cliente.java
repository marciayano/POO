package aula5;
/*
Quando um cliente realiza um empréstimo, ele fica com uma dívida no banco.
Para modelar esse problema, devemos criar uma classe cliente, onde um cliente tem
um número de cliente, o nome e uma dívida.
Para registrar esse cliente, teremos que possuir seu número e seu nome.
Um cliente pode aumentar sua dívida ou quitar.
    UML:    Cliente
            - numeroCliente: int
            - nome: String
            - divida: double
            + Cliente( numero: String, nome: String)
            + aumentarDivida( valor: double): void
            + pagarDivida(valor: double): void
E uma boa pratica criar uma classe Main, pq deixa os codigos mais organizados,
pode criar main aqui no mesmo arquivo, mas ficaria muita coisa, se fosse um projeto maior.
 */
public class Cliente {
    //atributos
    private int numeroCliente;
    private String nome;
    private double divida;

    //construtor precisa ser mesmo nome da Classe para ser chamado na Main, para o programa entender
    public Cliente(int numero, String nome){
        this.numeroCliente = numero; //uso o this sempre que preciso de atributo privado, boas praticas
        this.nome = nome; //preciso de (variavel local) pq nao consigo chamar atributo private
        this.divida = 0;
    }

    //get e set (atalho Ctrl + Insert)
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

    //metodos
    public void aumentarDivida(double valor){
        this.divida += valor; // ou escreve this.divida = this.divida + valor;
        System.out.println("Sua divida agora é de: " + this.divida);
    }

    public void pagarDivida(double valor){
        if (this.divida == 0) {
            System.out.println("Você não tem divida!");
        }else {
            this.divida -= valor; //nao precisa de chave com apenas uma linha de codigo
            System.out.println("Sua divida e de: "+ this.divida);
        }
    }

}
