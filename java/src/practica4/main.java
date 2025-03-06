package practica4;

public class main {
    public static void main(String[] args) {
        punto p1 = new puntoIMPL(2.674,4.25,8.65);
        punto p2 = new puntoIMPL(8,4.25,2.65);
        double distancia = p1.distancia(p2);

        System.out.println(p1);
        System.out.println(distancia);

        segmento s = new segmentoIMPL(p1, p2);
        System.out.println(s.getPunto1().distancia(p2));
    }
}
