package cl.model;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author JOAQUIN CABELLO
 */
public class Data {

    private ResultSet rs;
    private String query;
    private final Conexion con;

    public Data() throws ClassNotFoundException, SQLException {
        con = new Conexion("localhost", "living_place", "root", "");
    }

    public boolean existeRut(String rut) throws SQLException {
        boolean existe = false;

        query = "SELECT COUNT(*) id FROM persona WHERE run = " + rut + " ";

        rs = con.ejecutarSelect(query);

        if (rs.next()) {
            if (rs.getInt(1) == 0) {
                existe = true;
            }
        }

        return existe;
    }

     public void registrarVendedor(Vendedorr nuevo) throws SQLException {
        query = "INSERT INTO vendedor VALUES(NULL, '" + nuevo.getNombre() + "', '" + nuevo.getRut()+ "');";
        con.ejecutar(query);
    }
     
     public void registrarCliente(Cliente nuevo) throws SQLException {
        query = "INSERT INTO cliente VALUES(NULL, '" + nuevo.getNombre() + "', '" +nuevo.getRun()+ "', '" +nuevo.getSueldo()+ "');";
        con.ejecutar(query);
    }
     public void orderByDesc(TipoVivienda tipo) throws SQLException {
        query = "SELECT * FROM vivienda ORDER BY precio  " + tipo.getNombre() + ";";
        con.ejecutarSelect(query);
           
    }

    public void orderByAsc(TipoVivienda tipo) throws SQLException {
        query = "SELECT * FROM vivienda ORDER BY precio  " + tipo.getNombre() + ";";
        con.ejecutarSelect(query);
           
    }

    public void buscarVivienda(TipoVivienda tipo) throws SQLException {
        query = "SELECT * FROM tipo_vivienda WHERE nombre = '" + tipo.getNombre() + "';";
        con.ejecutarSelect(query);
           
    }
    public void mostarNombre(Vendedorr rut) throws SQLException {
        query = "SELECT  nombre FROM vendedor WHERE run = '"+rut.getRut()+"';";
        con.ejecutarSelect(query);
        
    }
    public void registrarVivienda(Vivienda nueva) throws SQLException {
        query = "INSERT INTO vivienda VALUES(NULL, '" + nueva.getRol() + "', '" +nueva.getDireccion()+ "', '" +nueva.getCantPiezas()+ "','" +nueva.getCantBaños()+ "','" +nueva.getTipoVivienda()+ "','" +nueva.getPrecio()+ "','" +nueva.getUsado_nuevo()+ "');";
        con.ejecutar(query);
    
    }

}
