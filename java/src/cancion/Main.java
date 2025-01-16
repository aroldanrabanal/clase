package cancion;

import Vuelo.Fecha;
import Vuelo.FechaImpl;

public class Main {
    public static void main(String[] args) {
        Fecha f = new FechaImpl(6,5,2005);
        Cancion c = new CancionImpl("Algo", "Alguien", 300, f, "rap", 562, 9.4, Boolean.TRUE);
        System.out.println(c);
    }
}
