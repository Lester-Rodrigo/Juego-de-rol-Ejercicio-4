public class Monstruos extends Entidades{
    protected Habilidades habilidad = new Habilidades(null, null);

    public Monstruos(double vida, int ataque, String nombre, int velocidad, int defensa, Habilidades habilidad) {
        super(vida, ataque, nombre, velocidad, defensa, true);
        this.habilidad = habilidad;
    }
    
    public Habilidades getHabilidades () {
        return habilidad;
    }

    public void setHabilidades (Habilidades habilidad) {
        this.habilidad = habilidad;
    }

}
