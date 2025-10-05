import java.util.ArrayList;
import java.util.Random;

public class Controlador {
    
    public Controlador(){
    }

    private ArrayList<Heroe> heroes = new ArrayList<>();
    private ArrayList<Monstruos> enemigos = new ArrayList<>();
    private ArrayList<Monstruos> mostruosDisponibles = new ArrayList<>();

    private Revivir revivir = new Revivir();
    private Regeneracion regenerar = new Regeneracion();
    private Acido acido = new Acido();
    private Sangrado sangrado = new Sangrado();
    Zombie zombie = new Zombie(revivir);
    Slime slime = new Slime(acido);
    Vampiro vampiro = new Vampiro(sangrado, regenerar);
    ReySlime reySlime = new ReySlime(regenerar, acido);


    public String crearPersonaje (int opcion, String nombre) {
        switch (opcion) {
            case 1:
                Guerrero guerrero = new Guerrero(nombre);
                heroes.add(guerrero);
                break;
        
            case 2:
                Explorador explorador = new Explorador(nombre);
                heroes.add(explorador);
                break;
        }
        return "Personaje creado con éxito";
    }

    public void crearOleada () {
        mostruosDisponibles.add(zombie);
        mostruosDisponibles.add(vampiro);
        mostruosDisponibles.add(slime);
        mostruosDisponibles.add(reySlime);
        Random numero = new Random();
        int x = numero.nextInt(3)+1;
        for (int i = 0; i < x; i ++) {
            int enemigoElegido = numero.nextInt(mostruosDisponibles.size());
            enemigos.add(mostruosDisponibles.get(enemigoElegido));
        }
        mostruosDisponibles.remove(zombie);
        mostruosDisponibles.remove(vampiro);
        mostruosDisponibles.remove(slime);
        mostruosDisponibles.remove(reySlime);
    }

    public Heroe AsignarHeoreActivo () {
        Heroe heroeActivo = new Heroe(0, 0, null, 0, 0);
        for (Heroe heoresAevaluar : heroes) {
            if (heroeActivo.getVelocidad() < heoresAevaluar.getVelocidad() && heoresAevaluar.getAgotado() == false) {
                heroeActivo = heoresAevaluar;
            }
        }
        return heroeActivo;
    }

    public void heroesDescanzaron () {
        for (Heroe heroe : heroes) {
            if (heroe.getAgotado() == true && heroes.get(heroes.size()-1).getAgotado() == true) {
                heroe.setAgotado(false);
            }
        }
    }

    public void batalla (int accion) {
        int turnos = 0;
        do {
            turnos += 1;
            for (Monstruos monstruo : enemigos) {
                System.out.println(monstruo.getNombre() + "\n");
            }
            System.out.println("Turno: " + turnos);
            System.out.println("Es el turno de: " + this.AsignarHeoreActivo().getNombre());
            System.out.println("¿Qué quiere hacer?");
            System.out.println("1. Atacar ");
            System.out.println("2. Pasar turno: ");
            System.out.println("3. Usar item: ");
            switch (accion) {
                case 1:
                int danoNeto = heroes.get(0).getAtaque()-enemigos.get(0).getDefensa();
                    enemigos.get(0).setVida(enemigos.get(0).getVida() - danoNeto);
                    System.out.println(enemigos.get(0).getVida());
                    if (enemigos.get(0).getVida() <= 0) {
                        enemigos.get(0).setVivoOMuerto(false);
                        enemigos.remove(0);
                        System.out.println("Enemigo eliminado");
                    }
                    this.AsignarHeoreActivo().setAgotado(true);
                    for (Heroe heroe : heroes) {
                        if (heroe.getAgotado() == true && heroes.get(heroes.size()-1).getAgotado() == true) {
                        heroe.setAgotado(false);
                        }
                    }
                    break;

                case 2:
                    
                    break;

                case 3:
    
                    break;
            }
            

            } while (heroes.size() != 0 && enemigos.size() != 0);  
    }
// Métodos para acceder a los personajes
    public ArrayList<Heroe> party () {
            return heroes;
        }

        public ArrayList<Monstruos> wave () {
            return enemigos;
        }
}
