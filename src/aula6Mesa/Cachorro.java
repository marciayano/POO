package aula6Mesa;
/*
Imagine uma instituição que adota cachorros, e para a adoção é obrigatório que os cachorros
registrados em no sistema possuam informações como: está apto ou não para a adoção, raça,
ano aproximado de nascimento, peso, possuem chip ou não, estejam feridos ou não e atribuído o
primeiro nome para eles na instituição.
Precisaremos saber a idade do cachorro e validar se ele possui um chip para localização.
Um cachorro pode ser encaminhado para adoção se não estiver ferido e pesar mais de 5 kg.
 */

import java.time.LocalDate;

public class Cachorro {
    private String nome;
    private String raca;
    private int anoNasc;
    private float peso;
    private boolean chip;
    private boolean ferimentos;

    public Cachorro(String nome, String raca, int anoNasc, float peso, boolean chip, boolean ferimentos) {
        this.nome = nome;
        this.raca = raca;
        this.anoNasc = anoNasc;
        this.peso = peso;
        this.chip = chip;
        this.ferimentos = ferimentos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public boolean isChip() {
        return chip;
    }

    public void setChip(boolean chip) {
        this.chip = chip;
    }

    public boolean isFerimentos() {
        return ferimentos;
    }

    public void setFerimentos(boolean ferimentos) {
        this.ferimentos = ferimentos;
    }

    public void estaApto(){
        if(!ferimentos && peso >= 5){
            System.out.println("Pronto para adoção!");
        } else {
            System.out.println("Não está apto para adoção");
        }
    }

    public void idade(){
        LocalDate dataAtual = LocalDate.now();
        int ano = dataAtual.getYear();
        System.out.println(ano - this.anoNasc);

    }
}
