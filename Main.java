import java.util.Scanner;

public class Main {
  
    public static void main(String[] args) {

        Controlador control = new Controlador();

        Scanner input = new Scanner(System.in);
        int accion;
        String nombrePersonaje;

        do {
               do {
                    System.out.println("1. Crear Personaje: ");
                    System.out.println("2. Iniciar Aventura: ");
                    System.out.println("3. Salir: ");
                    System.out.println("Ingrese alguna opción (Del 1 al 3): ");
                    accion = input.nextInt();
                    System.out.println("-------------------------------------------------------------"); 
                    } while (accion < 1 || accion > 3);
                    switch (accion) {
                        case 1:
                        Scanner nombrar = new Scanner(System.in);
                        System.out.println("¿Cuál es el nombre de su personaje?");
                            nombrePersonaje = nombrar.nextLine();
                            System.out.println("¿Qué quiere ser?");
                            System.out.println("1. Guerrero: ");
                            System.out.println("2. Explorador: ");
                            System.out.println("Ingrese alguna opción (Del 1 al 2): ");
                            accion = input.nextInt();
                            control.crearPersonaje(accion, nombrePersonaje);
                            System.out.println(control.party().get(0).getNombre());
                            System.out.println(control.party().get(0).getClass());
                            break;
                    
                        case 2:
                            if (control.party().size() != 0) {
                                control.crearOleada();
                                int turnos = 0;
                                do {
                                    turnos += 1;
                                    for (Monstruos monstruo : control.wave()) {
                                        System.out.println(monstruo.getNombre() + "\n");
                                    }
                                    System.out.println("Turno: " + turnos);
                                    System.out.println("Es el turno de: " + control.AsignarHeoreActivo().getNombre());
                                    System.out.println("¿Qué quiere hacer?");
                                    System.out.println("1. Atacar ");
                                    System.out.println("2. Pasar turno: ");
                                    System.out.println("3. Usar item: ");
                                    accion = input.nextInt();
                                    switch (accion) {
                                        case 1:
                                        int danoNeto = control.party().get(0).getAtaque()-control.wave().get(0).getDefensa();
                                            control.wave().get(0).setVida(control.wave().get(0).getVida() - danoNeto);
                                            System.out.println(control.wave().get(0).getVida());
                                            if (control.wave().get(0).getVida() <= 0) {
                                                control.wave().get(0).setVivoOMuerto(false);
                                                control.wave().remove(0);
                                                System.out.println("Enemigo eliminado");
                                            }
                                            control.AsignarHeoreActivo().setAgotado(true);
                                            for (Heroe heroe : control.party()) {
                                                if (heroe.getAgotado() == true && heroe.getNombre() == control.AsignarHeoreActivo().getNombre()) {
                                                heroe.setAgotado(false);
                                                }
                                            }
                                            break;

                                        case 2:
                                            
                                            break;

                                        case 3:
                            
                                            break;
                                    }
                                    

                                    } while (control.party().size() != 0 && control.wave().size() != 0); 
                                
                            }
                            break;

                        case 3:
                            System.exit(0);
                            break;
                    }

            } while (accion != 3);
    }
}