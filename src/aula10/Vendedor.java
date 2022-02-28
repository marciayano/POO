package aula10;

public class Vendedor extends Empregado{
    //atributos
    private int comissao;
    private double totalvendas;

    //construtor
    public Vendedor(String nome, String arquivo) {
        super(nome, arquivo);
    }

    public void setComissao(int comissao) {
        this.comissao = comissao;
    }

    public void setTotalVendas(double totalvendas) {
        this.totalvendas = totalvendas;
    }

    //sobrescritas
    @Override
    public double calcularSalario() {
        return salario + (totalvendas/100*comissao)-desconto;

    }

    @Override
    public double calcularSalario(double premio) {
        return salario+premio+(totalvendas/100*comissao)-desconto;

    }
    @Override
    public String toString() {
        return super.toString() +
                " Comissão=" + comissao + " % \n" +
                " Vendas=" + totalvendas;

    }
}
