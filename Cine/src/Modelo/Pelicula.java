package Modelo;
import java.util.ArrayList;

/**
 *
 * @author Pixel_Zer0
 */
public class Pelicula {
    
    // Variables
    
    private int id;
    private String titulo;
    private String director;
    private Actor actor;
    private ArrayList<Actor> actores = new ArrayList<Actor>();
    
    // Métodos constructores
    
    public Pelicula() {
    }
    
    /**
     * 
     * @param i - Indica el id de la película
     * @param t - Indica el título de la película
     * @param d - Indica el director de la película
     */
    
    public Pelicula(int i, String t, String d) {
        this.id = i;
        this.titulo = t;
        this.director = d;
    }
    
    // Métodos set y get
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    
    /**
     * Añade actores a la pelicula
     * @param actor 
     */
    public void anyadirActor(Actor actor) {
        this.actor = actor;
        actores.add(actor);
    }
    

    @Override
    public String toString() {
        return "Pelicula{" + "id=" + id + ", titulo=" + titulo + 
                ", director=" + director + ", actores=" + actores + '}';
    }

}