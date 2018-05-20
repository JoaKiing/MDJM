package cl.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
        query = "INSERT INTO vendedor VALUES(NULL, '" + nuevo.getNombre() + "', '" + nuevo.getRut() + "');";
        con.ejecutar(query);
    }

    public void registrarCliente(Cliente nuevo) throws SQLException {
        query = "INSERT INTO cliente VALUES(NULL, '" + nuevo.getNombre() + "', '" + nuevo.getRun() + "', '" + nuevo.getSueldo() + "');";
        con.ejecutar(query);
    }

    public void orderByDesc(TipoVivienda tipo) throws SQLException {
        query = "SELECT * FROM vivienda ORDER BY precio  " + tipo.getNombre() + ";";
        rs = con.ejecutarSelect(query);

    }

    public void orderByAsc(TipoVivienda tipo) throws SQLException {
        query = "SELECT * FROM vivienda ORDER BY precio  " + tipo.getNombre() + ";";
        rs = con.ejecutarSelect(query);

    }

    public void buscarVivienda(TipoVivienda tipo) throws SQLException {
        query = "SELECT * FROM tipo_vivienda WHERE nombre = '" + tipo.getNombre() + "';";
        rs = con.ejecutarSelect(query);

    }

    public void mostarNombre(Vendedorr rut) throws SQLException {
        query = "SELECT  nombre FROM vendedor WHERE run = '" + rut.getRut() + "';";
        rs = con.ejecutarSelect(query);

    }

    public void registrarVivienda(Vivienda nueva) throws SQLException {
        query = "INSERT INTO vivienda VALUES(NULL, '" + nueva.getRol() + "', '" + nueva.getDireccion() + "', '" + nueva.getCantPiezas() + "','" + nueva.getCantBaños() + "','" + nueva.getTipoVivienda() + "','" + nueva.getPrecio() + "','" + nueva.getEstado() + "');";
        con.ejecutar(query);

    }
    public List<ClienteVendedor> datosVendedor() throws SQLException {
        query = "SELECT * FROM modulo_log;";
        
        List<ClienteVendedor> lista = new ArrayList<>();
        
        rs = con.ejecutarSelect(query);
        
        while (rs.next()) {            
            ClienteVendedor cv = new ClienteVendedor();
            
            cv.setVendedor(rs.getString(1));
            cv.setRutVendedor(rs.getString(2));
            cv.setCliente(rs.getString(3));
            cv.setFecha(rs.getString(4));
            cv.setHora(rs.getString(5));
            cv.setAccion(rs.getString(6));
            
            lista.add(cv);
            
            
        }
        return lista;
    }
    
    public List<BuscarVivienda> buscarVivienda() throws SQLException {
        query = "SELECT * FROM listado_vivienda;";
        
        List<BuscarVivienda> mostarViv = new ArrayList<>();
        
        rs = con.ejecutarSelect(query);
        
        while (rs.next()) {            
            BuscarVivienda bv = new BuscarVivienda();
            
            bv.setRol(rs.getString(1));
            bv.setDireccion(rs.getString(2));
            bv.setPieza(rs.getInt(3));
            bv.setBaño(rs.getInt(4));
            bv.setTipoVivienda(rs.getString(5));
            bv.setPrecio(rs.getInt(6));
            bv.setNuevoUsado(rs.getString(7));
            
            mostarViv.add(bv);
            
            
        }
        return mostarViv;
    }

    

}
