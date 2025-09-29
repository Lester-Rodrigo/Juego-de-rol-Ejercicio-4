import java.util.ArrayList;
import java.util.Random;

public class Controlador {
    
    public Controlador(){
    }

    private ArrayList<Heroe> heroes = new ArrayList<>();
    private ArrayList<Monstruos> enemigos = new ArrayList<>();

    private Revivir revivir = new Revivir();

    public String crearPersonaje (int opcion, String nombre) {
        switch (opcion) {
            case 1:
                Guerrero guerrero = new Guerrero(nombre);
                heroes.add(guerrero);
                break;
        
            case 2:
                Explorador explorador = new Explorador(nombre);
                heroes.add(explorador);
                break;
        }
        return "Personaje creado con éxito";
    }

    public ArrayList<Heroe> batalla () {
        Random numero = new Random();
        int x = numero.nextInt(3)+1;
        switch (x) {
            case 1:
                Zombie zombie = new Zombie(revivir);
                break;
        
            case 2:
                
                break;
            
            case 3:
                
                break;
        }
        return heroes;
    }
}
