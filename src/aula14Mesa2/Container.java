package aula14Mesa2;

public class Container implements Comparable<Container>{

    private int numId;
    private String descricao;
    private String pais;
    private boolean perigoso;

    public Container(int numId, String descricao, String pais, boolean perigoso) {
        this.numId = numId;
        this.descricao = descricao;
        this.pais = pais;
        this.perigoso = perigoso;
    }

    @Override
    public int compareTo(Container o){
        if (o.numId == this.numId){
            return 0;
        }else if (o.numId < this.numId){
            return 1;
        }else{
            return -1;
        }
    }

    public int getNumId() {
        return numId;
    }

    public void setNumId(int numId) {
        this.numId = numId;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public boolean isPerigoso() {
        return perigoso;
    }

    public void setPerigoso(boolean perigoso) {
        this.perigoso = perigoso;
    }
}
