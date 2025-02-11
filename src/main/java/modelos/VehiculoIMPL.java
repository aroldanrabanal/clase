package modelos;

import com.aseguradora.utils.*;
import utilidades.UtilidadesVehiculo;
import utilidades.UtilididadesPersona;

import java.time.LocalDate;
import java.util.Objects;

public class VehiculoIMPL {
    private int id;
    private Marca marca;
    private Modelo modelo;
    private String matricula;
    private LocalDate fechaMatriculacion;
    private String color;
    private PersonaIMPL duenyoActual;

    //constructor entero v.1
    public VehiculoIMPL(int id, String marca, String modelo, String matricula, LocalDate fechaMatriculacion, String color, PersonaIMPL duenyoActual) {
        this.id = id;
        SoporteVehiculos sop = SoporteVehiculos.getInstance();
        if (sop.esMarcaValida(marca)){
            this.marca = sop.getMarcaByName(marca);
        } else {
            throw new IllegalArgumentException("marca no valida");
        }
        if (sop.esModeloValido(marca,modelo)){
            this.modelo = this.marca.getModelo(modelo);
        }else {
            throw new IllegalArgumentException("modelo no valido");
        }
        this.matricula = matricula;
        this.fechaMatriculacion = fechaMatriculacion;
        this.color = color;
        this.duenyoActual = duenyoActual;
    }

    //constructor entero v.2
    public VehiculoIMPL(int id, Marca marca, Modelo modelo, String matricula, LocalDate fechaMatriculacion, String color, PersonaIMPL duenyoActual) {
        try {
            this.id = id;
            this.marca = marca;
            this.modelo = modelo;
            if (UtilidadesVehiculo.esMatriculaValida(matricula)) {
                this.matricula = matricula;
            } else {
                throw new IllegalArgumentException("Matricula no valida");
            }
            if (UtilidadesVehiculo.validaFechaMatriculacion(fechaMatriculacion)){
                this.fechaMatriculacion = fechaMatriculacion;
            } else {
                throw new IllegalArgumentException("Fechha Matricula no valida");
            }
            this.color = color;
            this.duenyoActual = duenyoActual;
        } catch (Exception e){
            System.out.println("Excpención en: " + e.getMessage());
            e.printStackTrace();
        }


    }

    //constructor copia
    public VehiculoIMPL(VehiculoIMPL otroVehiculo) {
        this.id = otroVehiculo.getId();
        this.marca = otroVehiculo.getMarca();
        this.modelo = otroVehiculo.getModelo();
        this.matricula = otroVehiculo.getMatricula();
        this.fechaMatriculacion = otroVehiculo.getFechaMatriculacion();
        this.color = otroVehiculo.getColor();
        this.duenyoActual = otroVehiculo.getPersona();
    }

    //constructor vacío
    public VehiculoIMPL() {
        this.id = 0;
        this.marca = null;
        this.modelo = null;
        this.matricula = "ninguna";
        this.fechaMatriculacion = LocalDate.now();
        this.color = "ninguna";
        this.duenyoActual = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public LocalDate getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    public void setFechaMatriculacion(LocalDate fechaMatriculacion) {
        this.fechaMatriculacion = fechaMatriculacion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public PersonaIMPL getPersona() {
        return duenyoActual;
    }

    public void setPersona(PersonaIMPL duenyoActual) {
        this.duenyoActual = duenyoActual;
    }

    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        VehiculoIMPL that = (VehiculoIMPL) o;
        return getId() == that.getId() && Objects.equals(getMarca(), that.getMarca()) && Objects.equals(getModelo(), that.getModelo()) && Objects.equals(getMatricula(), that.getMatricula()) && Objects.equals(getFechaMatriculacion(), that.getFechaMatriculacion()) && Objects.equals(getColor(), that.getColor()) && Objects.equals(duenyoActual, that.duenyoActual);
    }

    public int hashCode() {
        return Objects.hash(getId(), getMarca(), getModelo(), getMatricula(), getFechaMatriculacion(), getColor(), duenyoActual);
    }

    public String toString() {
        return "VehiculoIMPL: {\n" +
                "    id: " + id + "\n" +
                "    marca: '" + marca + "'\n" +
                "    modelo: '" + modelo + "'\n" +
                "    matricula: '" + matricula + "'\n" +
                "    fechaMatriculacion: " + fechaMatriculacion + "\n" +
                "    color: '" + color + "'\n" +
                "    duenyoActual: " + duenyoActual + "\n" +
                "}";
    }
}
