import java.util.ArrayList;

public class Heroe extends Entidades{

 protected ArrayList<Objetos> Items = new ArrayList<>();

    public Heroe (double vida, int ataque, String nombre, int velocidad, int defensa) {
        super(vida, ataque, nombre, velocidad, defensa, true, false);
        Items = new ArrayList<>();
    }

    public void setObjetos (Objetos item) {
        Items.add(item);
    }

    public Boolean TamanoInventario () {
        Boolean espacioDisponible;
        int espacios = 0; 
        if (this.Items.size() < espacios){
            espacioDisponible = true;
        }
        else {
            espacioDisponible = false;
        }
        return espacioDisponible;
    }
    
}
