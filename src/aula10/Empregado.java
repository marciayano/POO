package aula10;

public class Empregado {
    //atributos
    private String nome;
    private String arquivo;
    protected  double salario;
    protected double desconto;

    //construtor
    public Empregado(String nome,String arquivo)
    {
        this.nome=nome;
        this.arquivo=arquivo;
    }

    //get set
    public String getNome() {
        return nome;
    }

    public String getArquivo() {
        return arquivo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    public double calcularSalario()
    {
        return salario-desconto;
    }
    public double calcularSalario(double premio)
    {
        return salario+premio-desconto;
    }

    //sobreescritas
    @Override
    public String toString() {
        return  "Nome= " + nome + '\n' +
                "arquivo= " + arquivo + '\n' ;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Empregado empregado = (Empregado) o;
        return this.getArquivo().equals(empregado.getArquivo());
    }

    @Override
    public int hashCode() {
        int hash=31;
        hash= hash* nome.hashCode();
        hash= hash* arquivo.hashCode();
        return hash;
    }
}
