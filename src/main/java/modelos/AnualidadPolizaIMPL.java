package modelos;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class AnualidadPolizaIMPL {
    private int id;
    private String numero;
    private EstadoPoliza estadoPoliza;
    public enum EstadoPoliza{
        Vigente, Anulada, Vencida
    }
    private String motivoAnulacion;
    private CotizacionIMPL cotizacionBase;
    private modoPago modoPago;
    public enum modoPago{
        IBAN, Tarjeta
    }
    private boolean esPagoFraccionado;
    private PersonaIMPL tomador;
    private ConductorIMPL conductorPrincipal;
    private List<ConductorIMPL> conductoresOcasionales;
    private double precioModalidad;
    private double precioFinal;
    private LocalDate fechaInicioAnualidad;
    private LocalDate fechaFinAnualidad;
    private LocalDate fechaAnulacion;

    //Constructor
    public AnualidadPolizaIMPL(int id, String numero, EstadoPoliza estadoPoliza, String motivoAnulacion, CotizacionIMPL cotizacionBase, AnualidadPolizaIMPL.modoPago modoPago, boolean esPagoFraccionado, PersonaIMPL tomador, ConductorIMPL conductorPrincipal, List<ConductorIMPL> conductoresOcasionales, double precioModalidad, double precioFinal, LocalDate fechaInicioAnualidad, LocalDate fechaFinAnualidad, LocalDate fechaAnulacion) {
        this.id = id;
        this.numero = numero;
        this.estadoPoliza = estadoPoliza;
        this.motivoAnulacion = motivoAnulacion;
        this.cotizacionBase = cotizacionBase;
        this.modoPago = modoPago;
        this.esPagoFraccionado = esPagoFraccionado;
        this.tomador = tomador;
        this.conductorPrincipal = conductorPrincipal;
        this.conductoresOcasionales = conductoresOcasionales;
        this.precioModalidad = precioModalidad;
        this.precioFinal = precioFinal;
        this.fechaInicioAnualidad = fechaInicioAnualidad;
        this.fechaFinAnualidad = fechaFinAnualidad;
        this.fechaAnulacion = fechaAnulacion;
    }

    //Constructor Vacio
    public AnualidadPolizaIMPL() {
        this.id = 0;
        this.numero = "";
        this.estadoPoliza = null;
        this.motivoAnulacion = "";
        this.cotizacionBase = null;
        this.modoPago = null;
        this.esPagoFraccionado = false;
        this.tomador = null;
        this.conductorPrincipal = null;
        this.conductoresOcasionales = null;
        this.precioModalidad = 0;
        this.precioFinal = 0;
        this.fechaInicioAnualidad = null;
        this.fechaFinAnualidad = null;
        this.fechaAnulacion = null;
    }

    //Constructor Copia
    public AnualidadPolizaIMPL(AnualidadPolizaIMPL anualidadPoliza) {
        this.id = anualidadPoliza.id;
        this.numero = anualidadPoliza.numero;
        this.estadoPoliza = anualidadPoliza.estadoPoliza;
        this.motivoAnulacion = anualidadPoliza.motivoAnulacion;
        this.cotizacionBase = anualidadPoliza.cotizacionBase;
        this.modoPago = anualidadPoliza.modoPago;
        this.esPagoFraccionado = anualidadPoliza.esPagoFraccionado;
        this.tomador = anualidadPoliza.tomador;
        this.conductorPrincipal = anualidadPoliza.conductorPrincipal;
        this.conductoresOcasionales = anualidadPoliza.conductoresOcasionales;
        this.precioModalidad = anualidadPoliza.precioModalidad;
        this.precioFinal = anualidadPoliza.precioFinal;
        this.fechaInicioAnualidad = anualidadPoliza.fechaInicioAnualidad;
        this.fechaFinAnualidad = anualidadPoliza.fechaFinAnualidad;
        this.fechaAnulacion = anualidadPoliza.fechaAnulacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public EstadoPoliza getEstadoPoliza() {
        return estadoPoliza;
    }

    public void setEstadoPoliza(EstadoPoliza estadoPoliza) {
        this.estadoPoliza = estadoPoliza;
    }

    public String getMotivoAnulacion() {
        return motivoAnulacion;
    }

    public void setMotivoAnulacion(String motivoAnulacion) {
        this.motivoAnulacion = motivoAnulacion;
    }

    public CotizacionIMPL getCotizacionBase() {
        return cotizacionBase;
    }

    public void setCotizacionBase(CotizacionIMPL cotizacionBase) {
        this.cotizacionBase = cotizacionBase;
    }

    public modoPago getModoPago() {
        return modoPago;
    }

    public void setModoPago(modoPago modoPago) {
        this.modoPago = modoPago;
    }

    public boolean isEsPagoFraccionado() {
        return esPagoFraccionado;
    }

    public void setEsPagoFraccionado(boolean esPagoFraccionado) {
        this.esPagoFraccionado = esPagoFraccionado;
    }

    public PersonaIMPL getTomador() {
        return tomador;
    }

    public void setTomador(PersonaIMPL tomador) {
        this.tomador = tomador;
    }

    public ConductorIMPL getConductorPrincipal() {
        return conductorPrincipal;
    }

    public void setConductorPrincipal(ConductorIMPL conductorPrincipal) {
        this.conductorPrincipal = conductorPrincipal;
    }

    public List<ConductorIMPL> getConductoresOcasionales() {
        return conductoresOcasionales;
    }

    public void setConductoresOcasionales(List<ConductorIMPL> conductoresOcasionales) {
        this.conductoresOcasionales = conductoresOcasionales;
    }

    public double getPrecioModalidad() {
        return precioModalidad;
    }

    public void setPrecioModalidad(double precioModalidad) {
        this.precioModalidad = precioModalidad;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }

    public LocalDate getFechaInicioAnualidad() {
        return fechaInicioAnualidad;
    }

    public void setFechaInicioAnualidad(LocalDate fechaInicioAnualidad) {
        this.fechaInicioAnualidad = fechaInicioAnualidad;
    }

    public LocalDate getFechaFinAnualidad() {
        return fechaFinAnualidad;
    }

    public void setFechaFinAnualidad(LocalDate fechaFinAnualidad) {
        this.fechaFinAnualidad = fechaFinAnualidad;
    }

    public LocalDate getFechaAnulacion() {
        return fechaAnulacion;
    }

    public void setFechaAnulacion(LocalDate fechaAnulacion) {
        this.fechaAnulacion = fechaAnulacion;
    }

    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        AnualidadPolizaIMPL that = (AnualidadPolizaIMPL) o;
        return getId() == that.getId() && isEsPagoFraccionado() == that.isEsPagoFraccionado() && Double.compare(getPrecioModalidad(), that.getPrecioModalidad()) == 0 && Double.compare(getPrecioFinal(), that.getPrecioFinal()) == 0 && Objects.equals(getNumero(), that.getNumero()) && getEstadoPoliza() == that.getEstadoPoliza() && Objects.equals(getMotivoAnulacion(), that.getMotivoAnulacion()) && Objects.equals(getCotizacionBase(), that.getCotizacionBase()) && getModoPago() == that.getModoPago() && Objects.equals(getTomador(), that.getTomador()) && Objects.equals(getConductorPrincipal(), that.getConductorPrincipal()) && Objects.equals(getConductoresOcasionales(), that.getConductoresOcasionales()) && Objects.equals(getFechaInicioAnualidad(), that.getFechaInicioAnualidad()) && Objects.equals(getFechaFinAnualidad(), that.getFechaFinAnualidad()) && Objects.equals(getFechaAnulacion(), that.getFechaAnulacion());
    }

    public int hashCode() {
        return Objects.hash(getId(), getNumero(), getEstadoPoliza(), getMotivoAnulacion(), getCotizacionBase(), getModoPago(), isEsPagoFraccionado(), getTomador(), getConductorPrincipal(), getConductoresOcasionales(), getPrecioModalidad(), getPrecioFinal(), getFechaInicioAnualidad(), getFechaFinAnualidad(), getFechaAnulacion());
    }

    public String toString() {
        return "AnualidadPolizaIMPL{" +
                "id=" + id +
                ", numero='" + numero + '\'' +
                ", estadoPoliza=" + estadoPoliza +
                ", motivoAnulacion='" + motivoAnulacion + '\'' +
                ", cotizacionBase=" + cotizacionBase +
                ", modoPago=" + modoPago +
                ", esPagoFraccionado=" + esPagoFraccionado +
                ", tomador=" + tomador +
                ", conductorPrincipal=" + conductorPrincipal +
                ", conductoresOcasionales=" + conductoresOcasionales +
                ", precioModalidad=" + precioModalidad +
                ", precioFinal=" + precioFinal +
                ", fechaInicioAnualidad=" + fechaInicioAnualidad +
                ", fechaFinAnualidad=" + fechaFinAnualidad +
                ", fechaAnulacion=" + fechaAnulacion +
                '}';
    }
}
