package aula13;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= informarSaldo()){
            setSaldo(informarSaldo()-valor);
        }else{
            System.out.println("Nao tem limite disponivel");
        }
    }
    public void cobrarJuros(){
        double juros = 0.05;
        //getSaldo() ou informarSaldo() e a mesma coisa
        setSaldo(informarSaldo()*(1+juros));
    }
}
