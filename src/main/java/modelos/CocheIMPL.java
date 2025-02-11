package modelos;

import java.time.LocalDate;
import java.util.Objects;

public class CocheIMPL extends VehiculoIMPL {
    private int numPuertas;
    public enum TipoCombustible {
        GASOLINA, DIESEL, ELECTRICO, HIBRIDO
    }
    private TipoCombustible tipoCombustible;

    public enum Traccion {
        DELANTERA, TRASERA, INTEGRAL
    }
    private Traccion traccion;

    private boolean esTodoTerreno;

    //constructor entero
    public CocheIMPL(int id, String marca, String modelo, String matricula, LocalDate fechaMatriculacion, String color, PersonaIMPL duenyoActual, int numPuertas, TipoCombustible tipoCombustible, Traccion traccion, boolean esTodoTerreno) {
        super(id, marca, modelo, matricula, fechaMatriculacion, color, duenyoActual);
        this.numPuertas = numPuertas;
        this.tipoCombustible = tipoCombustible;
        this.traccion = traccion;
        this.esTodoTerreno = esTodoTerreno;
    }

    //constructor vacío
    public CocheIMPL() {
        this.numPuertas = 0;
        this.tipoCombustible =null;
        this.traccion = null;
        this.esTodoTerreno = false;
    }

    //constructor copia
    public CocheIMPL(VehiculoIMPL otroVehiculo, CocheIMPL otroCoche) {
        super(otroVehiculo);
        this.numPuertas = otroCoche.getNumPuertas();
        this.tipoCombustible = otroCoche.getTipoCombustible();
        this.traccion = otroCoche.getTraccion();
        this.esTodoTerreno = otroCoche.getEsTodoTerreno();
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public Traccion getTraccion() {
        return traccion;
    }

    public void setTraccion(Traccion traccion) {
        this.traccion = traccion;
    }

    public boolean getEsTodoTerreno() {
        return esTodoTerreno;
    }

    public void setEsTodoTerreno(boolean esTodoTerreno) {
        this.esTodoTerreno = esTodoTerreno;
    }

    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CocheIMPL cocheIMPL = (CocheIMPL) o;
        return getNumPuertas() == cocheIMPL.getNumPuertas() && getEsTodoTerreno() == cocheIMPL.getEsTodoTerreno() && getTipoCombustible() == cocheIMPL.getTipoCombustible() && getTraccion() == cocheIMPL.getTraccion();
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), getNumPuertas(), getTipoCombustible(), getTraccion(), getEsTodoTerreno());
    }

    public String toString() {
        return "CocheIMPL: {\n" +
                "    numPuertas: " + numPuertas + "\n" +
                "    tipoCombustible: " + tipoCombustible + "\n" +
                "    traccion: " + traccion + "\n" +
                "    esTodoTerreno: " + esTodoTerreno + "\n" +
                "    vehiculo: " + super.toString() + "\n" +
                "}";
    }
}
