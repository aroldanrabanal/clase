package practica4;
import practica4.punto;
public class segmentoIMPL implements segmento{
    private punto punto1;
    private punto punto2;

    public segmentoIMPL(punto punto1, punto punto2) {
        this.punto1 = punto1;
        this.punto2 = punto2;
    }


    public punto getPunto1() {
        return punto1;
    }

    public void setPunto1(punto punto1) {
        this.punto1 = punto1;
    }

    public punto getPunto2() {
        return punto2;
    }

    public void setPunto2(punto punto2) {
        this.punto2 = punto2;
    }
    public double getLongitud() {
        return punto1.distancia(punto2);
    }

    public String toString() {
        return "["+punto1+", "+punto2+"]";
    }
}
