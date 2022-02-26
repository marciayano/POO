package aula5Mesa;

public class Main {

    public static void main(String[] args) {
        UsuarioJogo usuario1 = new UsuarioJogo("Carol", "smlorac");
        UsuarioJogo usuario2 = new UsuarioJogo("Kammy", "Ponkan");

        //criando pontuações pros usuarios
        usuario1.aumentarPontuacao(1000);
        usuario2.aumentarPontuacao(2000);

        //criando niveis pro usuario
        usuario1.subirNivel(2);
        usuario2.subirNivel(1);

        //dando bônus pro usuario1
        usuario1.bonus(3000);

        //verificando a pontuação atual
        System.out.println(usuario1.getPontuacao());

        //usando o set pra nivel do usuario2
        usuario2.setNivel(5);
        System.out.println(usuario2.getNivel());

    }

}
