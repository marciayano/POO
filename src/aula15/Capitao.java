package aula15;


/*
Enunciado

A Universidade de Nova Educação está iniciando uma nova carreira com um convênio firmado com a empresa
Todos em Casa S.A. e você precisa gerenciar as provas parciais e finais dos alunos.
Um exame só pode corresponder a um aluno e os dados necessários do aluno são: o nome, o sobrenome e o sua matrícula.
Use um construtor que permite atribuir todos esses atributos ao criar o objeto.
Um exame, além de ter um aluno associado a ele, tem um título que descreve resumidamente o assunto do exame  e uma nota.
Existem duas variantes de exames, ambos têm as características mencionadas acima,
mas cada um desses tipos de exames tem suas próprias características, por exemplo,
o parcial tem o número da unidade em que o parcial está sendo feito e também um parcial pode ser realizado muitas vezes,
então deve conter o número de tentativas. Por outro lado, existem os exames finais que têm uma nota oral e
uma descrição da matéria que foi feito o exame oralmente.

O sistema deve ter as seguintes funcionalidades:
Atendendo a qualquer exame, deverá ser possível consultar o mesmo se for aprovado ou não.
Um exame é aprovado se a nota for igual ou superior a 4.
No caso de exames finais, deve ser possível compará-los.
Um exame final é superior a outro se a média da sua nota oral e escrita for superior a outro.
É importante saber de um parcial se é possível continuar recuperando-o.
Um parcial pode ser recuperado até 3 vezes se a unidade for menor ou igual a 3 ou 2 vezes se a unidade for maior que 3.

 */
public class Capitao {

    private String nome, apelido, registro;

    public Capitao(String nome, String apelido, String registro) {
        this.nome = nome;
        this.apelido = apelido;
        this.registro = registro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

}
