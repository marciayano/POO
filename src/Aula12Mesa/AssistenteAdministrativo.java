package Aula12Mesa;

public class AssistenteAdministrativo extends Funcionario{

    private boolean turnoNoite;
    private double addNoturno;

    public AssistenteAdministrativo(String nome, double salario, boolean turnoNoite, double addNoturno) {
        super(nome, salario);
        this.turnoNoite = turnoNoite;
        this.addNoturno = addNoturno;
    }

    @Override
    public double ganhoAnual() {
        double anual = 12*(getSalario() + this.addNoturno);
        return anual;
    }

    @Override
    public void exibeDados() {
        if(this.turnoNoite){
            System.out.println("O funcionário "+getNome()+ " ganha anualmente " + ganhoAnual() + " e trabalha no turno da noite");
        } else{
            System.out.println("O funcionário "+getNome()+ " ganha anualmente " + ganhoAnual() + " e trabalha no turno do dia");
        }
    }

}
