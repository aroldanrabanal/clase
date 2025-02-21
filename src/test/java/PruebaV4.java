import modelos.*;
import utilidades.UtilidadesSopVeh;

import java.time.LocalDate;
import java.util.List;

public class PruebaV4 {
    public static void main(String[] args) {
        ProvinciaIMPL provincia = new ProvinciaIMPL("Álava", "01");
        DireccionIMPL direccion = new DireccionIMPL(1, DireccionIMPL.tipoVia.calle, "Nombre", 11, "Ap1", "41930", "Sevilla", provincia);
        ConductorIMPL conductor = new ConductorIMPL(1, "Nombre", "apellido1", "Apellido2", "77976529C", LocalDate.of(2000,5,1), direccion, LocalDate.of(2000,1,1), 10, 5);
        ConductorIMPL conductor2 = new ConductorIMPL(1, "Nombre", "apellido1", "Apellido2", "77976529C", LocalDate.of(2000,5,1), direccion, LocalDate.of(2000,1,1), 10, 5);
        PersonaIMPL persona = new PersonaIMPL(1, "Nombre", "apellido1", "Apellido2", "77976529C", LocalDate.of(2006,4,14), direccion);
        VehiculoIMPL vehiculo = new VehiculoIMPL(1, "Seat", "Leon", "CGPC0000", LocalDate.of(2005,1,1), "Rojo", persona);
        List<ConductorIMPL> listaConductores = List.of(conductor, conductor2);
        CotizacionIMPL cotizacion = new CotizacionIMPL(0, 1, LocalDate.of(2025, 1 ,1), LocalDate.of(2025, 2, 1), vehiculo, persona, conductor, listaConductores, false, 1, 1.5, 2.5, 3.5, CotizacionIMPL.modalidadElegida.TERC);
        AnualidadPolizaIMPL polizaanual = new AnualidadPolizaIMPL(1, "1", AnualidadPolizaIMPL.EstadoPoliza.Vigente, "Motivo", cotizacion, AnualidadPolizaIMPL.modoPago.IBAN, false, persona, conductor, listaConductores, 2.5, 3.5, LocalDate.of(2006, 4, 14), LocalDate.of(2014, 5, 26), LocalDate.of(2024, 5, 5));
        AnualidadPolizaIMPL polizaanual2 = new AnualidadPolizaIMPL(1, "1", AnualidadPolizaIMPL.EstadoPoliza.Vigente, "Motivo", cotizacion, AnualidadPolizaIMPL.modoPago.IBAN, false, persona, conductor, listaConductores, 2.5, 3.5, LocalDate.of(2006, 4, 14), LocalDate.of(2014, 5, 26), LocalDate.of(2024, 5, 5));
        List<AnualidadPolizaIMPL> listanualpoliza = List.of(polizaanual, polizaanual2);
        PolizaIMPL poliza = new PolizaIMPL(1, "1", listanualpoliza, PolizaIMPL.EstadoPoliza.VIGENTE,"Motivo", cotizacion, persona, conductor, listaConductores, 20.5, 3.5, LocalDate.of(2006, 4, 14), LocalDate.of(2014, 5, 26), LocalDate.of(2024, 5, 5));

        System.out.println(cotizacion);
        System.out.println(polizaanual);
        System.out.println(poliza);
        UtilidadesSopVeh utilidades = new UtilidadesSopVeh();
        String preciosFinales = utilidades.mostrarPreciosFinales(
                vehiculo.getMarca().getNombre(), vehiculo.getModelo().getNombre(), vehiculo.getFechaMatriculacion().getYear(), "28001", true,
                false, true, 2
        );

        System.out.println(preciosFinales);
    }
}

