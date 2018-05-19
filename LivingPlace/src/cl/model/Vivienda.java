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
    private int estado;

    public Vivienda(String rol, String direccion, int cantPiezas, int cantBaños, int tipoVivienda, int precio, int estado) {

        this.rol = rol;
        this.direccion = direccion;
        this.cantPiezas = cantPiezas;
        this.cantBaños = cantBaños;
        this.tipoVivienda = tipoVivienda;
        this.precio = precio;
        this.estado = estado;
    }

    public Vivienda() {
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

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

}
