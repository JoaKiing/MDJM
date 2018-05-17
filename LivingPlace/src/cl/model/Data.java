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

     public void registrarVendedor(Persona nuevo) throws SQLException {
        query = "INSERT INTO persona VALUES(NULL, '" + nuevo.getNombre() + "', '" + nuevo.getRut()+ "');";
        con.ejecutar(query);
    }

}
