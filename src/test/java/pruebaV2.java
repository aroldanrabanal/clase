import modelos.*;
import utilidades.*;

import java.time.LocalDate;
import java.util.List;

public class pruebaV2 {
    public static void main(String[] args) {
        String nif = "X1234567L";

        System.out.println(UtilididadesPersona.esNIFValido(nif));
        ProvinciaIMPL pro = new ProvinciaIMPL("Madrid", "01256");

        DireccionIMPL direccion = new DireccionIMPL(1, DireccionIMPL.tipoVia.calle, "Gran Via", 10, "Apto 1", "28001", "Madrid", pro);

        PersonaIMPL persona = new PersonaIMPL(1, "Juan", "Pérez", "Gómez", "29497781M", LocalDate.of(2005, 5, 20), direccion);

        System.out.println(UtilididadesPersona.esNIFValido(persona));
        System.out.println(UtilididadesPersona.getEdad(persona));
        System.out.println(UtilididadesPersona.esMayorEdad(persona));
        System.out.println(UtilididadesPersona.esMenor25(persona));

        String matricula ="6245HML";
        String matriculaSS = "CNP5678AB";
        System.out.println(UtilidadesVehiculo.esMatriculaValida(matricula));
        System.out.println(UtilidadesVehiculo.esMatriculaValida(matriculaSS));

        PersonaIMPL persona2 = new PersonaIMPL(8, "Juan", "Pérez", "Gómez", "29497781M", LocalDate.of(2005, 5, 20), direccion, PersonaIMPL.Sexo.masculino, "España", "a@a.a", "123456789");

        VehiculoIMPL vehiculo = new VehiculoIMPL(1, "alguna", "alguno", "5662JKN", LocalDate.of(2005,5,6), "negro", persona);
        VehiculoIMPL vehiculo2 = new VehiculoIMPL();
        VehiculoIMPL vehiculo3 = new VehiculoIMPL(2, "algunasd", "asd", "5662JKN", LocalDate.now(), "negro", persona2);


        System.out.println(UtilidadesVehiculo.esMatriculaValida(vehiculo));
        System.out.println(UtilidadesVehiculo.calculaEdad(vehiculo));
        List<VehiculoIMPL> listaVehiculos = List.of(vehiculo, vehiculo2, vehiculo3);
        System.out.println(UtilidadesVehiculo.getVehiculos(listaVehiculos, persona));
        System.out.println(UtilidadesVehiculo.validaFechaMatriculacion(vehiculo.getFechaMatriculacion()));

        AseguradoraIMPL aseguradora = new AseguradoraIMPL(1,"prueba", direccion, "963852741", listaVehiculos);

        System.out.println(persona2);
        System.out.println(aseguradora);

    }
}
