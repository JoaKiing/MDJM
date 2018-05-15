package cl.model;

/**
 *
 * @author JOAQUIN CABELLO
 */
public class TipoPersona {
    private int id;
    private String nombre;

    public TipoPersona(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public TipoPersona() {
    }

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
    
    
}
