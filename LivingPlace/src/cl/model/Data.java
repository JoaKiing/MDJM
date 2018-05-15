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
    private Conexion con;

    public Data() throws SQLException, ClassNotFoundException{
        con = new Conexion("localhost","sistema_matriculas","root","");
    }
    
    
        
    
}
