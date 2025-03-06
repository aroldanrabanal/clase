package pokemon;

import java.util.Map;

public class pokedexIMPL implements pokedex{
    private pokemon pokemon;
    private Map<String, String> debilidad;
    private ataque ataque;

    public pokedexIMPL(pokemon pokemon, Map<String, String> debilidad, ataque ataque) {
        this.pokemon = pokemon;
        this.debilidad = debilidad;
        this.ataque = ataque;
    }

    public pokemon getPokemon() {
        return pokemon;
    }

    public Map<String, String> getDebilidad() {
        return debilidad;
    }

    public ataque getAtaque() {
        return ataque;
    }

    public static pokemon comparador(pokemon p1, pokemon p2, Map<String, String> debilidad) {
        return debilidad.getOrDefault(p1.getTipo(), "").equals(p2.getTipo()) ? p1 : p2;
    }

    public String toString() {
        return pokemon.toString() + "\n" + "Ataque: " + ataque;
    }
}
