package cl.model;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Respaldo {

    public static void main(String[] args) {
       
        try {
            Process p = Runtime.getRuntime().exec("mysqldump -u root living_place");
        
            try (FileOutputStream fos = new FileOutputStream("backup_script_DB.sql")) {
                InputStream is = p.getErrorStream();
                byte[] buffer = new byte[1000];
                
                int leer = is.read(buffer);
                
                while (leer > 0 ) {
                    fos.write(buffer, 0, leer);
                    leer = is.read(buffer);
                }
            }
        
        
        
        } catch (IOException ex) {
            Logger.getLogger(Respaldo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
