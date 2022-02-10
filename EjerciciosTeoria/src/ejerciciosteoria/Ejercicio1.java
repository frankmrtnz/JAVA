/*
1.- Escribe un programa que solicite al usuario que ingrese su nombre. El nombre se debe 
almacenar en una variable llamada nombre. A continuaciÃ³n se debe mostrar en pantalla el texto 
â€œAhora estÃ¡s en la matrix, [usuario]â€?, donde â€œ[usuario]â€? se reemplazarÃ¡ por el nombre que el usuario 
haya ingresado.
 */
package ejerciciosteoria;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in); //Definicion del objeto con el que voy a leer del teclado
        String nombre;
        System.out.println("Introduce tu nombre");
        nombre=teclado.nextLine();
        System.out.println("Ahora estás en la matrix, "+nombre);
     
    }
}
