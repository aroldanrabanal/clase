package modelos;

import java.util.Objects;

public class ProvinciaIMPL {
    private String nombre;
    private String codigo;

    public ProvinciaIMPL(String nombre, String codigo) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public ProvinciaIMPL(ProvinciaIMPL provincia) {
        this.codigo = provincia.getCodigo();
        this.nombre = provincia.getNombre();
    }

    public ProvinciaIMPL() {
        this.codigo = "nada";
        this.nombre = "nada";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ProvinciaIMPL that = (ProvinciaIMPL) o;
        return Objects.equals(getNombre(), that.getNombre()) && Objects.equals(getCodigo(), that.getCodigo());
    }

    public int hashCode() {
        return Objects.hash(getNombre(), getCodigo());
    }

    public String toString() {
        return "ProvinciaIMPL{" +
                "nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                '}';
    }
}
