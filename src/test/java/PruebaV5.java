import modelos.*;
import utilidades.UtilidadesAseguradora;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PruebaV5 {
    public static void main(String[] args) {
        ProvinciaIMPL provincia = new ProvinciaIMPL("Álava", "01");
        DireccionIMPL direccion = new DireccionIMPL(1, DireccionIMPL.tipoVia.calle, "Nombre", 11, "Ap1", "41930", "Sevilla", provincia);
        PersonaIMPL tomador = new PersonaIMPL(1, "Juan", "Pérez", "García", "29497781M", LocalDate.of(1980, 1, 1), direccion);
        ConductorIMPL conductorPrincipal = new ConductorIMPL(1, "María", "López", "Martínez", "55187741T", LocalDate.of(1997, 1, 1), direccion, LocalDate.of(2000, 1, 1), 10, 5);
        List<ConductorIMPL> conductoresOcasionales = new ArrayList<>();
        conductoresOcasionales.add(new ConductorIMPL(2, "Carlos", "Sánchez", "Fernández", "80588546L", LocalDate.of(1991, 1, 1), direccion, LocalDate.of(2000, 1, 1), 10, 5));
        conductoresOcasionales.add(new ConductorIMPL(3, "Ana", "Gómez", "Rodríguez", "68796833S", LocalDate.of(1999, 1, 1), direccion, LocalDate.of(2000, 1, 1), 10, 5));
        VehiculoIMPL vehiculo = new VehiculoIMPL(1, "Toyota", "Corolla", "1234ABC", LocalDate.of(2020, 1, 1), "Blanco", tomador);
        CotizacionIMPL cotizacion = new CotizacionIMPL(1, 1001, LocalDate.now(), LocalDate.now().plusDays(1), vehiculo, tomador, conductorPrincipal, conductoresOcasionales, true, 2, 0, 0, 0, CotizacionIMPL.modalidadElegida.TERC);
        AnualidadPolizaIMPL anualidad = new AnualidadPolizaIMPL(1, "POL123", AnualidadPolizaIMPL.EstadoPoliza.Vigente, "", cotizacion, AnualidadPolizaIMPL.modoPago.IBAN, false, tomador, conductorPrincipal, conductoresOcasionales, 1000, 1200, LocalDate.now(), LocalDate.now().plusYears(1), null);
        List<AnualidadPolizaIMPL> anualidades = new ArrayList<>();
        anualidades.add(anualidad);
        PolizaIMPL poliza = new PolizaIMPL(1, "POL123", anualidades, PolizaIMPL.EstadoPoliza.VIGENTE, "", cotizacion, tomador, conductorPrincipal, conductoresOcasionales, 1000, 1200, LocalDate.now(), LocalDate.now().plusYears(1), null);

        AseguradoraIMPL aseguradora = new AseguradoraIMPL(1, "Aseguradora XYZ", direccion, "123456789", new ArrayList<>());
        aseguradora.setListPolizas(new ArrayList<>());
        aseguradora.addPoliza(poliza);

        PolizaIMPL polizaRecuperada = UtilidadesAseguradora.recuperaPoliza(aseguradora, "POL123");
        System.out.println("Póliza recuperada: " + polizaRecuperada);

        List<PolizaIMPL> polizasActivas = UtilidadesAseguradora.recuperaPolizasActivas(aseguradora);
        System.out.println("Pólizas activas: " + polizasActivas);

        List<PolizaIMPL> polizasPorTomador = UtilidadesAseguradora.recuperaPolizasPorTomador(aseguradora, "29497781M");
        System.out.println("Pólizas por NIF del tomador: " + polizasPorTomador);

        List<PolizaIMPL> polizasPorConductor = UtilidadesAseguradora.recuperaPolizasPorConductor(aseguradora, "55187741T");
        System.out.println("Pólizas por NIF del conductor: " + polizasPorConductor);
    }
}