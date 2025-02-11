package utilidades;

import modelos.ProvinciaIMPL;

import java.util.HashMap;
import java.util.Map;

public class UtilidadesDireccion {
    public static boolean esCPValido(String cp){
        if (cp == null || !cp.matches("\\d{5}")) {
            return false;
        }
        int primerosDosDigitos = Integer.parseInt(cp.substring(0, 2));
        return primerosDosDigitos >= 1 && primerosDosDigitos <= 52;
    }
    public static final Map<String, ProvinciaIMPL> direcciones = new HashMap<String,ProvinciaIMPL>();
    static {
        direcciones.put("Álava", new ProvinciaIMPL("Álava", "01"));
        direcciones.put("Albacete", new ProvinciaIMPL("Albacete", "02"));
        direcciones.put("Alicante", new ProvinciaIMPL("Alicante", "03"));
        direcciones.put("Almería", new ProvinciaIMPL("Almería", "04"));
        direcciones.put("Ávila", new ProvinciaIMPL("Ávila", "05"));
        direcciones.put("Badajoz", new ProvinciaIMPL("Badajoz", "06"));
        direcciones.put("Islas Baleares", new ProvinciaIMPL("Islas Baleares", "07"));
        direcciones.put("Barcelona", new ProvinciaIMPL("Barcelona", "08"));
        direcciones.put("Burgos", new ProvinciaIMPL("Burgos", "09"));
        direcciones.put("Cáceres", new ProvinciaIMPL("Cáceres", "10"));
        direcciones.put("Cádiz", new ProvinciaIMPL("Cádiz", "11"));
        direcciones.put("Castellón", new ProvinciaIMPL("Castellón", "12"));
        direcciones.put("Ciudad Real", new ProvinciaIMPL("Ciudad Real", "13"));
        direcciones.put("Córdoba", new ProvinciaIMPL("Córdoba", "14"));
        direcciones.put("A Coruña", new ProvinciaIMPL("A Coruña", "15"));
        direcciones.put("Cuenca", new ProvinciaIMPL("Cuenca", "16"));
        direcciones.put("Girona", new ProvinciaIMPL("Girona", "17"));
        direcciones.put("Granada", new ProvinciaIMPL("Granada", "18"));
        direcciones.put("Guadalajara", new ProvinciaIMPL("Guadalajara", "19"));
        direcciones.put("Guipúzcoa", new ProvinciaIMPL("Guipúzcoa", "20"));
        direcciones.put("Huelva", new ProvinciaIMPL("Huelva", "21"));
        direcciones.put("Huesca", new ProvinciaIMPL("Huesca", "22"));
        direcciones.put("Jaén", new ProvinciaIMPL("Jaén", "23"));
        direcciones.put("León", new ProvinciaIMPL("León", "24"));
        direcciones.put("Lleida", new ProvinciaIMPL("Lleida", "25"));
        direcciones.put("La Rioja", new ProvinciaIMPL("La Rioja", "26"));
        direcciones.put("Lugo", new ProvinciaIMPL("Lugo", "27"));
        direcciones.put("Madrid", new ProvinciaIMPL("Madrid", "28"));
        direcciones.put("Málaga", new ProvinciaIMPL("Málaga", "29"));
        direcciones.put("Murcia", new ProvinciaIMPL("Murcia", "30"));
        direcciones.put("Navarra", new ProvinciaIMPL("Navarra", "31"));
        direcciones.put("Ourense", new ProvinciaIMPL("Ourense", "32"));
        direcciones.put("Asturias", new ProvinciaIMPL("Asturias", "33"));
        direcciones.put("Palencia", new ProvinciaIMPL("Palencia", "34"));
        direcciones.put("Las Palmas", new ProvinciaIMPL("Las Palmas", "35"));
        direcciones.put("Pontevedra", new ProvinciaIMPL("Pontevedra", "36"));
        direcciones.put("Salamanca", new ProvinciaIMPL("Salamanca", "37"));
        direcciones.put("Santa Cruz de Tenerife", new ProvinciaIMPL("Santa Cruz de Tenerife", "38"));
        direcciones.put("Cantabria", new ProvinciaIMPL("Cantabria", "39"));
        direcciones.put("Segovia", new ProvinciaIMPL("Segovia", "40"));
        direcciones.put("Sevilla", new ProvinciaIMPL("Sevilla", "41"));
        direcciones.put("Soria", new ProvinciaIMPL("Soria", "42"));
        direcciones.put("Tarragona", new ProvinciaIMPL("Tarragona", "43"));
        direcciones.put("Teruel", new ProvinciaIMPL("Teruel", "44"));
        direcciones.put("Toledo", new ProvinciaIMPL("Toledo", "45"));
        direcciones.put("Valencia", new ProvinciaIMPL("Valencia", "46"));
        direcciones.put("Valladolid", new ProvinciaIMPL("Valladolid", "47"));
        direcciones.put("Vizcaya", new ProvinciaIMPL("Vizcaya", "48"));
        direcciones.put("Zamora", new ProvinciaIMPL("Zamora", "49"));
        direcciones.put("Zaragoza", new ProvinciaIMPL("Zaragoza", "50"));
        direcciones.put("Ceuta", new ProvinciaIMPL("Ceuta", "51"));
        direcciones.put("Melilla", new ProvinciaIMPL("Melilla", "52"));
    }
}
