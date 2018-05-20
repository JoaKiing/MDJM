
package cl.model;

public class BuscarVivienda {
    private String rol;
    private String direccion;
    private int pieza;
    private int baño;
    private String tipoVivienda;
    private int precio;
    private String nuevoUsado;

    public BuscarVivienda(String rol, String direccion, int pieza, int baño, String tipoVivienda, int precio, String nuevoUsado) {
        this.rol = rol;
        this.direccion = direccion;
        this.pieza = pieza;
        this.baño = baño;
        this.tipoVivienda = tipoVivienda;
        this.precio = precio;
        this.nuevoUsado = nuevoUsado;
    }

    BuscarVivienda() {
        
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

    public int getPieza() {
        return pieza;
    }

    public void setPieza(int pieza) {
        this.pieza = pieza;
    }

    public int getBaño() {
        return baño;
    }

    public void setBaño(int baño) {
        this.baño = baño;
    }

    public String getTipoVivienda() {
        return tipoVivienda;
    }

    public void setTipoVivienda(String tipoVivienda) {
        this.tipoVivienda = tipoVivienda;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNuevoUsado() {
        return nuevoUsado;
    }

    public void setNuevoUsado(String nuevoUsado) {
        this.nuevoUsado = nuevoUsado;
    }
    
    
}
