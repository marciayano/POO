package aula6;

import java.time.LocalDate;

/*
Codifique a classe Impressora em Java conforme mostra o diagrama de classe.
As impressoras têm um modelo, um tipo de conexão, existem impressoras que são USB e outras sem fio.
Eles têm uma data de fabricação e todas sabem a quantidade de folhas disponíveis.
        Impressora
-modelo: String
-tipoConexao: String
-dataFabricacao: Date
-folhasDisponiveis: Int
-temPapel(): boolean //esse metodo esta private
+imprimir(texto:String)
 */
public class Impressora {

    private String modelo;
    private String tipoConexao;
    private LocalDate dataFabricacao;
    private int folhasDisponiveis;

    public Impressora(String modelo, String tipoConexao, LocalDate dataFabricacao) {
        this.modelo = modelo;
        this.tipoConexao = tipoConexao;
        this.dataFabricacao = dataFabricacao;
        this.folhasDisponiveis = 0;
    }


    //get set
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoConexao() {
        return tipoConexao;
    }

    public void setTipoConexao(String tipoConexao) {
        this.tipoConexao = tipoConexao;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public int getFolhasDisponiveis() {
        return folhasDisponiveis;
    }

    public void setFolhasDisponiveis(int folhasDisponiveis) {
        this.folhasDisponiveis = folhasDisponiveis;
    }

    //como e privado, so pode ser acessado dentro da classe impressora
    //quando criar o Main, so vamos conseguir acessar imprimir()
    private boolean temPapel() {
        if (this.folhasDisponiveis > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void imprimir(String texto) {
        if (temPapel()) {
            System.out.println(texto);
            this.folhasDisponiveis --;
        } else {
            System.out.println("nao tem papel!");
        }
    }
}