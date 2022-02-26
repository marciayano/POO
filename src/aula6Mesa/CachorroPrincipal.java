package aula6Mesa;

public class CachorroPrincipal {

    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("Caramelo", "vira lata", 2017, 3f, false, false);
        System.out.println(cachorro1.getNome() +" tem a idade em anos =");
        cachorro1.idade();
        cachorro1.estaApto();

        Cachorro theodor = new Cachorro("Theodor", "Maltes branco", 2018, 5f, true, false);
        System.out.println(theodor.getNome() +" tem a idade em anos =");
        theodor.idade();
        theodor.estaApto();
    }

    }
