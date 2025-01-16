package Vuelo;
public class Main {
    public static void main(String[] args) {
        // nombreInterface nombre=new nombreClase();
        Fecha f = new FechaImpl(6,5,2005);
        Persona p = new PersonaImpl("Ángel", "Roldán Rabanal", "29497781M", 19);
        Vuelo v = new VueloImpl("AR45", "Madrid",30.1,5,8,30.2,p,f);
        System.out.println(v);
    }
}
