package utilidades;

import com.aseguradora.utils.SoporteVehiculos;
import com.aseguradora.utils.Tarifa;

public class UtilidadesSopVeh {
    SoporteVehiculos sp = SoporteVehiculos.getInstance();

    public Tarifa calcularTarifa(String marca, String modelo, int anyo, String cp, boolean tieneParking, boolean conductorMenor25, boolean conductorPrincipalMenor25, int siniestrosConCulpa) throws IllegalArgumentException {
        Tarifa tarifaBase = sp.calcularTarifa(marca, modelo, anyo);

        double multiplicadorCP = sp.multiplicadorCP(cp);
        double multiplicadorParking = tieneParking ? 0.9 : 1.1;
        double multiplicadorEdad = 1.0;
        if (conductorPrincipalMenor25) {
            multiplicadorEdad = 1.3;
        } else if (conductorMenor25) {
            multiplicadorEdad = 1.1;
        }
        double multiplicadorSiniestros = 1.0 + (siniestrosConCulpa * 0.1);

        double nuevoPrecioTERC = tarifaBase.getPrecioTERC() * multiplicadorCP * multiplicadorParking * multiplicadorEdad * multiplicadorSiniestros;
        double nuevoPrecioTAMP = tarifaBase.getPrecioTAMP() * multiplicadorCP * multiplicadorParking * multiplicadorEdad * multiplicadorSiniestros;
        double nuevoPrecioTRIE = tarifaBase.getPrecioTRIE() * multiplicadorCP * multiplicadorParking * multiplicadorEdad * multiplicadorSiniestros;

        return new Tarifa(marca, modelo, anyo, nuevoPrecioTERC, nuevoPrecioTAMP, nuevoPrecioTRIE);
    }

    public String mostrarPreciosFinales(String marca, String modelo, int anyo, String cp, boolean tieneParking, boolean conductorMenor25, boolean conductorPrincipalMenor25, int siniestrosConCulpa) {
        Tarifa tarifa = calcularTarifa(marca, modelo, anyo, cp, tieneParking, conductorMenor25, conductorPrincipalMenor25, siniestrosConCulpa);
        return String.format("Precios finales para %s %s (%d):\nTERC: %.2f\nTAMP: %.2f\nTRIE: %.2f",
                marca, modelo, anyo, tarifa.getPrecioTERC(), tarifa.getPrecioTAMP(), tarifa.getPrecioTRIE());
    }
}