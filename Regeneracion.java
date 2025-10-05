import java.util.Random;

public class Regeneracion extends Habilidades{

    public Regeneracion() {
        super("Regeneración", "No muerto");
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

    public void Regenerar (Monstruos monstruo) {
        if (this.activarHabilidad() == true) {
            double saludAcurar = (monstruo.getVida()*30)/100; 
            monstruo.setVida(monstruo.getVida() + saludAcurar );
        }
    }
}
