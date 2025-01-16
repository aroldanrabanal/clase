package cancion;

import Vuelo.Fecha;

public class CancionImpl implements Cancion {
    private String nombre;
    private String interprete;
    private Integer duracion;
    private Fecha fechaL;
    private String genero;
    private Integer num_repro;
    private Double cal;
    private Boolean reproducir;


    public CancionImpl(String nombre, String interprete, Integer duracion, Fecha fechaL, String genero, Integer num_repro, Double cal, Boolean reproducir) {
        this.nombre = nombre;
        this.interprete = interprete;
        this.duracion = duracion;
        this.fechaL = fechaL;
        this.genero = genero;
        this.num_repro = num_repro;
        this.cal = cal;
        this.reproducir = reproducir;
    }


    public String getNombre() {
        return nombre;
    }

    public String getInterprete() {
        return interprete;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public Fecha getFechaL() {
        return fechaL;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getNum_repro() {
        return num_repro;
    }

    public void setNum_repro(Integer num_repro) {
        this.num_repro = num_repro;
    }

    public Double getCal() {
        return cal;
    }

    public void setCal(Double cal) {
        this.cal = cal;
    }

    public Boolean getReproducir() {
        return reproducir;
    }

    public void setReproducir(Boolean reproducir) {
        this.reproducir = reproducir;
    }

    public String toString() {
        return "["+getNombre()+", "+getInterprete()+"]";
    }
}
