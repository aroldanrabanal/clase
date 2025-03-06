package pokemon;

public class pokemonIMPL implements pokemon {
    private int numero;
    private String nombre;
    private String descripcion;
    private double altura;
    private double peso;
    private Genero genero;
    private String tipo;

    public enum Genero {
        MASCULINO,
        FEMENINO,
        SIN_GENERO
    }

    public pokemonIMPL(int numero, String nombre, String descripcion, double altura, double peso, Genero genero, String tipo) {
        this.numero = numero;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.altura = altura;
        this.peso = peso;
        this.genero = genero;
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }


    public String toString() {
        return "Nº " + numero + " - " + nombre + " - " + descripcion + "\n" +
                "Altura: " + altura + "m\n" +
                "Peso: " + peso + " kg\n" +
                "Sexo: " + (genero == Genero.MASCULINO ? "♂" : genero == Genero.FEMENINO ? "♀" : "Desconocido") + "\n" +
                "Tipo: " + tipo;
    }

}
