/*
4º.- Hacer un programa que lea el fichero parrafo4.txt y lo codifique sumándole a cada letra un valor 
que se pedirá por teclado, guardarlo en otro fichero denominado codificado.txt.
Sacar por pantalla el nuevo fichero creado.
 */
package EjerciciosFicheros.Texto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// FALTA HACER!!!!!!!!!!!

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        try {
            
            File f = new File("parrafo4.txt");
            File f1 = new File("codificado.txt");
            
            int valor, caracter;

            FileReader fr = new FileReader(f);
            FileWriter fw = new FileWriter(f1);
            System.out.println("Introducir valor a sumar");
            valor = teclado.nextInt();
            caracter = fr.read();
            while(caracter != -1) {
                if((char)caracter >= 'a' && (char)caracter <= 'z') {
                    caracter = caracter + valor;
                    if((char)caracter > 'z') {
                        caracter = caracter - 'z' + 'a' - 1;
                    }
                }
                fw.write(caracter);
                caracter = fr.read();
            }
            
            fw.close();
            fr.close();
            
            
            fr = new FileReader(f1);
            BufferedReader br = new BufferedReader(fr);
            String cadena = br.readLine();
            while(cadena != null) {
                System.out.println(cadena);
                cadena = br.readLine();
            }
            
            br.close();
            fr.close();
            
            
        } catch (IOException ex) {
            System.out.println(ex);
        }
        
    }
}
