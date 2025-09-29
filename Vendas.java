public class Vendas extends Objetos{

    public Vendas(int cant) {
        super(cant, 30.00);
    }

    public void UsarVendas (Entidades entidad) {
        double curacionTotal = (this.porcentaje*entidad.getVida())/100;
        entidad.setVida(entidad.getVida()+ curacionTotal);
    }
    
}
