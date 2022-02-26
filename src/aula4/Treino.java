package aula4;


/*
Classe      == e uma representacao do objeto (ainda nao foi criado = molde)
               exemplo: Classe: animal ; Objeto/Instancias = cachorro, gato, passaro...
               conjunto de 4 informacoes:
                  1- qm realiza (pessoa, entidade, empresa..)
                  2- caracteristicas == atributos (nome, sobrenome, registro..)
                  3- acoes == verbo == metodos (calcularSoma, tratarPaciente...)
                  4- Detalhes / Requisicoes especiais
                  Exemplo (depende da interpretacao do contexto, nao eh solucao unica definitiva):
                           Classe (sempre letra maiuscula): ClinicaVeteriaria
                           Atributos melhor ser privado (- significa privado == encapsulamento)
                           - nomePet: String
                           - nomeDono: String
                           - valorConsulta: double
                           Metodos (+ significa publico)
                           + veterinario(nome,sobrenome,matricula):String
                           + checkUpBasico():void //void pq nao vamos usar para mais nada
                           + vacinar(precoVacina Float):Float //Float pq vamos armazenar o valor e usar depois
                           + medicar(precoRemedio Float):Float
                           + consultaValorTotal():Double //nao tem parametro pq ja criamos valor Consulta

Construtor  == qm constroi/instancia o objeto.
                            nome da classe: Veterinario (nome:"abc",idade:30)
Objeto      == classe construida = tudo que tem caracteristicas/atributos e responsabilidades
               (se atente ao contexto: veterinario, diagnostico, animal...)
Encapsular  == deixar oculto como eu guardo a informacao.
               definir um metodo para visualizar/modificar o dado (get = obter; set = alterar)
 */


public class Treino {

}
