
package teoriaficheros.Serializables;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class FicheroSerializable {
    public static void main(String[] args) {
        
        try {
        
            File f = new File("datos.obj");
            File f1 = new File("auxiliar.obj");
            Alumno al;
            FileOutputStream fos = new FileOutputStream(f1);   //true es para sobreescribir en el fichero
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            try {
                
                while(true) {
                    al = (Alumno)ois.readObject();
                    oos.writeObject(al);  
                }
                
            } catch (EOFException ex) {
                System.out.println("NO HAY MAS DATOS");
            }
            
            al = new Alumno(50,"Alumno5",7.5);
            oos.writeObject(al);
            al = new Alumno(60,"Alumno6",3.5);
            oos.writeObject(al);
            
            
            
            ois.close();
            fis.close();
            oos.close();
            fos.close();
            
            f.delete();
            f1.renameTo(f);
            
            
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            
            try {
                
                while(true) {
                    al = (Alumno)ois.readObject();
                    System.out.println(al.toString());  //Hacer el toString en Alumno, antes de abrir el y escribir el archivo
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
