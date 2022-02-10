
package EjerciciosFicheros.Binarios;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;


public class Ejercicio7y8 {
    public static void main(String[] args) {
        
        try {
            //EJERCICIO 7:
            File f = new File("temperaturas.txt");
            File f1 = new File("Septemp.dat");
            
            String cadena;
            String[] valores;
            
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            FileOutputStream fos = new FileOutputStream(f1); //Escritura
            DataOutputStream dos = new DataOutputStream(fos);
            
            cadena = br.readLine();
            while(cadena != null) {
                valores = cadena.split(" ");
                dos.writeInt(Integer.parseInt(valores[0]));
                dos.writeInt(Integer.parseInt(valores[1]));
                cadena = br.readLine();
            }
            
            dos.close();
            fos.close();
            br.close();
            fr.close();              
            
            
            
            //EJERCICIO 8:
            FileInputStream fis = new FileInputStream(f1);  //Lectura
            DataInputStream dis = new DataInputStream(fis);
            
            int hora,temp,tempmax = 0,tempmin = 0,hc = 0,hf = 0,suma = 0;
            boolean flag = true;
            
            try {                
                while(true) {
                    hora = dis.readInt();
                    temp = dis.readInt();
                    if(flag) {
                        tempmax = temp;
                        hc = hora;
                        tempmin = temp;
                        hf = hora;
                        flag = false;
                    }
                    suma = suma+temp;
                    if(temp > tempmax) {
                        tempmax = temp;
                        hc = hora;
                    } 
                    if(temp < tempmin) {
                        tempmin = temp;
                        hf = hora;
                    }
                }
            } catch (EOFException ex) {
                System.out.println("NO HAY MAS DATOS");
            }
            
            dis.close();
            fis.close();
            
            System.out.println("Maxima "+tempmax+" a las "+hc);
            System.out.println("Minima "+tempmin+" a las "+hf);
            System.out.println("Temperatura media del dia "+suma/24);
            
            
        } catch (IOException ex) {
            System.out.println(ex);
        }
        
    }
}
