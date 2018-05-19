package cl.model;


public class ClienteVendedor extends Vendedorr{
    private int vendedor_fk;
    private int cliente_fk;
    private String fecha;
    private String Hora;
    private String accion;

    public ClienteVendedor(int vendedor_fk, int cliente_fk, String fecha, String Hora, String accion) {
        this.vendedor_fk = vendedor_fk;
        this.cliente_fk = cliente_fk;
        this.fecha = fecha;
        this.Hora = Hora;
        this.accion = accion;
    }
    
    public ClienteVendedor(String fecha, String Hora, String accion) {
        this.fecha = fecha;
        this.Hora = Hora;
        this.accion = accion;
    }

    public ClienteVendedor() {
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public int getVendedor_fk() {
        return vendedor_fk;
    }

    public void setVendedor_fk(int vendedor_fk) {
        this.vendedor_fk = vendedor_fk;
    }

    public int getCliente_fk() {
        return cliente_fk;
    }

    public void setCliente_fk(int cliente_fk) {
        this.cliente_fk = cliente_fk;
    }
    

    
    
}
