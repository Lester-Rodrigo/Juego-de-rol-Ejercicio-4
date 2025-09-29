public class Explorador extends Heroe{

    public Explorador(String nombre) {
        super(15, 15, nombre, 25, 10);
    }
    
    @Override
    public Boolean TamanoInventario () {
        Boolean espacioDisponible;

        if (this.Items.size() < 8){
            espacioDisponible = true;
        }
        else {
            espacioDisponible = false;
        }
        return espacioDisponible;
    }
}
