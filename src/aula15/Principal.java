package aula15;

public class Principal {

    public static void main(String[] args) {
        Capitao luffy = new Capitao("Monkey D. Luffy", "Chapéu de Palha", "1");
        Capitao edward = new Capitao("Edward Newgate", "Barba Branca", "2");
        Capitao shanks = new Capitao("Shanks", "O Ruivo", "3");
        Capitao teach = new Capitao("Marshall D. Teach", "Barba Negra", "4");

        Veleiro thousandSunny = new Veleiro(1000,
                100,
                10,
                2019,
                1);

        Veleiro mobyDick = new Veleiro(2000,
                200,
                40,
                2021,
                8);

        Iate redForce = new Iate(3000,
                300,
                20,
                2015,
                10);

        Iate saberOfXebec = new Iate(4000,
                400,
                20,
                2020,
                100);

        // Valor do Aluguel
        System.out.println(thousandSunny.calcularValorAluguel());
        System.out.println(mobyDick.calcularValorAluguel());
        System.out.println(redForce.calcularValorAluguel());
        System.out.println(saberOfXebec.calcularValorAluguel());

        // Qual o navio mais luxuoso
        if (redForce.compareTo(saberOfXebec) == 0){
            System.out.println("Ambos são igualmente luxuosos");
        } else if (redForce.compareTo(saberOfXebec) == -1) {
            System.out.println("Saber of Xebec é mais Luxuoso");
        } else if (redForce.compareTo(saberOfXebec) == 1) {
            System.out.println("Red Force é mais Luxuoso");
        }

        // Veleiro é grande?
        if (thousandSunny.isGrande()) {
            System.out.println("O Thousand Sunny é grande");
        } else {
            System.out.println("O Thousand Sunny é pequeno");
        }

        if (mobyDick.isGrande()) {
            System.out.println("O Moby Dick é grande");
        } else {
            System.out.println("O Moby Dick é pequeno");
        }
    }
}
