package utilidades;

import modelos.*;

import java.util.ArrayList;
import java.util.List;

public class UtilidadesAseguradora {

    public static PolizaIMPL recuperaPoliza(AseguradoraIMPL aseguradora, String numeroPoliza) {
        List<PolizaIMPL> listaPolizas = aseguradora.getListPolizas();
        if (listaPolizas != null) {
            for (PolizaIMPL poliza : listaPolizas) {
                if (poliza.getNumero().equals(numeroPoliza)) {
                    return poliza;
                }
            }
        }
        return null;
    }

    public static List<PolizaIMPL> recuperaPolizasActivas(AseguradoraIMPL aseguradora) {
        List<PolizaIMPL> listaPolizasActivas = new ArrayList<>();
        List<PolizaIMPL> listaPolizas = aseguradora.getListPolizas();
        if (listaPolizas != null) {
            for (PolizaIMPL poliza : listaPolizas) {
                if (poliza.getEstadoPoliza() == PolizaIMPL.EstadoPoliza.VIGENTE) {
                    listaPolizasActivas.add(poliza);
                }
            }
        }
        return listaPolizasActivas;
    }

    public static List<PolizaIMPL> recuperaPolizasPorTomador(AseguradoraIMPL aseguradora, String nif) {
        List<PolizaIMPL> listaPolizasPorTomador = new ArrayList<>();
        List<PolizaIMPL> listaPolizas = aseguradora.getListPolizas();
        if (listaPolizas != null) {
            for (PolizaIMPL poliza : listaPolizas) {
                PersonaIMPL tomador = poliza.getTomador();
                if (tomador != null && tomador.getNif().equals(nif)) {
                    listaPolizasPorTomador.add(poliza);
                }
            }
        }
        return listaPolizasPorTomador;
    }

    public static List<PolizaIMPL> recuperaPolizasPorConductor(AseguradoraIMPL aseguradora, String nif) {
        List<PolizaIMPL> listaPolizasPorConductor = new ArrayList<>();
        List<PolizaIMPL> listaPolizas = aseguradora.getListPolizas();
        if (listaPolizas != null) {
            for (PolizaIMPL poliza : listaPolizas) {
                ConductorIMPL conductorPrincipal = poliza.getConductorPrincipal();
                if (conductorPrincipal != null && conductorPrincipal.getNif().equals(nif)) {
                    listaPolizasPorConductor.add(poliza);
                }
            }
        }
        return listaPolizasPorConductor;
    }
}