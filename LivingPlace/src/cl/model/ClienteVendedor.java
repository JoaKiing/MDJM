package cl.model;


public class ClienteVendedor extends Vendedorr{
    private String vendedor;
    private String RutVendedor;
    private String cliente;
    private String fecha;
    private String Hora;
    private String accion;

    public ClienteVendedor(String vendedor, String RutVendedor, String cliente, String fecha, String Hora, String accion) {
        this.vendedor = vendedor;
        this.RutVendedor = RutVendedor;
        this.cliente = cliente;
        this.fecha = fecha;
        this.Hora = Hora;
        this.accion = accion;
    }

    ClienteVendedor() {
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getRutVendedor() {
        return RutVendedor;
    }

    public void setRutVendedor(String RutVendedor) {
        this.RutVendedor = RutVendedor;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
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

    
}
