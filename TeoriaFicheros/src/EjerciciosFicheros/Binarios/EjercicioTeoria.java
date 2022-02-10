
package EjerciciosFicheros.Binarios;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class EjercicioTeoria {
    public static void main(String[] args) {
        
        try {
            
            File f = new File("fichero.bin");
                  
            FileOutputStream fos = new FileOutputStream(f); //Escritura
            DataOutputStream dos = new DataOutputStream(fos);
            
            dos.writeInt(123);
            dos.writeDouble(2.5);
            dos.writeUTF("Java");
            
            dos.writeInt(139);
            dos.writeDouble(7.25);
            dos.writeUTF("BBDD");
            
            dos.close();
            fos.close();
            
            
            
            FileInputStream fis = new FileInputStream(f);  //Lectura
            DataInputStream dis = new DataInputStream(fis);
            
            try{
                int valor1;
                String valor2;
                double valor3;
                
                while(true){
                    valor1 = dis.readInt();    //Ponerlo en el orden que hemos escrito arriba!
                    valor3 = dis.readDouble();
                    valor2 = dis.readUTF();
                    System.out.println(valor1+" "+valor3+" "+valor2);
                }
            }catch(EOFException ex){
                System.out.println("NO TENGO MAS DATOS");
            }
            
            fis.close();
            dis.close();
            
            
            
        } catch (IOException ex) {
            System.out.println(ex);
        }
        
    }
}
