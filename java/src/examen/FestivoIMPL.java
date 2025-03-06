package examen;

public class FestivoIMPL implements Festivo {

    //Variables
    private String nombreFiesta;
    private String mes;

    //Constructor
    public FestivoIMPL(String nombreFiesta, String mes) {
        this.nombreFiesta = nombreFiesta;
        this.mes = mes;
    }

    //Getters and Setters
    public String getNombreFiesta() {
        return nombreFiesta;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    //toString
    public String toString() {
        return getNombreFiesta()+", en " + getMes();
    }
}
