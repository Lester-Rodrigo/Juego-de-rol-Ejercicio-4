import java.util.Random;

public class Habilidades {
    protected String nombre;
    protected String tipo;

    public Habilidades(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre (){
        return nombre;
    }

    public String getTipo (){
        return tipo;
    }

    public boolean activarHabilidad () {
        boolean activacion;
        Random numero = new Random();
        int x = numero.nextInt(100)+1;
        if (0<= x && x<41){
            activacion = true;
            return activacion;
        }
        else{
            activacion = false;
            return activacion;
        }
    }
}
