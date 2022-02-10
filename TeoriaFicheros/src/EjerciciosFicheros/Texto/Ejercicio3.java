/*
3º.- Crear dos ficheros f1.txt y f2.txt, que tendrán un solo carácter por línea y que estarán 
ordenados alfabéticamente,y generar el fichero f3.txt que será la fusión de f1 y f2 manteniendo
su ordenación. Escribir por pantalla el fichero resultante.
 */
package EjerciciosFicheros.Texto;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Ejercicio3 {
    public static void main(String[] args) {
        
        try {
            
            File f1 = new File("f1.txt");
            File f2 = new File("f2.txt");
            File f3 = new File("f3.txt");
            
            
            FileReader fr1 = new FileReader(f1);
            FileReader fr2 = new FileReader(f2);
            FileWriter fw3 = new FileWriter(f3);
            
            int caracter1 = fr1.read();
            int caracter2 = fr2.read();
            
            while(caracter1 != -1 && caracter2 != -1) {
                if(caracter1 < caracter2){
                    fw3.write(caracter1);
                    caracter1 = fr1.read();
                } else if (caracter1 > caracter2) {
                    fw3.write(caracter2);
                    caracter2 = fr2.read();
                } else {
                    fw3.write(caracter1);
                    fw3.write("\r\n");
                    fw3.write(caracter2);
                    caracter1 = fr1.read();
                    caracter2 = fr2.read();
                }
            }
            
            while(caracter1 != -1){
                fw3.write(caracter1);
                caracter1 = fr1.read();
            }
            
            while(caracter2 != -1){
                fw3.write(caracter2);
                caracter2 = fr2.read();
            }
            
              
            fw3.close();
            fr2.close();
            fr1.close();           
            
        } catch (IOException ex) {
            System.out.println(ex);
        }
        
    }
}
