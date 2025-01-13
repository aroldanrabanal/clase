public class Main {
    public static void main(String[] args) {
        // constructor
        // nombreInterface nombre=new nombreClase();
        Punto p = new PuntoImpl(1,2);
        p.setX(5);
        System.out.println(p);
    }
}

