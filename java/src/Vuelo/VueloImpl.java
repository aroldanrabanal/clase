package Vuelo;

/**
 * Código de vuelto - cadena y cosnsultable - representa el código del vuelo
 * Destino - cadena y consultuble - representa el destino
 * Precio - real y get and set - representa el precio del avión
 * Número de plazas, de tipo entero.- Representa el número de plazas totales del vuelo.
 * (Consultable)
 * Número de pasajeros, de tipo entero.- Representa el número de plazas ocupadas del vuelo.
 * (Consultable y modificable).
 * Fecha de salida, de tipo Fecha.- Representa la fecha de salida del vuelo (Consultable).
 * Recaudación, de tipo real.- Representa la recaudación del vuelo (Derivada).*******!!!!!
 * Piloto, de tipo Persona. – Representa el piloto del vuelo (consultable y modificable).*******!!!!!
 * IB2349 (Madrid)- Vicente Coronel Diaz, 39542154T, 49 años -1/1/2019
 */
public class VueloImpl implements Vuelo {
    //1 variable
    private String codigo;
    private String destino;
    private Double precio;
    private Integer numeroPlazas;
    private Integer numeroPasajeros;
    private Double recaudacion;
    private Persona piloto;
    private Fecha fecha;

    //2 constructor
    public VueloImpl(String codigo, String destino, Double precio, Integer numeroPlazas, Integer numeroPasajeros, Double recaudacion,Persona piloto, Fecha fecha) {
        this.codigo = codigo;
        this.destino = destino;
        this.precio = precio;
        this.numeroPlazas = numeroPlazas;
        this.numeroPasajeros = numeroPasajeros;
        this.recaudacion = recaudacion;
        this.piloto = piloto;
        this.fecha = fecha;
    }

    //3 getter and setters
    public String getCodigo() {
        return codigo;
    }

    public String getDestino() {
        return destino;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio1) {
        precio=precio1;
    }

    public Integer getNumeroPlazas() {
        return numeroPlazas;
    }
    public Integer getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(String numeroPasajeros1) {
        numeroPasajeros=Integer.parseInt(numeroPasajeros1);
    }
    public Double getRecaudacion() {
        return recaudacion;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public Persona getPiloto() {
        return piloto;
    }

    public void setPiloto(Persona piloto) {
        this.piloto = piloto;
    }



    //4 otros metodos
    // nombreInterface nombre=new nombreClase();

    //5 toString
    public String toString() {
        return getCodigo()+" ("+getDestino()+") - " +getPiloto()+" - "+getFecha();
    }

}
