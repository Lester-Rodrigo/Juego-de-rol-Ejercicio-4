import java.util.Random;

public class Acido extends Habilidades{

    public Acido() {
        super("Acido", "Quimico");
    }
    
    @Override
    public boolean activarHabilidad () {
            boolean activacion;
            Random numero = new Random();
            int x = numero.nextInt(100)+1;
            if (0<= x && x<100){
                activacion = true;
                return activacion;
            }
            else{
                activacion = false;
                return activacion;
            }
        }

    public void Derretir (Heroe heroe) {
        if (this.activarHabilidad() == true) {
            heroe.setDefensa(heroe.getDefensa()-5);
        }
    }
}
