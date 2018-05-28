package cl.model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Restauracion {
    
    public static void main(String[] args) {
        
        try {
            Process p = Runtime.getRuntime().exec("mysql -u root living_place_restauracion");
        
        OutputStream os = p.getOutputStream();
        FileInputStream fis = new FileInputStream("backup_living_place.sql");

        byte[] buffer = new byte[1000];
        
        int leer = fis.read(buffer);
        
            while (leer > 0 ) {                
                os.write(buffer, 0, leer);
                leer = fis.read(buffer);
            }
            os.flush();
            os.close();
            fis.close();
        
        
        
        } catch (IOException ex) {
            Logger.getLogger(Respaldo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
