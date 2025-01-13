package Vuelo;

import java.util.Date;

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

    //2 constructor
    public VueloImpl(String codigo, String destino, Double precio, Integer numeroPlazas, Integer numeroPasajeros, Double recaudacion) {
        this.codigo = codigo;
        this.destino = destino;
        this.precio = precio;
        this.numeroPlazas = numeroPlazas;
        this.numeroPasajeros = numeroPasajeros;
        this.recaudacion = recaudacion;
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



    //4 otros metodos
    // nombreInterface nombre=new nombreClase();
    Fecha f = new FechaImpl(6,5,2005);
    Persona p = new PersonaImpl("Ángel", "Roldán Rabanal", "29497781M", 19);
    //5 toString
    public String toString() {
        return getCodigo()+" ("+getDestino()+") - " +p+" - "+f;
    }

}
