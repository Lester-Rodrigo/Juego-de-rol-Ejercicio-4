
public class Entidades {
    protected double vida;
    protected int ataque;
    protected String nombre;
    protected int velocidad;
    protected int defensa;
    protected boolean vivoOmuerto;
    protected boolean agotado; 

    public Entidades (double vida, int ataque, String nombre, int velocidad, int defensa, boolean vivoOmuerto, boolean agotado) {
        this.vida = vida;
        this.ataque = ataque;
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.defensa = defensa;
        this.vivoOmuerto = vivoOmuerto;
        this.agotado = agotado;
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

    public boolean getVivoOMuerto () {
        return vivoOmuerto;
    }

    public boolean getAgotado() {
        return agotado;
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

    public void setVivoOMuerto (boolean vivoOmuerto)  {
        this.vivoOmuerto = vivoOmuerto;
    }

    public void setAgotado (boolean agotado)  {
        this.agotado = agotado;
    }

    public boolean personajeMurio () {

        if (vida > 0) {
            this.vivoOmuerto = true;
            return this.vivoOmuerto;
        }
        else {
            this.vivoOmuerto = false;
            return this.vivoOmuerto;
        }
    }
}
