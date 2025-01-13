package Vuelo;

public class FechaImpl implements Fecha {
    // variables
    private Integer dia;
    private Integer mes;
    private Integer anio;

    //constructor
    public FechaImpl(Integer dia, Integer mes, Integer anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    // getter
    public Integer getDia() {
        return dia;
    }

    public Integer getMes() {
        return mes;
    }

    public Integer getAnio() {
        return anio;
    }

    //toString
    public String toString() {
        return getDia() + "/" + getMes() + "/" + getAnio();
    }
}
