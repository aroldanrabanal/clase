package examen;

public class PoblacionIMPL implements Poblacion {

    //Variables
    private String nombre;
    private int numHabitantes;
    private double superficie;
    private int personasTrabajando;
    private int numPersonasEmpleadas;
    private Festivo festividades;

    //Constructor
    public PoblacionIMPL(String nombre, int numHabitantes, double superficie, int personasTrabajando, int numPersonasEmpleadas, Festivo festividades) {
        this.nombre = nombre;
        this.numHabitantes = numHabitantes;
        this.superficie = superficie;
        this.personasTrabajando = personasTrabajando;
        this.numPersonasEmpleadas = numPersonasEmpleadas;
        this.festividades = festividades;

    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public double getSuperficie() {
        return superficie;
    }

    public int getNumHabitantes() {
        return numHabitantes;
    }

    public void setNumHabitantes(int numHabitantes) {
        this.numHabitantes = numHabitantes;
    }

    public int getPersonasTrabajando() {
        return personasTrabajando;
    }

    public void setPersonasTrabajando(int personasTrabajando) {
        this.personasTrabajando = personasTrabajando;
    }

    public int getNumPersonasEmpleadas() {
        return numPersonasEmpleadas;
    }

    public void setNumPersonasEmpleadas(int numPersonasEmpleadas) {
        this.numPersonasEmpleadas = numPersonasEmpleadas;
    }

    public Festivo getFestividades() {
        return festividades;
    }

    public void setFestividades(Festivo festividades) {
        this.festividades = festividades;
    }

    //Derivadas
    public static double PorcentajeDesempleo (int numHabitantes, int numPersonasEmpleadas) {
        return (double) numHabitantes / numPersonasEmpleadas;
    }

    public static double DensidadPoblacion (int numHabitantes, double superficie) {
        return (double) numHabitantes / superficie;
    }

    //toString
    public String toString() {
        return getNombre() +" posee una densidad de población de " + DensidadPoblacion(getNumHabitantes(), getSuperficie()) + " hab/km2. Una de sus fiestas más famosas es " + getFestividades();
    }
}
