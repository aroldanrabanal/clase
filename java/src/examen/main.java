package examen;

public class main {
    public static void main(String[] args) {
        Festivo f = new FestivoIMPL("La Feria de Sevilla", "abril");
        Poblacion p = new PoblacionIMPL("Sevilla", 1942389, 14036, 100000, 90000, f);
        System.out.println(p);
    }
}
