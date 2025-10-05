import java.util.Random;

public class Revivir extends Habilidades{

    public Revivir() {
        super("Revivir", "No muerto");
        
    }

    @Override
    public boolean activarHabilidad () {
        boolean activacion;
        Random numero = new Random();
        int x = numero.nextInt(100)+1;
        if (0<= x && x<21){
            activacion = true;
            return activacion;
        }
        else{
            activacion = false;
            return activacion;
        }
    }
    
    public void Resureccion (Monstruos monstruo) {
        if (monstruo.getHabilidad().activarHabilidad() == true && monstruo.getVivoOMuerto() == false) {
            monstruo.setVivoOMuerto(true);
        }
        else {
            monstruo.setVivoOMuerto(false);
        }
    }
}
