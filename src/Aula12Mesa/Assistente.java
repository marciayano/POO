package Aula12Mesa;

public class Assistente extends Funcionario{

    private String matricula;

    public Assistente(String nome, double salario, String matricula) {
        super(nome, salario);
        this.matricula = matricula;
    }

    @Override
    public double ganhoAnual() {
        double anualAssistente = 12*getSalario();
        return anualAssistente;
    }

    @Override
    public void exibeDados() {
        System.out.println("O funcionario "+getNome()+" ganha anualmente "+ ganhoAnual());
    }
}
