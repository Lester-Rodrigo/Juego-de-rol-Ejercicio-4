import java.util.Scanner;

public class Main {
  
    public static void main(String[] args) {

        Controlador control = new Controlador();

        Scanner input = new Scanner(System.in);
        int accion;
        String nombrePersonaje;

        do {
               do {
                System.out.println("1. Iniciar juego: ");
                System.out.println("2. Salir: ");
                System.out.println("Ingrese alguna opción (Del 1 al 2): ");
                accion = input.nextInt();
                System.out.println("-------------------------------------------------------------"); 

            } while (accion < 1 || accion > 2);
            switch (accion) {
                case 1:
                    do {
                    System.out.println("1. Crear Personaje: ");
                    System.out.println("2. Iniciar Aventura: ");
                    System.out.println("3. Salir: ");
                    System.out.println("Ingrese alguna opción (Del 1 al 3): ");
                    accion = input.nextInt();
                    System.out.println("-------------------------------------------------------------"); 
                    } while (accion < 1 || accion > 2);
                    switch (accion) {
                        case 1:
                        System.out.println("¿Cuál es el nombre de su personaje?");
                            nombrePersonaje = input.nextLine();
                            System.out.println("¿Qué quiere ser?");
                            System.out.println("1. Guerrero: ");
                            System.out.println("2. Explorador: ");
                            System.out.println("Ingrese alguna opción (Del 1 al 2): ");
                            accion = input.nextInt();
                            control.crearPersonaje(accion, nombrePersonaje);
                            System.out.println(control.batalla());
                            break;
                    
                        case 2:
                            
                            break;

                        case 3:
                            System.exit(0);
                            break;
                    }
                    break;
            
                case 2:
                System.exit(0);
                    break;
            }

            } while (accion != 2);
    }
}