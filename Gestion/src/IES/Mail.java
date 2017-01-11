package IES;

/**
 *
 * @author Pixel_Zer0
 */
public class Mail {
    
    // Variables
    private int id;
    private String correo;
    
    // Métodos constructores
    
    public Mail() {
    }
    
    /**
     * 
     * @param i referencia al id de Mail
     * @param c referencia al correo de Mail
     */
    public Mail(int i, String c) {
        this.id = i;
        this.correo = c;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    @Override
    public String toString() {
        return "Correo: " + correo;
    }
}