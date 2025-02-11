package modelos;

import java.time.LocalDate;
import java.util.Objects;

public class ConductorIMPL extends PersonaIMPL {
    private LocalDate fechaCarnet;
    private int puntosCarnet;
    private int anyosAsegurado;

    //constructor entero
    public ConductorIMPL(int id, String nombre, String apellido1, String apellido2, String nif, LocalDate fechaNacimiento, DireccionIMPL direccion, LocalDate fechaCarnet, int puntosCarnet, int anyosAsegurado) {
        super(id, nombre, apellido1, apellido2, nif, fechaNacimiento, direccion);
        this.fechaCarnet = fechaCarnet;
        this.puntosCarnet = puntosCarnet;
        this.anyosAsegurado = anyosAsegurado;
    }

    //constructor vacio
    public ConductorIMPL() {
        this.fechaCarnet = LocalDate.now();
        this.puntosCarnet = 0;
        this.anyosAsegurado = 0;
    }

    //constructor copia
    public ConductorIMPL(PersonaIMPL persona2, ConductorIMPL conductor2) {
        super(persona2);
        this.fechaCarnet = conductor2.getFechaCarnet();
        this.puntosCarnet = conductor2.getPuntosCarnet();
        this.anyosAsegurado = conductor2.getAnyosAsegurado();
    }

    public LocalDate getFechaCarnet() {
        return fechaCarnet;
    }

    public void setFechaCarnet(LocalDate fechaCarnet) {
        this.fechaCarnet = fechaCarnet;
    }

    public int getPuntosCarnet() {
        return puntosCarnet;
    }

    public void setPuntosCarnet(int puntosCarnet) {
        this.puntosCarnet = puntosCarnet;
    }

    public int getAnyosAsegurado() {
        return anyosAsegurado;
    }

    public void setAnyosAsegurado(int anyosAsegurado) {
        this.anyosAsegurado = anyosAsegurado;
    }

    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ConductorIMPL that = (ConductorIMPL) o;
        return getPuntosCarnet() == that.getPuntosCarnet() && getAnyosAsegurado() == that.getAnyosAsegurado() && Objects.equals(getFechaCarnet(), that.getFechaCarnet());
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), getFechaCarnet(), getPuntosCarnet(), getAnyosAsegurado());
    }

    public String toString() {
        return "ConductorIMPL: {\n" +
                super.toString() + "\n" +
                "    fechaCarnet: " + fechaCarnet + "\n" +
                "    puntosCarnet: " + puntosCarnet + "\n" +
                "    anyosAsegurado: " + anyosAsegurado + "\n" +
                "}";
    }
}
