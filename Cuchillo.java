public class Cuchillo extends Objetos{

    public Cuchillo(int cantidad) {
        super(cantidad, 40.00);
    }

    public double usarCuchillo (Entidades entidad) {
        double dañoTotal = (this.porcentaje*entidad.getAtaque())/100;
        return dañoTotal;
    }
    
}
