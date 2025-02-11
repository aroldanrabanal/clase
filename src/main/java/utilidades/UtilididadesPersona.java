package utilidades;

import modelos.PersonaIMPL;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class UtilididadesPersona {

    static List<String> letras = Arrays.asList("T", "R", "W", "A", "G","M", "Y","F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E");
    static HashMap<String, Integer> letrasNie = new HashMap<String, Integer>();

    public static boolean esNIFValido(String nif){

        if (nif.matches("^[0-9]{8}[A-Za-z]$")){
            int numeros = Integer.parseInt(nif.substring(0, 8));
            String letra = nif.substring(8);

            int resto = 0;
            resto = numeros % 23;

            String letraResto = letras.get(resto);
            return letra.equals(letraResto);
        } else if (nif.matches("^[XYZ][0-9]{7}[A-Za-z]$")) {
            letrasNie.put("X", 0);
            letrasNie.put("Y", 1);
            letrasNie.put("Z", 2);

            char letraClave = nif.charAt(0);
            int letraValor = letrasNie.get(String.valueOf(letraClave));
            String numerosStr = nif.substring(1, 8);
            char letra = nif.charAt(8);

            String resultado = String.format("%d%s", letraValor, numerosStr);
            int numeros = Integer.parseInt(resultado);
            int resto = numeros % 23;
            String letraResto = letras.get(resto);

            return letra == letraResto.charAt(0);
        }
        return false;
    }

    public static boolean esNIFValido(PersonaIMPL p){
        String nif = p.getNif();
        return esNIFValido(nif);
    }

    public static int getEdad(PersonaIMPL p){
        LocalDate fechaNacimiento = p.getFechaNacimiento();
        int anyoActual = LocalDate.now().getYear();
        int anyoNacimiento = fechaNacimiento.getYear();
        return anyoActual-anyoNacimiento;
    }

    public static boolean esMayorEdad(PersonaIMPL p){
        int edad = getEdad(p);
        return edad > 18;
    }

    public static boolean esMenor25(PersonaIMPL p){
        int edad = getEdad(p);
        if (esMayorEdad(p)){
            return edad < 25;
        }
        return false;
    }


}
