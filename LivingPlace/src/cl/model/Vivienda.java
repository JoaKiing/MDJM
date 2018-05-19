package cl.model;

/**
 *
 * @author JOAQUIN CABELLO
 */
public class Vivienda {
    private int id;
    private String rol;
    private String direccion;
    private int cantPiezas;
    private int cantBaños;
    private int tipoVivienda;
    private int precio;
    private boolean usado_nuevo;

    
    public Vivienda() {
    }

    public Vivienda(String rol, String direccion, int cantPiezas, int cantBaños, int tipoVivienda, int precio, boolean usado_nuevo) {
        this.rol = rol;
        this.direccion = direccion;
        this.cantPiezas = cantPiezas;
        this.cantBaños = cantBaños;
        this.tipoVivienda = tipoVivienda;
        this.precio = precio;
        this.usado_nuevo = usado_nuevo;
    }
    

    public Vivienda(int id,String rol, String direccion, int cantPiezas, int cantBaños, int tipoVivienda, int precio, boolean usado_nuevo) {
        this.id = id;
        this.rol = rol;
        this.direccion = direccion;
        this.cantPiezas = cantPiezas;
        this.cantBaños = cantBaños;
        this.tipoVivienda = tipoVivienda;
        this.precio = precio;
        this.usado_nuevo = usado_nuevo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCantPiezas() {
        return cantPiezas;
    }

    public void setCantPiezas(int cantPiezas) {
        this.cantPiezas = cantPiezas;
    }

    public int getCantBaños() {
        return cantBaños;
    }

    public void setCantBaños(int cantBaños) {
        this.cantBaños = cantBaños;
    }

    public int getTipoVivienda() {
        return tipoVivienda;
    }

    public void setTipoVivienda(int tipoVivienda) {
        this.tipoVivienda = tipoVivienda;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean getUsado_nuevo() {
        return usado_nuevo;
    }

    public void setUsado_nuevo(boolean usado_nuevo) {
        this.usado_nuevo = usado_nuevo;
    }
    
    
}
