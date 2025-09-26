public class Objetos {
    protected int cantidad;
    protected double porcentaje;

    public Objetos (int cantidad, double porcentaje) {
        this.cantidad = cantidad;
        this.porcentaje = porcentaje;
    }

    public int getCantidad () {
        return cantidad;
    }

    public double getPorcentaje () {
        return porcentaje;
    }

    public void setCantidad (int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPorcentaje (double porcentaje) {
        this.porcentaje = porcentaje;
    }
}
