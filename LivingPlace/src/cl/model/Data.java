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
    
    public boolean existeRut(int rut) throws SQLException{
        boolean existe = false;
        
        query = "SELECT COUNT(*) id FROM persona WHERE run = "+rut+" ";
        
        rs = con.ejecutarSelect(query);
        
        if(rs.next()){
            if (rs.getInt(1) == 0) {
                existe = true;
            }
        }
        
        return existe;
    }
    
        
    
}
