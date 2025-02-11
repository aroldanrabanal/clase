import modelos.*;

import java.time.LocalDate;

public class pruebaV1 {
    public static void main(String[] args) {
        ProvinciaIMPL pro = new ProvinciaIMPL("Madrid", "01256");

        DireccionIMPL direccion = new DireccionIMPL(1, DireccionIMPL.tipoVia.calle, "Gran Via", 10, "Apto 1", "28001", "Madrid", pro);

        PersonaIMPL persona = new PersonaIMPL(1, "Juan", "Pérez", "Gómez", "29497781M", LocalDate.of(1985, 5, 20), direccion);

        ConductorIMPL conductor = new ConductorIMPL(2, "Ana", "López", "Martínez", "29497781M", LocalDate.of(1990, 8, 15), direccion, LocalDate.of(2010, 1, 1), 12, 5);

        VehiculoIMPL vehiculo = new VehiculoIMPL(1, "Mazda", "CX-5", "12345AS", LocalDate.now(), "negro", persona);

        CocheIMPL coche = new CocheIMPL(3, "Toyota", "Corolla", "1234ABC", LocalDate.of(2020, 4, 10), "Rojo", persona, 5, CocheIMPL.TipoCombustible.GASOLINA, CocheIMPL.Traccion.DELANTERA, false);

        MotoIMPL moto = new MotoIMPL(4, "Yamaha", "MT-07", "5678DEF", LocalDate.of(2021, 7, 15), "Negra", persona, 689, false);


        System.out.println(direccion);
        System.out.println(persona);
        System.out.println(conductor);
        System.out.println(vehiculo);
        System.out.println(coche);
        System.out.println(moto);
    }
}
