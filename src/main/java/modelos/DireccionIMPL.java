package modelos;

import java.util.Objects;

public class DireccionIMPL {
    private int id;
    public enum tipoVia{
        calle, avenida, plaza, plazoleta, callejón
    };
    private tipoVia tipoVia;
    private String nombreVia;
    private int numero;
    private String restoDireccion;
    private String codigoPostal;
    private String localidad;
    private ProvinciaIMPL provincia;

    public DireccionIMPL(int id, DireccionIMPL.tipoVia tipoVia, String nombreVia, int numero, String restoDireccion, String codigoPostal, String localidad, ProvinciaIMPL provincia) {
        this.id = id;
        this.tipoVia = tipoVia;
        this.nombreVia = nombreVia;
        this.numero = numero;
        this.restoDireccion = restoDireccion;
        this.codigoPostal = codigoPostal;
        this.localidad = localidad;
        this.provincia = provincia;
    }

    //constructor vacio
    public DireccionIMPL() {
        this.id = 0;
        this.tipoVia = null;
        this.nombreVia = "Ninguna";
        this.numero = 0;
        this.restoDireccion = "nada";
        this.codigoPostal = "nada";
        this.localidad = "nada";
        this.provincia = null;
    }

    //constructor copia
    public DireccionIMPL(DireccionIMPL direccion2){
        this.id = direccion2.getId();
        this.tipoVia = direccion2.getTipoVia();
        this.nombreVia = direccion2.getNombreVia();
        this.numero = direccion2.getNumero();
        this.restoDireccion = direccion2.getRestoDireccion();
        this.codigoPostal = direccion2.getCodigoPostal();
        this.localidad = direccion2.getLocalidad();
        this.provincia = direccion2.getProvincia();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public tipoVia getTipoVia() {
        return tipoVia;
    }

    public void setTipoVia(tipoVia tipoVia) {
        this.tipoVia = tipoVia;
    }

    public String getNombreVia() {
        return nombreVia;
    }

    public void setNombreVia(String nombreVia) {
        this.nombreVia = nombreVia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getRestoDireccion() {
        return restoDireccion;
    }

    public void setRestoDireccion(String restoDireccion) {
        this.restoDireccion = restoDireccion;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public ProvinciaIMPL getProvincia() {
        return provincia;
    }

    public void setProvincia(ProvinciaIMPL provincia) {
        this.provincia = provincia;
    }

    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        DireccionIMPL that = (DireccionIMPL) o;
        return getId() == that.getId() && getNumero() == that.getNumero() && getTipoVia() == that.getTipoVia() && Objects.equals(getNombreVia(), that.getNombreVia()) && Objects.equals(getRestoDireccion(), that.getRestoDireccion()) && Objects.equals(getCodigoPostal(), that.getCodigoPostal()) && Objects.equals(getLocalidad(), that.getLocalidad()) && Objects.equals(getProvincia(), that.getProvincia());
    }

    public int hashCode() {
        return Objects.hash(getId(), getTipoVia(), getNombreVia(), getNumero(), getRestoDireccion(), getCodigoPostal(), getLocalidad(), getProvincia());
    }

        public String toString() {
        return "DireccionIMPL: {\n" +
                "    id: " + id + "\n" +
                "    tipoVia: " + tipoVia + "\n" +
                "    nombreVia: '" + nombreVia + "'\n" +
                "    numero: " + numero + "\n" +
                "    restoDireccion: '" + restoDireccion + "'\n" +
                "    codigoPostal: '" + codigoPostal + "'\n" +
                "    localidad: '" + localidad + "'\n" +
                "    provincia: '" + provincia + "'\n" +
                "}";
    }
}
