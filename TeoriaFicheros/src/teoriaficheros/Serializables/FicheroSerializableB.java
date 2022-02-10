
package teoriaficheros.Serializables;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class FicheroSerializableB {
    public static void main(String[] args) {
        
        //MANERA CORRECTA DE AÑADIR INFO AL FICHERO SERIALIZABLE, AUNQUE SE PUEDE HACER DE LA OTRA FORMA (FicheroSerializable)
        try {
            
            File f = new File("datos2.obj");
            Alumno al;

            //Se crea y cierra para que el true del siguiente fos no de problemas
            if(!f.exists()) {
                FileOutputStream fos = new FileOutputStream(f);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.close();
                fos.close();
            }
            
            FileOutputStream fos = new FileOutputStream(f,true); //Escritura
            MiClase mc = new MiClase(fos);

            al = new Alumno(50,"Alumno5",7.5);
            mc.writeObject(al);
            al = new Alumno(60,"Alumno6",3.5);
            mc.writeObject(al);
            
            mc.close();
            fos.close();
            
            
            
            FileInputStream fis = new FileInputStream(f);  //Lectura
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            try {                
                while(true) {
                    al=(Alumno)ois.readObject();
                    System.out.println(al.toString());
                }
            } catch (EOFException ex) {
                System.out.println("NO HAY MAS DATOS");
            }
            
            ois.close();
            fis.close();
            
            
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        } 
        
    }
}
