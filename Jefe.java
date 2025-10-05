public class Jefe extends Monstruos{
    protected Habilidades habilidadeJefe = new Habilidades(null, null);

    public Jefe(double vida, int ataque, String nombre, int velocidad, int defensa, Habilidades habilidad,  Habilidades habilidadeJefe) {
        super(vida, ataque, nombre, velocidad, defensa, habilidad);
        this.habilidadeJefe = habilidadeJefe;
    }

    public Habilidades getHabilidadJefe () {
        return this.habilidadeJefe;
    }

    public void setHabilidadJefe (Habilidades habilidadJefe) {
        this.habilidadeJefe = habilidadJefe;
    }
    
    
}
