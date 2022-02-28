package aula9;

public class AssociadoHabilitado extends Associado{ //como ele e classe filha de associado, colocar "extends Associado"
    private double custoPiscina;
    private boolean habilitado;

    public AssociadoHabilitado( String numero, String nome, String atividade, double valor,
                                double custoPiscina){
        super(numero, nome, valor, atividade); //chamando o construtor da classe pai, prestar atencao e usar a mesma ordem q esta no construtor, senao da erro
        this.custoPiscina = custoPiscina;
    }

    @Override //aparece automatico quando sobreescreve, nao e obrigatorio ter no codigo, mas bateu o olho ja indica que algo esta sendo sobreescrito
    public double custoMensal() { //nessa linha, se quero sobreEscrever nao posso mudar a assinatura (manter public double custoMensal(), se quero sobreCarregar ai posso mudar um deles, colocar um parametro....
        if (this.habilitado){
            return super.custoMensal() + this.custoPiscina; //aqui novamente indicamos super para dizer que queremos custoMensal() da classe pai
        }else{
            return super.custoMensal();//aqui poderia tambem acessar por get valor mensal pq eh o mesmo valor, so criar get na classe Associado
        }
    }

    //criamos get set para poder alterar o boolean para true/false
    public boolean isHabilitado() {
        return habilitado;
    }
    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }
}
