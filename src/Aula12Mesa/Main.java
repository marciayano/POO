package Aula12Mesa;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Assistente("Luis", 1000, "01");
        Funcionario funcionario02 = new AssistenteAdministrativo("Paulo", 1200, true, 500);
        Funcionario funcionario03 = new AssistenteAdministrativo("Roberto", 1200, false, 0);
        Funcionario funcionario04 =  new AssistenteTecnico("Marcelo", 1500, 100);

        funcionario01.exibeDados();
        funcionario02.exibeDados();
        funcionario03.exibeDados();
        funcionario04.exibeDados();
    }
}
