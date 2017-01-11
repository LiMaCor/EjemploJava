/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IES;

/**
 *
 * @author Julián_Martinez
 * @version 02/11/2016
 */
public class Profesor {
    
    // Variables de la clase
    private int id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String direccion;
    private IES insti;
    private IES dirigir;
    private Mail correo;
    
    /**
     * Método constructor por defecto
     */
    public Profesor() {
    };
    
    /**
     * 
     * Constructor
     * @param i referencia al id del profesor
     * @param n referencia al nombre del profesor
     * @param d referencia a la direccion del profesor
     * @param c referencia al correo del profesor
     */
    public Profesor(int i, String n, String d, Mail c) {
        this.id = i;
        this.nombre = n;
        this.direccion = d;
        this.correo = c;
    }
    
    // Métodos de la clase
    
    /**
     * Establece el IES
     * @param centro 
     */
    public void setIES(IES centro) {
        this.insti = centro;
    }

    /**
     * Obtiene el IES
     * @return IES
     */
    public IES getIES() {
        return insti;
    }

    /**
     * Obtiene el correo
     * @return String
     */
    public Mail getCorreo() {
        return correo;
    }

    /**
     * Establece el correo
     * @param correo 
     */
    public void setCorreo(Mail correo) {
        this.correo = correo;
    }

    /**
     * Obtiene el id
     * @return int
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el id
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre
     * @return String
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la direccion
     * @return String
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Establece la direccion
     * @param direccion 
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    /**
     * Establece quien dirige un IES
     * @param insti 
     */
    public void miIes(IES insti) {
        this.dirigir = insti;
    }

    /**
     * Muestra información sobre un profesor
     * @return 
     */
    @Override
    public String toString() {
        return "Profesor{" + "id=" + id + ", nombre=" + nombre + ", direccion=" 
                + direccion +", IES: " + dirigir + ", correo=" + correo + '}';
    }
}
