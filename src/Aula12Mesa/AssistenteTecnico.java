package Aula12Mesa;

public class AssistenteTecnico extends Funcionario{

    private double bonus;

    public AssistenteTecnico(String nome, double salario, double bonus) {
        super(nome, salario);
        this.bonus = bonus;
    }

    @Override
    public double ganhoAnual() {
        double anualTecnico = 12*(getSalario()+this.bonus);
        return anualTecnico;
    }

    @Override
    public void exibeDados() {
        System.out.println("O funcionário "+getNome()+ " ganha anualmente " + ganhoAnual());
    }
}
