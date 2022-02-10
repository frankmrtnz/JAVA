/*
11. Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de los 5 primeros
números enteros a partir de uno que se introduce por teclado.
 */

package ejercicios1;
import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int numero;
        System.out.println("Introducir numero");
        numero=teclado.nextInt();
        System.out.println("NUMERO  CUADRADO    CUBO\n");
        
        for(int i=numero;i<=numero+5;i++)
            // System.out.println(i+"         "+i*i+"         "+(i*i*i));
            System.out.printf("%2d %10d %10d\n",i,(i*i),(i*i*i)); /* \n significa salto de linea
                                                                    y %Xd significa espacios en blanco */
    } 
}
