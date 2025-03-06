package practica4;

public class puntoIMPL implements punto{
    private double x;
    private double y;
    private double z;

    public puntoIMPL(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double distancia(punto otroPunto) {
        double dx = x - otroPunto.getX();
        double dy = y - otroPunto.getY();
        double dz = z - otroPunto.getZ();

        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + getZ() + ")";
    }
}
