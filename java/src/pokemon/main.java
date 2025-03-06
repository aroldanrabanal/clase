package pokemon;
import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        pokemon bulbasaur = new pokemonIMPL(1, "Bulbasaur", "Este Pokémon nace con una semilla en el lomo, que brota con el paso del tiempo.", 0.7, 6.9, pokemonIMPL.Genero.MASCULINO, "Planta/Veneno");
        ataque latigoCepa = new ataqueIMPL("Latigo Cepa", 10);
        ataque ascuas = new ataqueIMPL("Ascuas", 15);

        pokemon charmander = new pokemonIMPL(4, "Charmander", "La llama en su cola indica su salud.", 0.6, 8.5, pokemonIMPL.Genero.MASCULINO, "Fuego");

        Map<String, String> debilidades = new HashMap<>();
        debilidades.put("Planta/Veneno", "Fuego");
        debilidades.put("Fuego", "Agua");
        pokedex p = new pokedexIMPL(bulbasaur, debilidades, latigoCepa);
        pokedex p2 = new pokedexIMPL(charmander, debilidades, ascuas);
        pokemon masDebil = debilidades.getOrDefault(bulbasaur.getTipo(), "").equals(charmander.getTipo()) ? bulbasaur : charmander;

        System.out.println(p);
        System.out.println();
        System.out.println(p2);
        System.out.println();
        System.out.println("El Pokémon más débil es: " + masDebil.getNombre());
    }
}
