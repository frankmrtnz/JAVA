
package teoriaficheros.Serializables;

import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.FileOutputStream;

public class MiClase extends ObjectOutputStream {
    
    MiClase(FileOutputStream fos) throws IOException {
        super(fos);        
    }

    @Override
    protected void writeStreamHeader() throws IOException {  //Boton derecho, Insert Code - Override Method
        
    }
    
    
    
}
