/*
Programa que calcula la nota media por asignatura y la muestra en pantalla.
Los datos se encuentran en el fichero "curso.txt"
*/
package EjerciciosFicheros.Texto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;;
import java.io.IOException;


public class EjercicioEjemploSPLIT {
    public static void main(String[] args) {
        
        try {
            
            File f = new File("curso.txt");
            
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
                
            String cadena;
            String[] campos;
            double sum1 = 0, sum2 = 0, sum3 = 0;
            int cont1 = 0, cont2 = 0, cont3 = 0;
            
            cadena = br.readLine();
            while(cadena != null) { 
                campos = cadena.split(" ");  //Hace separacion del array, dará 3 posiciones. Se puede poner otro caracter
                
                //System.out.println(campos[0]+" "+campos[1]+" "+campos[2]);
                
                if(campos[1].equals("asignatura1")) {
                    sum1 = sum1 + Integer.parseInt(campos[2]);
                    cont1++;
                } else if (campos[1].equals("asignatura2")) {
                    sum2 = sum2 + Integer.parseInt(campos[2]);
                    cont2++;
                } else {
                    sum3 = sum3 + Integer.parseInt(campos[2]);
                    cont3++;
                }
                
                cadena = br.readLine();
            }
            
            
            br.close();
            fr.close();
            
            
            System.out.println("La media de la asignatura1 es "+sum1/cont1);
            System.out.println("La media de la asignatura2 es "+sum2/cont2);
            System.out.println("La media de la asignatura3 es "+sum3/cont3);
            
            
        } catch (IOException ex) {
            System.out.println(ex);
        }
        
    }
}
