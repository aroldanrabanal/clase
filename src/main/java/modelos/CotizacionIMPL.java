package modelos;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class CotizacionIMPL {
    private int id;
    private int codigo;
    private LocalDate fechaCotizacion;
    private LocalDate fechaInicio;
    private VehiculoIMPL vehiculo;
    private PersonaIMPL tomador;
    private ConductorIMPL conductorPrincipal;
    private List<ConductorIMPL> conductoresOcasionales;
    private boolean tieneAparcamientoPrivado;
    private int numSini5;
    private double precioTERC;
    private double precioTAMP;
    private double precioTRIE;
    private modalidadElegida modalidadElegida;
    public enum modalidadElegida{
        TERC, TAMP, TRIE;
    }

    //Constructor
    public CotizacionIMPL(int id, int codigo, LocalDate fechaCotizacion, LocalDate fechaInicio, VehiculoIMPL vehiculo, PersonaIMPL tomador, ConductorIMPL conductorPrincipal, List<ConductorIMPL> conductoresOcasionales, boolean tieneAparcamientoPrivado, int numSini5, double precioTERC, double precioTAMP, double precioTRIE, CotizacionIMPL.modalidadElegida modalidadElegida) {
        this.id = id;
        this.codigo = codigo;
        this.fechaCotizacion = fechaCotizacion;
        this.fechaInicio = fechaInicio;
        this.vehiculo = vehiculo;
        this.tomador = tomador;
        this.conductorPrincipal = conductorPrincipal;
        this.conductoresOcasionales = conductoresOcasionales;
        this.tieneAparcamientoPrivado = tieneAparcamientoPrivado;
        this.numSini5 = numSini5;
        this.precioTERC = precioTERC;
        this.precioTAMP = precioTAMP;
        this.precioTRIE = precioTRIE;
        this.modalidadElegida = modalidadElegida;
    }

    //Constructor Vacio
    public CotizacionIMPL() {
        this.id = 0;
        this.codigo = 0;
        this.fechaCotizacion = null;
        this.fechaInicio = null;
        this.vehiculo = null;
        this.tomador = null;
        this.conductorPrincipal = null;
        this.conductoresOcasionales = null;
        this.tieneAparcamientoPrivado = false;
        this.numSini5 = 0;
        this.precioTERC = 0;
        this.precioTAMP = 0;
        this.precioTRIE = 0;
        this.modalidadElegida = null;
    }

    //Construcor Copia
    public CotizacionIMPL(CotizacionIMPL cotizacion) {
        this.id = cotizacion.id;
        this.codigo = cotizacion.codigo;
        this.fechaCotizacion = cotizacion.fechaCotizacion;
        this.fechaInicio = cotizacion.fechaInicio;
        this.vehiculo = cotizacion.vehiculo;
        this.tomador = cotizacion.tomador;
        this.conductorPrincipal = cotizacion.conductorPrincipal;
        this.conductoresOcasionales = cotizacion.conductoresOcasionales;
        this.tieneAparcamientoPrivado = cotizacion.tieneAparcamientoPrivado;
        this.numSini5 = cotizacion.numSini5;
        this.precioTERC = cotizacion.precioTERC;
        this.precioTAMP = cotizacion.precioTAMP;
        this.precioTRIE = cotizacion.precioTRIE;
        this.modalidadElegida = cotizacion.modalidadElegida;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFechaCotizacion() {
        return fechaCotizacion;
    }

    public void setFechaCotizacion(LocalDate fechaCotizacion) {
        this.fechaCotizacion = fechaCotizacion;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public VehiculoIMPL getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(VehiculoIMPL vehiculo) {
        this.vehiculo = vehiculo;
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

    public boolean isTieneAparcamientoPrivado() {
        return tieneAparcamientoPrivado;
    }

    public void setTieneAparcamientoPrivado(boolean tieneAparcamientoPrivado) {
        this.tieneAparcamientoPrivado = tieneAparcamientoPrivado;
    }

    public int getNumSini5() {
        return numSini5;
    }

    public void setNumSini5(int numSini5) {
        this.numSini5 = numSini5;
    }

    public double getPrecioTERC() {
        return precioTERC;
    }

    public void setPrecioTERC(double precioTERC) {
        this.precioTERC = precioTERC;
    }

    public double getPrecioTAMP() {
        return precioTAMP;
    }

    public void setPrecioTAMP(double precioTAMP) {
        this.precioTAMP = precioTAMP;
    }

    public double getPrecioTRIE() {
        return precioTRIE;
    }

    public void setPrecioTRIE(double precioTRIE) {
        this.precioTRIE = precioTRIE;
    }

    public modalidadElegida getModalidadElegida() {
        return modalidadElegida;
    }

    public void setModalidadElegida(modalidadElegida modalidadElegida) {
        this.modalidadElegida = modalidadElegida;
    }

    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CotizacionIMPL that = (CotizacionIMPL) o;
        return getId() == that.getId() && getCodigo() == that.getCodigo() && isTieneAparcamientoPrivado() == that.isTieneAparcamientoPrivado() && getNumSini5() == that.getNumSini5() && Double.compare(getPrecioTERC(), that.getPrecioTERC()) == 0 && Double.compare(getPrecioTAMP(), that.getPrecioTAMP()) == 0 && Double.compare(getPrecioTRIE(), that.getPrecioTRIE()) == 0 && Objects.equals(getFechaCotizacion(), that.getFechaCotizacion()) && Objects.equals(getFechaInicio(), that.getFechaInicio()) && Objects.equals(getVehiculo(), that.getVehiculo()) && Objects.equals(getTomador(), that.getTomador()) && Objects.equals(getConductorPrincipal(), that.getConductorPrincipal()) && Objects.equals(getConductoresOcasionales(), that.getConductoresOcasionales()) && getModalidadElegida() == that.getModalidadElegida();
    }

    public int hashCode() {
        return Objects.hash(getId(), getCodigo(), getFechaCotizacion(), getFechaInicio(), getVehiculo(), getTomador(), getConductorPrincipal(), getConductoresOcasionales(), isTieneAparcamientoPrivado(), getNumSini5(), getPrecioTERC(), getPrecioTAMP(), getPrecioTRIE(), getModalidadElegida());
    }

    public String toString() {
        return "CotizacionIMPL{" +
                "id=" + id +
                ", codigo=" + codigo +
                ", fechaCotizacion=" + fechaCotizacion +
                ", fechaInicio=" + fechaInicio +
                ", vehiculo=" + vehiculo +
                ", tomador=" + tomador +
                ", conductorPrincipal=" + conductorPrincipal +
                ", conductoresOcasionales=" + conductoresOcasionales +
                ", tieneAparcamientoPrivado=" + tieneAparcamientoPrivado +
                ", numSini5=" + numSini5 +
                ", precioTERC=" + precioTERC +
                ", precioTAMP=" + precioTAMP +
                ", precioTRIE=" + precioTRIE +
                ", modalidadElegida=" + modalidadElegida +
                '}';
    }
}
