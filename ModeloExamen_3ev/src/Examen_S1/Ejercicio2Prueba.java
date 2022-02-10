
package Examen_S1;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class Ejercicio2Prueba {
    public static void main(String[] args) {
        
        try {
            
            File f = new File("futbol.bin");
        
            FileInputStream fis = new FileInputStream(f);
            DataInputStream dis = new DataInputStream(fis);
        
            try{
                String op, CodE;
                int g, p, e, pt;
                
                while(true){
                    op = dis.readUTF();   //Operacion
                    CodE = dis.readUTF();   //CodEdquipo  
                    g = dis.readInt();   //Ganados
                    p = dis.readInt();   //Perdidos
                    e = dis.readInt();   //Empates
                    pt = 3*g+e;   //Puntos
                    System.out.println(op+" "+CodE+" "+g+" "+p+" "+e+" "+pt);
                }
                
            }catch(EOFException ex){
                System.out.println("NO TENGO MAS DATOS");
            }
        
            dis.close();
            fis.close();          
            
        } catch (IOException ex) {
            System.out.println(ex);
        }
        
    }
}
