import java.util.Random;

public class Sangrado extends Habilidades{

    public Sangrado() {
        super("Sangrado", "Herida");
    }
    
    @Override
    public boolean activarHabilidad () {
            boolean activacion;
            Random numero = new Random();
            int x = numero.nextInt(50)+1;
            if (0<= x && x<51){
                activacion = true;
                return activacion;
            }
            else{
                activacion = false;
                return activacion;
            }
        }

    public void Cortar (Heroe heroe, Monstruos monstruo) {
        if (this.activarHabilidad() == true) {
            if (monstruo.getAtaque() > heroe.getDefensa()) {
                double sangrePerdida = (monstruo.getAtaque()*30)/100; 
                heroe.setVida(heroe.getVida() - sangrePerdida );
                heroe.setAtaque(heroe.getAtaque()-5);
            }
        }
    }
}
