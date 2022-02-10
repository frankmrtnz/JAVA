
package EjercicioRepaso_1.Ejercicio1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class Ej1_MiClase extends ObjectOutputStream {
    
    Ej1_MiClase(FileOutputStream fos) throws IOException {
        super(fos);        
    }

    @Override
    protected void writeStreamHeader() throws IOException {
        
    }
    
    
    
}
