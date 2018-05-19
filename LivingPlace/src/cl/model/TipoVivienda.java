package cl.model;

/**
 *
 * @author JOAQUIN CABELLO
 */
public class TipoVivienda {
    private int id;
    private String nombre;

    public TipoVivienda(String nombre) {
        this.nombre = nombre;
    }
    

    public TipoVivienda() {
    }

    public TipoVivienda(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
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

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
    
}
