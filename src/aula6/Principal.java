package aula6;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {

        Impressora impressora = new Impressora ("Epson", "wifi", LocalDate.of(2022,2,26));
        System.out.println(impressora.getDataFabricacao());
        impressora.setFolhasDisponiveis(100);
        impressora.imprimir("Ola Mundo!!");
        System.out.println(impressora.getFolhasDisponiveis());

    }

}
