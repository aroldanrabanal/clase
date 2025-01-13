package Vuelo;
import java.util.Date;
public interface Vuelo {
    public String getCodigo();
    public String getDestino();
    public Double getPrecio();
    public void setPrecio(Double precio);
    public Integer getNumeroPlazas();
    public Integer getNumeroPasajeros();
    public void setNumeroPasajeros(String numeroPasajeros);
    public Double getRecaudacion();
    public Date getFechaSalida();
}
