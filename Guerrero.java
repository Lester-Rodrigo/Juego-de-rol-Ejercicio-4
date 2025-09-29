public class Guerrero extends Heroe{

    public Guerrero(String nombre) {
        super(30, 25, nombre, 10, 20);
    }

    @Override
    public Boolean TamanoInventario () {
        Boolean espacioDisponible;

        if (this.Items.size() < 3){
            espacioDisponible = true;
        }
        else {
            espacioDisponible = false;
        }
        return espacioDisponible;
    }
    
}
