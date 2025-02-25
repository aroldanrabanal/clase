package utilidades;

import modelos.PersonaIMPL;
import modelos.VehiculoIMPL;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class UtilidadesVehiculo {
    public static boolean esMatriculaValida(String mat){
        if (mat.matches("^[0-9]{4}[B-DF-HJ-NP-TV-Z]{3}$")) {
            return true;
        } else if (mat.matches("^(CGPC|CME)\\d{4}$") ||
                mat.matches("^CNP\\d{4}[A-Z]{2}$") ||
                mat.matches("^E\\d{4}$") ||
                mat.matches("^(EA|ET)\\d{6}$") ||
                mat.matches("^FN\\d{5}$") ||
                mat.matches("^PGC\\d{4}[A-Z]$")) {
           return true;
        }

        return false;
    }

    public static boolean esMatriculaValida(VehiculoIMPL veh){
        String mat = veh.getMatricula();
        return esMatriculaValida(mat);
    }

    public static int calculaEdad(VehiculoIMPL vehiculo){
        LocalDate fechamatriculacion = vehiculo.getFechaMatriculacion();
        int anoactual = LocalDate.now().getYear();
        return anoactual - fechamatriculacion.getYear();
    }
    public static List<VehiculoIMPL> getVehiculos(List<VehiculoIMPL> listaV, PersonaIMPL p){
        List<VehiculoIMPL> nuevaV = new ArrayList<VehiculoIMPL>();
        if (p == null){
            return nuevaV;
        }
        for (VehiculoIMPL vehiculo : listaV) {
            if (p.equals(vehiculo.getPersona())) {
                nuevaV.add(vehiculo);
            }
        }
        return nuevaV;
    }

    public static boolean validaFechaMatriculacion(LocalDate fecha) {
        LocalDate fechaHoy = LocalDate.now();
        return !fecha.isAfter(fechaHoy);
    }

}
