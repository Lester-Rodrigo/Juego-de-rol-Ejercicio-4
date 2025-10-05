public class Monstruos extends Entidades{
    protected Habilidades habilidad = new Habilidades(null, null);

    public Monstruos(double vida, int ataque, String nombre, int velocidad, int defensa, Habilidades habilidad) {
        super(vida, ataque, nombre, velocidad, defensa, true, false);
        this.habilidad = habilidad;
    }
    
    public Habilidades getHabilidad () {
        return this.habilidad;
    }

    public void setHabilidad (Habilidades habilidad) {
        this.habilidad = habilidad;
    }

}
