package modelos;

import java.time.LocalDate;
import java.util.Objects;

public class MotoIMPL extends VehiculoIMPL {
    private int cilindradaCC;
    private boolean tieneSidecar;

    //constructor entero
    public MotoIMPL(int id, String marca, String modelo, String matricula, LocalDate fechaMatriculacion, String color, PersonaIMPL duenyoActual, int cilindradaCC, boolean tieneSidecar) {
        super(id, marca, modelo, matricula, fechaMatriculacion, color, duenyoActual);
        this.cilindradaCC = cilindradaCC;
        this.tieneSidecar = tieneSidecar;
    }

    public MotoIMPL() {
        this.cilindradaCC = 0;
        this.tieneSidecar = false;
    }

    public MotoIMPL(VehiculoIMPL otroVehiculo, MotoIMPL otroMoto) {
        super(otroVehiculo);
        this.cilindradaCC = otroMoto.getCilindradaCC();
        this.tieneSidecar = otroMoto.getTieneSidecar();
    }

    public int getCilindradaCC() {
        return cilindradaCC;
    }

    public void setCilindradaCC(int cilindradaCC) {
        this.cilindradaCC = cilindradaCC;
    }

    public boolean getTieneSidecar() {
        return tieneSidecar;
    }

    public void setTieneSidecar(boolean tieneSidecar) {
        this.tieneSidecar = tieneSidecar;
    }

    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MotoIMPL motoIMPL = (MotoIMPL) o;
        return getCilindradaCC() == motoIMPL.getCilindradaCC() && getTieneSidecar() == motoIMPL.getTieneSidecar();
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), getCilindradaCC(), getTieneSidecar());
    }

    public String toString() {
        return "MotoIMPL: {\n" +
                "    cilindradaCC: " + cilindradaCC + "\n" +
                "    tieneSidecar: " + tieneSidecar + "\n" +
                "    vehiculo: " + super.toString() + "\n" +
                "}";
    }
}
