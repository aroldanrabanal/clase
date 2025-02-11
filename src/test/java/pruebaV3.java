import modelos.DireccionIMPL;
import modelos.PersonaIMPL;
import modelos.ProvinciaIMPL;

import java.time.LocalDate;

public class pruebaV3 {
    public static void main(String[] args) {
        ProvinciaIMPL pro = new ProvinciaIMPL("Madrid", "01256");

        DireccionIMPL direccion = new DireccionIMPL(1, DireccionIMPL.tipoVia.calle, "Gran Via", 10, "Apto 1", "28001", "Madrid", pro);

        PersonaIMPL persona = new PersonaIMPL(1, "Juan", "Pérez", "Gómez", "29497781M", LocalDate.of(1985, 5, 20), direccion);


    }
}
