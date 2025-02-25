import modelos.*;
import utilidades.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.aseguradora.utils.*;

public class PruebaCotizacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AseguradoraIMPL aseguradora = new AseguradoraIMPL(1, "XYZ Seguros", null, "987654321", new ArrayList<>());
        aseguradora.setListPolizas(new ArrayList<>());

        boolean hecho = false;
        while (!hecho) {
            try {
                System.out.println("¿Qué tipo de vehículo? (1 para Coche, 2 para Moto)");
                int tipoVehiculo = Integer.parseInt(scanner.nextLine());
                System.out.println("Marca: ");
                String marca = scanner.nextLine();
                System.out.println("Modelo: ");
                String modelo = scanner.nextLine();
                System.out.println("Matrícula (4 números + 3 letras, ej. 1234ABC): ");
                String matricula = scanner.nextLine();
                System.out.println("Año de matriculación (ej. 2018): ");
                int anyo = -1;
                try {
                    anyo = Integer.parseInt(scanner.nextLine().trim());
                    if (anyo < 1900 || anyo > LocalDate.now().getYear()) {
                        throw new IllegalArgumentException("Año de matriculación inválido. Debe estar entre 1900 y " + LocalDate.now().getYear());
                    }
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Año debe ser un número válido");
                }
                System.out.println("Color: ");
                String color = scanner.nextLine();

                if (!UtilidadesVehiculo.esMatriculaValida(matricula)) {
                    throw new IllegalArgumentException("Matrícula no válida. Use formato 1234ABC");
                }
                LocalDate fechaMatriculacion = LocalDate.of(anyo, 1, 1);
                if (!UtilidadesVehiculo.validaFechaMatriculacion(fechaMatriculacion)) {
                    throw new IllegalArgumentException("Fecha de matriculación no puede ser futura (hoy es " + LocalDate.now() + ")");
                }

                VehiculoIMPL vehiculo;
                if (tipoVehiculo == 1) {
                    System.out.println("Número de puertas: ");
                    int puertas = Integer.parseInt(scanner.nextLine());
                    System.out.println("Tipo de combustible (1: Gasolina, 2: Diesel, 3: Eléctrico, 4: Híbrido): ");
                    int combustible = Integer.parseInt(scanner.nextLine());
                    System.out.println("Tracción (1: Delantera, 2: Trasera, 3: Total): ");
                    int traccion = Integer.parseInt(scanner.nextLine());
                    CocheIMPL.TipoCombustible tipoCombustible = CocheIMPL.TipoCombustible.values()[combustible - 1];
                    CocheIMPL.Traccion tipoTraccion = CocheIMPL.Traccion.values()[traccion - 1];
                    vehiculo = new CocheIMPL(1, marca, modelo, matricula, fechaMatriculacion, color, null,
                            puertas, tipoCombustible, tipoTraccion, false);
                } else {
                    System.out.println("Cilindrada (cc): ");
                    int cilindrada = Integer.parseInt(scanner.nextLine());
                    System.out.println("¿Tiene sidecar? (s/n): ");
                    boolean sidecar = scanner.nextLine().toLowerCase().startsWith("s");
                    vehiculo = new MotoIMPL(1, marca, modelo, matricula, fechaMatriculacion, color, null,
                            cilindrada, sidecar);
                }

                System.out.println("Datos del tomador:");
                System.out.println("Nombre: ");
                String nombre = scanner.nextLine();
                System.out.println("Apellido 1: ");
                String apellido1 = scanner.nextLine();
                System.out.println("Apellido 2: ");
                String apellido2 = scanner.nextLine();
                System.out.println("NIF (8 números + 1 letra, ej. 12345678Z): ");
                String nif = scanner.nextLine();
                if (!UtilididadesPersona.esNIFValido(nif)) {
                    throw new IllegalArgumentException("NIF no válido");
                }
                System.out.println("Fecha de nacimiento (YYYY-MM-DD): ");
                LocalDate fechaNacimiento = LocalDate.parse(scanner.nextLine());
                System.out.println("Sexo (1: Masculino, 2: Femenino, 3: N/A): ");
                int sexo = Integer.parseInt(scanner.nextLine());
                System.out.println("País de origen: ");
                String pais = scanner.nextLine();
                System.out.println("Email: ");
                String email = scanner.nextLine();
                System.out.println("Teléfono: ");
                String telefono = scanner.nextLine();

                ProvinciaIMPL provincia = new ProvinciaIMPL("Madrid", "28");
                DireccionIMPL direccion = new DireccionIMPL(1, DireccionIMPL.tipoVia.calle, "Mayor", 10, "Piso 2A",
                        "28001", "Madrid", provincia);
                PersonaIMPL tomador = new PersonaIMPL(1, nombre, apellido1, apellido2, nif, fechaNacimiento, direccion,
                        PersonaIMPL.Sexo.values()[sexo - 1], pais, email, telefono);

                vehiculo.setPersona(tomador);

                System.out.println("¿El conductor principal es el mismo que el tomador? (s/n): ");
                boolean mismoConductor = scanner.nextLine().toLowerCase().startsWith("s");
                ConductorIMPL conductorPrincipal;
                if (mismoConductor) {
                    conductorPrincipal = new ConductorIMPL(tomador.getId(), tomador.getNombre(), tomador.getApellido1(),
                            tomador.getApellido2(), tomador.getNif(), tomador.getFechaNacimiento(), tomador.getDireccion(),
                            LocalDate.of(2010, 1, 1), 12, 5);
                } else {
                    System.out.println("Datos del conductor principal:");
                    System.out.println("Nombre: ");
                    String nombreConductor = scanner.nextLine();
                    System.out.println("Apellido 1: ");
                    String apellido1Conductor = scanner.nextLine();
                    System.out.println("Apellido 2: ");
                    String apellido2Conductor = scanner.nextLine();
                    System.out.println("NIF (8 números + 1 letra, ej. 12345678Z): ");
                    String nifConductor = scanner.nextLine();
                    if (!UtilididadesPersona.esNIFValido(nifConductor)) {
                        throw new IllegalArgumentException("NIF del conductor no válido");
                    }
                    System.out.println("Fecha de nacimiento (YYYY-MM-DD): ");
                    LocalDate fechaNacimientoConductor = LocalDate.parse(scanner.nextLine());
                    conductorPrincipal = new ConductorIMPL(2, nombreConductor, apellido1Conductor, apellido2Conductor,
                            nifConductor, fechaNacimientoConductor, direccion, LocalDate.of(2010, 1, 1), 12, 5);
                }

                List<ConductorIMPL> conductoresOcasionales = new ArrayList<>();
                System.out.println("¿Hay un conductor ocasional? (s/n): ");
                if (scanner.nextLine().toLowerCase().startsWith("s")) {
                    System.out.println("Datos del conductor ocasional:");
                    System.out.println("Nombre: ");
                    String nombreOcasional = scanner.nextLine();
                    System.out.println("Apellido 1: ");
                    String apellido1Ocasional = scanner.nextLine();
                    System.out.println("Apellido 2: ");
                    String apellido2Ocasional = scanner.nextLine();
                    System.out.println("NIF (8 números + 1 letra, ej. 12345678Z): ");
                    String nifOcasional = scanner.nextLine();
                    if (!UtilididadesPersona.esNIFValido(nifOcasional)) {
                        throw new IllegalArgumentException("NIF del conductor ocasional no válido");
                    }
                    System.out.println("Fecha de nacimiento (YYYY-MM-DD): ");
                    LocalDate fechaNacimientoOcasional = LocalDate.parse(scanner.nextLine());
                    ConductorIMPL ocasional = new ConductorIMPL(3, nombreOcasional, apellido1Ocasional, apellido2Ocasional,
                            nifOcasional, fechaNacimientoOcasional, direccion, LocalDate.of(2010, 1, 1), 12, 5);
                    conductoresOcasionales.add(ocasional);
                }

                System.out.println("¿Tiene aparcamiento privado? (s/n): ");
                boolean parkingPrivado = scanner.nextLine().toLowerCase().startsWith("s");
                int siniestros = -1;
                while (siniestros < 0) {
                    System.out.println("Número de siniestros con culpa en 5 años: ");
                    try {
                        String input = scanner.nextLine().trim();
                        if (input.isEmpty()) {
                            System.out.println("Por favor, ingrese un número válido (no deje vacío).");
                            continue;
                        }
                        siniestros = Integer.parseInt(input);
                        if (siniestros < 0) {
                            System.out.println("El número de siniestros debe ser 0 o mayor. Intente de nuevo.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Error: Entrada numérica inválida - " + e.getMessage());
                    }
                }

                System.out.println("Fecha de inicio del seguro (YYYY-MM-DD): ");
                LocalDate fechaInicio = LocalDate.parse(scanner.nextLine());

                UtilidadesSopVeh utilidadesSopVeh = new UtilidadesSopVeh();
                boolean conductorMenor25 = !conductoresOcasionales.isEmpty() && UtilididadesPersona.esMenor25(conductoresOcasionales.get(0));
                boolean conductorPrincipalMenor25 = UtilididadesPersona.esMenor25(conductorPrincipal);
                Tarifa tarifa = utilidadesSopVeh.calcularTarifa(marca, modelo, anyo, "28001",
                        parkingPrivado, conductorMenor25, conductorPrincipalMenor25, siniestros);

                CotizacionIMPL cotizacion = new CotizacionIMPL(1, 1001, LocalDate.now(), fechaInicio,
                        vehiculo, tomador, conductorPrincipal, conductoresOcasionales, parkingPrivado, siniestros,
                        tarifa.getPrecioTERC(), tarifa.getPrecioTAMP(), tarifa.getPrecioTRIE(), null);

                System.out.println("Modalidades de seguro disponibles:");
                System.out.println("1. Terceros: " + String.format("%.2f", tarifa.getPrecioTERC()) + " €");
                System.out.println("2. Terceros Ampliado: " + String.format("%.2f", tarifa.getPrecioTAMP()) + " €");
                System.out.println("3. Todo Riesgo: " + String.format("%.2f", tarifa.getPrecioTRIE()) + " €");
                System.out.println("¿Qué modalidad elige? (1-3, o 0 para no contratar): ");
                int opcionModalidad = Integer.parseInt(scanner.nextLine());

                if (opcionModalidad == 0) {
                    System.out.println("No se ha contratado el seguro.");
                    return;
                }

                CotizacionIMPL.modalidadElegida modalidad = CotizacionIMPL.modalidadElegida.values()[opcionModalidad - 1];
                cotizacion.setModalidadElegida(modalidad);

                System.out.println("Método de pago (1: IBAN, 2: Tarjeta): ");
                int pago = Integer.parseInt(scanner.nextLine());
                AnualidadPolizaIMPL.modoPago modoPago = AnualidadPolizaIMPL.modoPago.values()[pago - 1];
                System.out.println("¿Fraccionar pago? (s/n): ");
                boolean fraccionado = scanner.nextLine().toLowerCase().startsWith("s");
                double precioFinal = modalidad == CotizacionIMPL.modalidadElegida.TERC ? tarifa.getPrecioTERC() :
                        modalidad == CotizacionIMPL.modalidadElegida.TAMP ? tarifa.getPrecioTAMP() :
                                tarifa.getPrecioTRIE();
                if (fraccionado) {
                    precioFinal *= 1.05;
                }

                AnualidadPolizaIMPL anualidad = new AnualidadPolizaIMPL(1, "XYZ/" + fechaInicio.getYear() + "/000001",
                        AnualidadPolizaIMPL.EstadoPoliza.Vigente, null, cotizacion, modoPago, fraccionado,
                        tomador, conductorPrincipal, conductoresOcasionales, precioFinal, precioFinal,
                        fechaInicio, fechaInicio.plusYears(1), null);

                List<AnualidadPolizaIMPL> anualidades = new ArrayList<>();
                anualidades.add(anualidad);
                PolizaIMPL poliza = new PolizaIMPL(1, "XYZ/" + fechaInicio.getYear() + "/000001", anualidades,
                        PolizaIMPL.EstadoPoliza.VIGENTE, null, cotizacion, tomador, conductorPrincipal,
                        conductoresOcasionales, precioFinal, precioFinal, fechaInicio, fechaInicio.plusYears(1), null);

                aseguradora.addPoliza(poliza);

                System.out.println("Resumen de la póliza contratada:");
                System.out.println("Número de póliza: " + poliza.getNumero());
                System.out.println("Tomador: " + tomador.getNombre() + " " + tomador.getApellido1() + " " + tomador.getApellido2());
                System.out.println("Vehículo: " + marca + " " + modelo);
                System.out.println("Modalidad: " + modalidad);
                System.out.println("Precio final: " + String.format("%.2f", precioFinal) + " €");
                System.out.println("Fecha inicio: " + fechaInicio + ", Fecha fin: " + fechaInicio.plusYears(1));

                hecho = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: Entrada numérica inválida - " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Error: Dato inválido - " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error inesperado: " + e.getMessage());
            }
        }
        scanner.close();
    }
}