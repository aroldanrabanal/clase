/**
 * Coordenadas de un punto x e y
 * x = int, consultable y modificable
 * y = int, consultable y modificable
 * Representación como cadena: (x,y)
 */

public class PuntoImpl implements Punto{
    //1* variables/atributos
    private Integer x;
    private Integer y;

    //2* constructor
    public PuntoImpl(Integer x, Integer y){
        this.x=x;
        this.y=y;
    }

    //3* getters y setters
    //3.1 x, consultable
    public Integer getX() {
        return x;
    }

    //3.2 x, modificable
    public void setX(Integer x1){
        x=x1;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y1){
        y=y1;
    }
    //4* otros metodos
    //5*toString
    public String toString(){
        return "("+getX()+","+getY()+")";
    }
}
