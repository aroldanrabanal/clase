package Vuelo;
public class Main {
    public static void main(String[] args) {
        // nombreInterface nombre=new nombreClase();
        Vuelo v = new VueloImpl("AR45", "Madrid",30.1,5,8,30.2);
        System.out.println(v);
    }
}
