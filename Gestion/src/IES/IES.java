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
public class IES {
    
    // Variables de la clase
    private int id;
    private int numero;
    private String calle;
    private String poblacion;
    private String provincia;
    
    /**
     * Método constructor por defecto
     */
    public IES() {
    };
    
    /**
     * 
     * @param i referencia al id del IES
     * @param n referencia al numero del IES
     * @param c referencia a la calle del IES
     * @param p referencia a la provincia del IES
     */
    public IES(int i, int n, String c, String p) {
        this.id = i;
        this.numero = n;
        this.calle = c;
        this.provincia = p;
    }
    // Metodos de la clase

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
     * Obtiene el numero
     * @return int
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Establece el numero
     * @param numero 
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Obtiene la calle
     * @return String
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Establece la calle
     * @param calle 
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * Obtiene la poblacion
     * @return String
     */
    public String getPoblacion() {
        return poblacion;
    }

    /**
     * Establece la poblacion
     * @param poblacion 
     */
    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    /**
     * Obtiene la provincia
     * @return String
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * Establece la provincia
     * @param provincia 
     */
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    /**
     * Muestra información sobre un IES
     */
    @Override
    public String toString() {
        return "IES{" + "id=" + id + ", numero=" + numero + ", calle=" + calle +
                ", provincia=" + provincia + '}';
    }
    
}
