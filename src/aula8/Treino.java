package aula8;

import javax.swing.plaf.BorderUIResource;
import java.lang.management.GarbageCollectorMXBean;

/*
    Relacionamento "eh um" == Heranca
    Serve para reutilizar atributos, metodos...
    ex. Classe chowchow, salsicha, srd heradam da Classe Cachorro atributos como nome, cor, metodo latir....
    Cachorro seria a Super Classe/ Classe Mae/ Classe Pai
    Chowchow seria a sub-classe/ Classe filha
    Heranca multipla (uma classe herda mais de uma super classe) nao e permitida no Java, e nao e uma boa pratica
    Super classe <- Sub classe (a fecha cheia aponta para a super classe)

    sobrecarga
    e possivel uma classe ter dois metodos com o mesmo nome desde que o comportamento (assinatura = como foi codado) seja diferente
    assinatura: nome, quantidade, ordem dos parametro...
    o valor retornado pela classe e os modificadores de visibilidade nao fazem parte da assinatura

    sobreescrita = reescrever
    neste caso vamos reescrever o metodo criado pela super classe para se adequar a sub classe
    A anotação "@Override" pede ao compilador para verificar se estamos realmente redefinindo um método da superclasse.

    protected "#" = usado na relacao heranca = visibilidade intermediária do atributo ou método, boa pratica
    o que declaramos com # é particular para outras classes, mas público para classes filhas.

    Todas as classes que criamos em Java derivam da classe Object, mesmo que não seja explicitamente escrito.
    Alguns Métodos herdados: String toString(), boolean equals(Object o), int hashCode()

    O método .toString () tenta representar o objeto com texto
    Empregado novoEmpregado=new Empregado("Jose","156");
    System.out.println(novoEmpregado.toString()); // saida q recebemo: com.company.Empregado@1540e19d
    @Override
    public String toString(){return “Nome: ” + nome + “\n” + “Arquivo: ” + arquivo;
    chamando de novo o sout // saida:   Nome: Juan Arquivo: 156

    hashcode
    Ele retorna um número único que identifica o objeto
    se eu tiver dois objetos da mesma classe, o hashCode() geraria um identificador unico para cada um.
    @Override
        public int hashCode(){
        int hash=31;
        hash= hash* nome.hashCode();
        hash= hash* arquivo.hashCode();
                return hash;
    Para gerar um número único, você trabalha com números primos. Pode ser qualquer número primo, neste caso 31 foi usado.
    Como nome e arquivo são strings, ou seja, também são objetos, possuem seu próprio hashCode().
    Multiplicamos todos os números e obtemos o hashCode do objeto.
    Em uma string, o hashCode é gerado a partir dos caracteres. Por exemplo, o número do arquivo é sempre diferente.

    equals
    Quando criamos um objeto ou instância, o que temos é uma referência à memória (RAM), ou seja,
    os dados não são armazenados diretamente na variável de tipo de objeto,
    apenas a referência ao local onde estão os valores dos atributos do objeto.
    É por isso que não podemos usar o operador "==" para comparar a igualdade entre dois objetos
    porque estaríamos comparando referências.
    O que significa que dois objetos são iguais?
    se compararmos dois funcionários, poderíamos definir que eles são iguais se seus arquivos forem iguais.
    Dessa forma, quando escrevemos uma classe, uma das coisas que devemos determinar é
    como vamos verificar a igualdade de duas instâncias dessa classe.
    //primeiro passo é lembrar como é a assinatura deste método, devemos respeitar a assinatura do método herdado de Object.
    Para começar a escrever nosso método equals, devemos considerar que o parâmetro que está pedindo é um Objeto,
    não diz que é um Empregado. Logo, a primeira coisa a verificar é se realmente é um Empregado, caso contrário,
    já podemos dizer que eles não são iguais.
    Vamos ver duas maneiras de verificar isso:
        instanceof
        getClass()
    Agora teríamos que verificar a igualdade (ter o mesmo arquivo).
    Para fazer essa verificação, precisaremos pedir ao objeto "o", o arquivo para compará-lo com a instância.
    Mas "o" é um objeto, isto é, não "sabe" o que tem.



}


}

 */

public class Treino {

    public class Pessoa{
        public String nome;

        //construtor
        public Pessoa(String nome){
            this.nome = nome;
        }
    }

    public class Colaborador extends Pessoa{
        private double salario;

        //primeira coisa que fazemos na sub classe, eh chamar a construtura da super classe
        public Colaborador(String nome){
            super(nome);
            this.salario = salario;
            salario = 10000;

        }
    }
}