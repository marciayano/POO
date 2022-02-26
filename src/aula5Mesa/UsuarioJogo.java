package aula5Mesa;

public class UsuarioJogo {
    //atributos
    private String nome;
    private String nickname;
    private int pontuacao;
    private int nivel;

    //construtor
    public UsuarioJogo(String nome, String nickname){
        //inicializar as variaveis
        this.nome = nome;
        this.nickname = nickname;
        this.pontuacao = 0;
        this.nivel = 0;
    }

    //metodos
    public void aumentarPontuacao(int pontos){
        this.pontuacao += pontos;
        System.out.println("Sua pontuação é de: " + pontuacao);
    }
    public void subirNivel(int xp){
        this.nivel += xp;
        System.out.println("Seu nível é: " + nivel);
    }
    public void bonus(int valor){
        this.pontuacao += valor;
        System.out.println("Sua pontuação é de: " + pontuacao);
    }

    //getters e setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public int getPontuacao() {
        return pontuacao;
    }
    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

}
