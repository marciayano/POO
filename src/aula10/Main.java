package aula10;

public class Main {
    public static void main(String[] args) { //nao esquecer de criar o metodo Main... como a classe chama Main, eu esquecia as vezes
        //criou novo objeto chamado novoVendedor
        Vendedor novoVendedor= new Vendedor("Jose","123");
        //atribuindo novos valores
        novoVendedor.setSalario(45000);
        novoVendedor.setDesconto(5000);
        novoVendedor.setComissao(3);
        novoVendedor.setTotalVendas(300000);
        //imprimir nome, arquivo, comissao e vendas do objeto novoVendedor
        System.out.println(novoVendedor.toString());

        //criou 3 novos objetos da classe empregado
        Empregado empregado1=new Empregado("Juan","1112");
        Empregado empregado2=new Empregado("Matias","1113");
        Empregado empregado3=new Empregado("Juan Carlos","1112");

        System.out.println(); //so coloquei para pular linha

        if (empregado1.equals(empregado2))
            System.out.println(empregado1.toString() + " é o mesmo empregado que \n" +
                    empregado2.toString()); // o \n dentro da String pula linha
        else //esse caso que imprimiu
            System.out.println(empregado1.toString() + " não é o mesmo empregado que \n" +
                    empregado2.toString());


        if (empregado1.equals(empregado3)) //esse caso que imprimiu
            System.out.println(empregado1.toString() + " é o mesmo empregado que \n" +
                    empregado3.toString());
        else
            System.out.println(empregado1.toString() + " não é o mesmo empregado que \n " +
                    empregado3.toString());

    }
}
