package aula13;

public class ContaCorrente extends Conta implements GravarImposto{
    //implements GravarImposto, OutraInterface, MaisOutraInterface
    private double valorPermitido;

    public ContaCorrente(double saldo, double valorPermitido) {
        super(saldo);
        this.valorPermitido = valorPermitido;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= informarSaldo()){
            setSaldo(informarSaldo()-valor);
        }else{
            System.out.println("Nao tem limite disponivel");
        }
    }

    @Override
    public void imposto(double porcentagem) {
        if (informarSaldo() >= 0) {
            setSaldo(informarSaldo() - (informarSaldo() * (porcentagem/100)));
            System.out.println("imposto foi cobrado na fonte");
        } else {
            System.out.println("imposto nao sera cobrado");
        }
    }
}
