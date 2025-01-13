package Vuelo;

public class PersonaImpl implements Persona{
    private String nombre;
    private String apellidos;
    private String dni;
    private Integer edad;

    public PersonaImpl(String nombre, String apellidos, String dni, Integer edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }

    public Integer getEdad() {
        return edad;
    }

    public String toString() {
        return getNombre() + " " + getApellidos()+", "+getDni()+ ", "+getEdad()+ " años";
    }
}
