package cl.model;

/**
 *
 * @author JOAQUIN CABELLO
 */
public class Estadisticas extends Vivienda{
    private String nombreVendedor;
    private String runVendedor;
    private String nombreCliente;
    private String runCliente;

    public Estadisticas() {
    }

    public Estadisticas(String nombreVendedor, String runVendedor, String nombreCliente, String runCliente, String rol, String direccion, int cantPiezas, int cantBaños, int tipoVivienda, int precio, boolean estado) {
        super(rol, direccion, cantPiezas, cantBaños, tipoVivienda, precio, estado);
        this.nombreVendedor = nombreVendedor;
        this.runVendedor = runVendedor;
        this.nombreCliente = nombreCliente;
        this.runCliente = runCliente;
    }

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

    public String getRunVendedor() {
        return runVendedor;
    }

    public void setRunVendedor(String runVendedor) {
        this.runVendedor = runVendedor;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getRunCliente() {
        return runCliente;
    }

    public void setRunCliente(String runCliente) {
        this.runCliente = runCliente;
    }
    
    
}
