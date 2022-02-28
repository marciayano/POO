package aula11;

import java.time.LocalDate;

public class ImpressoraCannon extends Impressora{
    public ImpressoraCannon(String modelo, String tipoConexao, LocalDate dataFabricacao, int folhasDisponiveis, double porcentagemTinta) {
        super(modelo, tipoConexao, dataFabricacao, folhasDisponiveis, porcentagemTinta);
    }

    @Override
    public String imprimir() {//nao precisa do super. para chamar atributo/metodo pq estamos sobrescrevendo e esta vazio {}
        if (temPapel() && !precisaTinta()){
            setFolhasDisponiveis(getFolhasDisponiveis()-1);//toda vez q imprimir vamos tirar 1
            setPorcentagemTinta(getPorcentagemTinta()-0.01);//nao usamos super aqui pq o atributo e privado, e precisamos do set get
            return "Imprimindo!!";
        }else if(temPapel() && precisaTinta()){
            return "Voce precisa adicionar tinta";
        }else if(!temPapel() && precisaTinta()){
            return "Voce precisa de tinta e nao tem papel!";
        }else {
            return "Voce nao tem papel!";
        }
    }

    @Override//nao e obrigado usar pq nao e abstrato, e como nao mudamos nada, nem precisaria escrever aqui
    public boolean precisaTinta() {
        return super.precisaTinta();
    }
}
