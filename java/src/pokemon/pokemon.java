package pokemon;

public interface pokemon {
    public int getNumero();

    public String getNombre();

    public String getTipo();

    public String getDescripcion();

    public void setDescripcion(String descripcion) ;

    public double getAltura();

    public void setAltura(double altura);

    public pokemonIMPL.Genero getGenero();

    public void setGenero(pokemonIMPL.Genero genero);

    public double getPeso();

    public void setPeso(double peso);

}
