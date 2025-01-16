package cancion;

import Vuelo.Fecha;

public interface Cancion {
    public String getNombre();
    public String getInterprete();
    public Integer getDuracion();
    public Fecha getFechaL();
    public String getGenero();
    public Integer getNum_repro();
    public void setNum_repro(Integer num_repro);
    public Double getCal();
    public void setCal(Double cal);
    public Boolean getReproducir();
    public void setReproducir(Boolean reproducir);
}
