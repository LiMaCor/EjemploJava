package Modelo;

/**
 *
 * @author Pixel_Zer0
 */
public class Actor {
    
    // Variables
    
    private int id, anyo;
    private String nombre, apellido;
    
    // Métodos constructores
    
    public Actor() {
    }
    
    /**
     * 
     * @param i - Indica el id del actor
     * @param n - Indica el nombre del actor
     * @param a - Indica el apellido del actor
     * @param an - Indica el año de nacimiento del actor
     */
    
    public Actor(int i, String n, String a, int an) {
        this.id = i;
        this.nombre = n;
        this.apellido = a;
        this.anyo = an;
    }

    // Métodos get y set
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public int getAnyo() {
        return anyo;
    }
    
    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

        @Override
    public String toString() {
        return "Actor{" + "id=" + id + ", nombre=" + nombre + 
                ", apellido=" + apellido + ", anyo=" + anyo + '}';
    }

}