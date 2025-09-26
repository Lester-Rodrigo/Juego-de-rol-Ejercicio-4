
public class Entidades {
    protected double vida;
    protected int ataque;
    protected String nombre;
    protected int velocidad;
    protected int defensa;

    public Entidades (double vida, int ataque, String nombre, int velocidad, int defensa) {
        this.vida = vida;
        this.ataque = ataque;
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.defensa = defensa;
    }

    public double getVida () {
        return vida;
    }

    public int getAtaque () {
        return ataque;
    }

    public String getNombre (){
        return nombre;
    }

    public int getVelocidad () {
        return velocidad;
    }

    public int getDefensa () {
        return defensa;
    }

     public void setVida (double vida) {
        this.vida = vida;
    }

    public void setAtaque (int ataque) {
        this.ataque = ataque;
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public void setVelocidad (int velocidad) {
        this.velocidad = velocidad;
    }

    public void setDefensa (int defensa) {
        this.defensa = defensa;
    }
}
