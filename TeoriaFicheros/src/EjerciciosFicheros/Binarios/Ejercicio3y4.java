
package EjerciciosFicheros.Binarios;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class Ejercicio3y4 {
    public static void main(String[] args) {
        
        try {
            
            File f = new File("datosbeca.bin");
            
            //EJERCICIO 3:
            FileOutputStream fos = new FileOutputStream(f); //Escritura
            DataOutputStream dos = new DataOutputStream(fos);
            
            dos.writeUTF("alumno1");   // UTF = cadena
            dos.writeChar('H');
            dos.writeInt(21);
            dos.writeInt(0);
            dos.writeBoolean(true);
            dos.writeDouble(35689.75);
            
            dos.writeUTF("alumno2");  
            dos.writeChar('H');
            dos.writeInt(23);
            dos.writeInt(1);
            dos.writeBoolean(false);
            dos.writeDouble(29654.50);
            
            dos.writeUTF("alumno3");   
            dos.writeChar('M');
            dos.writeInt(22);
            dos.writeInt(0);
            dos.writeBoolean(false);
            dos.writeDouble(41242.75);
            
            dos.writeUTF("alumno4");
            dos.writeChar('H');
            dos.writeInt(18);
            dos.writeInt(2);
            dos.writeBoolean(false);
            dos.writeDouble(21126.45);
            
            dos.close();
            fos.close();
            
            
            
            //EJERCICIO 4:
            FileInputStream fis = new FileInputStream(f);  //Lectura
            DataInputStream dis = new DataInputStream(fis);
            
            String nombre;
            char sexo;
            int edad, sus, beca=0;
            boolean casa;
            double ingresos;
            
            try {                
                while(true) {
                    nombre = dis.readUTF();
                    sexo = dis.readChar();
                    edad = dis.readInt();
                    sus = dis.readInt();
                    casa = dis.readBoolean();
                    ingresos = dis.readDouble();
                    if(ingresos <= 12000)
                        beca = beca+500;
                    if(edad < 23)
                        beca = beca+200;
                    if(!casa) // !casa = false
                        beca = beca+1000;
                    if(sus == 0)
                        beca = beca+500;
                    else if(sus == 1)
                        beca = beca+200;
                    else beca = 0;
                    
                    if(beca != 0)
                        System.out.println("El alumno "+nombre+" tiene una beca de "+beca+" euros");
                }
            } catch (EOFException ex) {
                System.out.println("NO HAY MAS DATOS");
            }
            
            dis.close();
            fis.close();        
            
            
        } catch (IOException ex) {
            System.out.println(ex);
        }
        
    }
}
