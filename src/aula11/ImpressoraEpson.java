package aula11;

import java.time.LocalDate;

public class ImpressoraEpson extends Impressora{
    public ImpressoraEpson(String modelo, String tipoConexao, LocalDate dataFabricacao, int folhasDisponiveis, double porcentagemTinta) {
        super(modelo, tipoConexao, dataFabricacao, folhasDisponiveis, porcentagemTinta);
    }

    @Override
    public String imprimir() {
    if (temPapel() && !precisaTinta()){
        setFolhasDisponiveis(getFolhasDisponiveis()-1);//toda vez q imprimir vamos tirar 1
        setPorcentagemTinta(getPorcentagemTinta()-0.01);
        return "Imprimindo!!";
    }else if(temPapel() && precisaTinta()){
        return "Voce precisa adicionar tinta";
    }else if(!temPapel() && precisaTinta()){
        return "Voce precisa de tinta e nao tem papel!";
    }else {
        return "Voce nao tem papel!";
    }
    }
}
