package pokemon;

public class ataqueIMPL implements ataque{
    private String nombre_ataque;
    private int dano;

    public ataqueIMPL(String nombre_ataque, int dano) {
        this.nombre_ataque = nombre_ataque;
        this.dano = dano;
    }

    public String getNombre_ataque() {
        return nombre_ataque;
    }

    public void setNombre_ataque(String nombre_ataque) {
        this.nombre_ataque = nombre_ataque;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public String toString() {
        return nombre_ataque+", "+dano;
    }
}
