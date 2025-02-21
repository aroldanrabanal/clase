package modelos;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class PolizaIMPL {
    private int id;
    private String numero;
    private List<AnualidadPolizaIMPL> anualidades;
    private EstadoPoliza estadoPoliza;
    private String motivoAnulacion;
    private CotizacionIMPL ultimaCotizacionBase;
    private PersonaIMPL tomador;
    private ConductorIMPL conductorPrincipal;
    private List<ConductorIMPL> conductoresOcasionales;
    private double precioModalidad;
    private double precioFinal;
    private LocalDate fechaInicioAnualidad;
    private LocalDate fechaFinAnualidad;
    private LocalDate fechaAnulacion;

    public enum EstadoPoliza {
        VIGENTE,
        ANULADA,
        VENCIDA
    }

    public PolizaIMPL(int id, String numero, List<AnualidadPolizaIMPL> anualidades, EstadoPoliza estadoPoliza, String motivoAnulacion, CotizacionIMPL ultimaCotizacionBase, PersonaIMPL tomador, ConductorIMPL conductorPrincipal, List<ConductorIMPL> conductoresOcasionales, double precioModalidad, double precioFinal, LocalDate fechaInicioAnualidad, LocalDate fechaFinAnualidad, LocalDate fechaAnulacion) {
        this.id = id;
        this.numero = numero;
        this.anualidades = anualidades;
        this.estadoPoliza = estadoPoliza;
        this.motivoAnulacion = motivoAnulacion;
        this.ultimaCotizacionBase = ultimaCotizacionBase;
        this.tomador = tomador;
        this.conductorPrincipal = conductorPrincipal;
        this.conductoresOcasionales = conductoresOcasionales;
        this.precioModalidad = precioModalidad;
        this.precioFinal = precioFinal;
        this.fechaInicioAnualidad = fechaInicioAnualidad;
        this.fechaFinAnualidad = fechaFinAnualidad;
        this.fechaAnulacion = fechaAnulacion;
    }

    public PolizaIMPL() {
        this.id = 0;
        this.numero = "";
        this.anualidades = null;
        this.estadoPoliza = EstadoPoliza.VIGENTE;
        this.motivoAnulacion = "";
        this.ultimaCotizacionBase = null;
        this.tomador = null;
        this.conductorPrincipal = null;
        this.conductoresOcasionales = null;
        this.precioModalidad = 0;
        this.precioFinal = 0;
        this.fechaInicioAnualidad = null;
        this.fechaFinAnualidad = null;
        this.fechaAnulacion = null;
    }

    public PolizaIMPL(PolizaIMPL poliza) {
        this.id = poliza.id;
        this.numero = poliza.numero;
        this.anualidades = poliza.anualidades;
        this.estadoPoliza = poliza.estadoPoliza;
        this.motivoAnulacion = poliza.motivoAnulacion;
        this.ultimaCotizacionBase = poliza.ultimaCotizacionBase;
        this.tomador = poliza.tomador;
        this.conductorPrincipal = poliza.conductorPrincipal;
        this.conductoresOcasionales = poliza.conductoresOcasionales;
        this.precioModalidad = poliza.precioModalidad;
        this.precioFinal = poliza.precioFinal;
        this.fechaInicioAnualidad = poliza.fechaInicioAnualidad;
        this.fechaFinAnualidad = poliza.fechaFinAnualidad;
        this.fechaAnulacion = poliza.fechaAnulacion;
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

    public List<AnualidadPolizaIMPL> getAnualidades() {
        return anualidades;
    }

    public void setAnualidades(List<AnualidadPolizaIMPL> anualidades) {
        this.anualidades = anualidades;
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

    public CotizacionIMPL getUltimaCotizacionBase() {
        return ultimaCotizacionBase;
    }

    public void setUltimaCotizacionBase(CotizacionIMPL ultimaCotizacionBase) {
        this.ultimaCotizacionBase = ultimaCotizacionBase;
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
        PolizaIMPL that = (PolizaIMPL) o;
        return getId() == that.getId() && Double.compare(getPrecioModalidad(), that.getPrecioModalidad()) == 0 && Double.compare(getPrecioFinal(), that.getPrecioFinal()) == 0 && Objects.equals(getNumero(), that.getNumero()) && Objects.equals(getAnualidades(), that.getAnualidades()) && getEstadoPoliza() == that.getEstadoPoliza() && Objects.equals(getMotivoAnulacion(), that.getMotivoAnulacion()) && Objects.equals(getUltimaCotizacionBase(), that.getUltimaCotizacionBase()) && Objects.equals(getTomador(), that.getTomador()) && Objects.equals(getConductorPrincipal(), that.getConductorPrincipal()) && Objects.equals(getConductoresOcasionales(), that.getConductoresOcasionales()) && Objects.equals(getFechaInicioAnualidad(), that.getFechaInicioAnualidad()) && Objects.equals(getFechaFinAnualidad(), that.getFechaFinAnualidad()) && Objects.equals(getFechaAnulacion(), that.getFechaAnulacion());
    }

    public int hashCode() {
        return Objects.hash(getId(), getNumero(), getAnualidades(), getEstadoPoliza(), getMotivoAnulacion(), getUltimaCotizacionBase(), getTomador(), getConductorPrincipal(), getConductoresOcasionales(), getPrecioModalidad(), getPrecioFinal(), getFechaInicioAnualidad(), getFechaFinAnualidad(), getFechaAnulacion());
    }

    public String toString() {
        return "PolizaIMPL{id=" + id + ", numero=" + numero + ", anualidades=" + anualidades + ", estadoPoliza=" + estadoPoliza + ", motivoAnulacion=" + motivoAnulacion + ", ultimaCotizacionBase=" + ultimaCotizacionBase + ", tomador=" + tomador + ", conductorPrincipal=" + conductorPrincipal + ", conductoresOcasionales=" + conductoresOcasionales + ", precioModalidad=" + precioModalidad + ", precioFinal=" + precioFinal + ", fechaInicioAnualidad=" + fechaInicioAnualidad + ", fechaFinAnualidad=" + fechaFinAnualidad + ", fechaAnulacion=" + fechaAnulacion + "}";
    }
}
