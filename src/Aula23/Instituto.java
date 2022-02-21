package Aula23;

public class Instituto {
    //    Singleton pattern
    private static Instituto instance;
    private Instituto() {}

    public static Instituto getInstance() {
        if (instance == null)
            instance = new Instituto();
        return instance;
    }

    public void gerarRelatorio() {
    }
}
