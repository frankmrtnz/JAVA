/*
2º.-Leer el fichero de texto, parrafo.txt, ygenerar otro ficheroque sea el inicial pero sin las vocales.
Sacar por pantalla el ambos ficheros. Hacerlo en el mismo archivo, no creando otro.
*/

package EjerciciosFicheros.Texto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;




public class Ejercicio2v2 {
    public static void main(String[] args) {
        
        try {
            
            File f = new File("parrafo2v2.txt");
            File f1 = new File("auxiliar.txt");  // No poner nunca aux.txt (no se crea)
            
            
            FileReader fr = new FileReader(f);           
            FileWriter fw = new FileWriter(f1);
     
            int caracter = fr.read();
            while(caracter != -1) {
                if(caracter != 'a' && caracter != 'e' && caracter != 'i' && caracter != 'o' && caracter != 'u')
                    fw.write(caracter);
                else
                    fw.write('*');
                
                caracter = fr.read();
            }   

            fw.close();
            fr.close();
            
            
            f.delete();
            f1.renameTo(f);   //Renombro el auxiliar con el nombre de parrafo2v2
            
            
            fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            
            String frase = br.readLine();
            while(frase != null) {
                System.out.println(frase);
                frase = br.readLine();
            }
            
            br.close();
            fr.close();
            
        } catch (IOException ex) {
            System.out.println(ex);
        }
        
        
        
    }
 
}
