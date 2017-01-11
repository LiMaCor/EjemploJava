package cine;
import java.util.Scanner;
import java.util.ArrayList;
import Modelo.*;

/**
 *
 * @author Pixel_Zer0
 */
public class Cine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Variables
        String name, apellido, confirm;
        int anyo;
        
        // Creamos un nuevo objeto "Scanner", "Pelicula" y "Actor"
        
        Scanner sc = new Scanner(System.in);
        Pelicula film01 = new Pelicula();
        Actor character01 = new Actor(1, "Robert", "Downey Jr.", 1986);
        Actor character02 = new Actor(2, "Mark", "Ruffalo", 1978);
        
        // Creamos un array de actores
        
        // ArrayList<Actor> actores = new ArrayList<Actor>();
        
        // Le pasamos parámetros al nuevo objeto "Pelicula"
        
        film01.setId(1);
        film01.setTitulo("Iron Man");
        film01.setDirector("Jon Favreau");
        film01.anyadirActor(character01);
        film01.anyadirActor(character02);
        
        /* Añadimos actores al array con un bucle
        
        for (int i = 0; i >= 0; i++) {
            
            System.out.print("Introduce el nombre de un actor: ");
            name = sc.nextLine();
            
            System.out.print("Introduce su apellido: ");
            apellido = sc.nextLine();

            System.out.print("Introduce su año de nacimiento: ");
            anyo = sc.nextInt();
            
            actores.add(new Actor(i, name, apellido, anyo));
            
            System.out.print("¿Quieres añadir más? s/n: ");
            confirm = sc.nextLine();
            
            if (confirm.matches("n")) {
                break;
            }
            
        }
        */
        
        // O los añadimos al array desde el programa
        
        /*
        actores.add(new Actor(1, "Robert", "Downey Jr."));
        actores.add(new Actor(2, "Chris", "Evans"));
        actores.add(new Actor(3, "Scarlett", "Johansson"));
        actores.add(new Actor(4, "Mark", "Ruffalo"));
        */
        
        // Mostramos la información del objeto "Pelicula" y del array "actores"
        
        System.out.println(film01.toString() + "\n");
        // System.out.println(actores.toString() + "\n");
        
    }
    
}