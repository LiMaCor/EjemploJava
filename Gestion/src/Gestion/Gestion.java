package Gestion;
import IES.*;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Julián_Martinez
 * @see IES
 */
public class Gestion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        // Creamos dos objetos "profesores"
        Profesor teacher1 = new Profesor();
        // Profesor teacher2 = new Profesor(2, "Mila", "C/Puerto Rico");
        IES ausias = new IES(1, 43, "C/Ángel Villena", "Valencia");
        
        /*
        teacher1.setId(1);
        teacher1.setNombre("Valentin");
        teacher1.setDireccion("Av. del Cid");
        teacher2.miIes(ausias);
        
        // Comprobamos que hemos introducido bien los datos
        System.out.println(teacher1.toString() + "\n");
        System.out.println(teacher2.toString() + "\n");
        System.out.println(ausias.toString() + "\n");
        */
        
        // Creamos los arrays necesarios
        ArrayList<Profesor> teacher = new ArrayList<Profesor>();
        ArrayList<Mail> correoE = new ArrayList<Mail>();
        
        /*
        teacher.add(new Profesor(3, "Luis", "C/Ángel Villena"));
        teacher.add(new Profesor(4, "Sandra", "C/Ángel Villena"));
        */
        
        // Vamos a ponerlo en práctica, añadiendo profesores a un array.
        String name1, lastName1, correo, confirm;
        Scanner sc = new Scanner(System.in);
        int i = 0;
        
          /*
            do {

                System.out.print("Introduce un nombre: ");
                name1 = sc.nextLine();

                if (name1.matches("([0-9])")) {
                    return;
                }

                System.out.print("Introduce un apellido: ");
                lastName1 = sc.nextLine();

                if (lastName1.matches("([0-9])")) {
                    return;
                }

                teacher.add(new Profesor(i, name1, lastName1));
                System.out.println(teacher.toString() + "\n");

                i++;

                if (i == 2) {
                    System.out.println("Se ha alcanzado el máx. de profesores.\n");
                    break;
                }

                System.out.print("¿Quieres añadir más? s/n: ");
                confirm = sc.nextLine();

            } while (!confirm.matches("n") && i != 2);

            System.out.print("Establece el profesor que dirigirá el . \n");
            System.out.print("Introduce su ID: ");

            i = sc.nextInt();

            teacher.get(i).miIes(new IES(2, 54, "C/Baladre", "Valencia"));

            System.out.println(teacher.get(i).toString() + "\n");
          */
          
          System.out.print("Introduce un nombre: ");
          name1 = sc.nextLine();
          
          System.out.print("Introduce un apellido: ");
          lastName1 = sc.nextLine();
          
          System.out.print("Introduce un correo: ");
          correo = sc.nextLine();
          
          teacher.add(new Profesor(i, name1, lastName1,(new Mail(i, correo))));
          
          System.out.println(teacher.toString() + "\n");
          
        // Mostramos los datos almacenados en el array
        // System.out.println(teacher + "\n");
    }   
}