package modelos;

import java.util.List;
import java.util.Objects;

public class AseguradoraIMPL {
    private Integer id;
    private String nombre;
    private DireccionIMPL direccion;
    private String telefono;
    private List<VehiculoIMPL> vehiculosAsegurados;
    private List<PolizaIMPL> listPolizas;

    //Constructor
    public AseguradoraIMPL(Integer id, String nombre, DireccionIMPL direccion, String telefono, List<VehiculoIMPL> vehiculosAsegurados) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.vehiculosAsegurados = vehiculosAsegurados;
    }


    //Constructor Copia
    public AseguradoraIMPL(AseguradoraIMPL aseguradora) {
        this.id = aseguradora.id;
        this.nombre = aseguradora.nombre;
        this.direccion = aseguradora.direccion;
        this.telefono = aseguradora.telefono;
        this.vehiculosAsegurados = aseguradora.vehiculosAsegurados;
    }

    //Constructor Vacio
    public AseguradoraIMPL() {
        this.id = 0;
        this.nombre = "";
        this.direccion = null;
        this.telefono = "";
        this.vehiculosAsegurados = null;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public DireccionIMPL getDireccion() {
        return direccion;
    }

    public void setDireccion(DireccionIMPL direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<VehiculoIMPL> getVehiculosAsegurados() {
        return vehiculosAsegurados;
    }

    public void setVehiculosAsegurados(List<VehiculoIMPL> vehiculosAsegurados) {
        this.vehiculosAsegurados = vehiculosAsegurados;
    }

    public List<PolizaIMPL> getListPolizas() {
        return listPolizas;
    }

    public void setListPolizas(List<PolizaIMPL> listPolizas) {
        this.listPolizas = listPolizas;
    }

    public void addPoliza(PolizaIMPL poliza) {
        this.listPolizas.add(poliza);
        System.out.println("Poliza añadida");
    }

    public boolean removePoliza(PolizaIMPL poliza) {
        if (this.listPolizas.contains(poliza)) {
            this.listPolizas.remove(poliza);
            System.out.println("Poliza eliminada");
            return true;
        } else {
            System.out.println("Poliza no encontrada");
            return false;
        }
    }


    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        AseguradoraIMPL that = (AseguradoraIMPL) o;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getNombre(), that.getNombre()) && Objects.equals(getDireccion(), that.getDireccion()) && Objects.equals(getTelefono(), that.getTelefono()) && Objects.equals(getVehiculosAsegurados(), that.getVehiculosAsegurados());
    }

    public int hashCode() {
        return Objects.hash(getId(), getNombre(), getDireccion(), getTelefono(), getVehiculosAsegurados());
    }

    public String toString() {
        return "AseguradoraIMPL{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", vehiculosAsegurados=" + vehiculosAsegurados +
                '}';
    }
}
