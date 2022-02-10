/*
41. Realiza un programa que pinte por pantalla un rectángulo hueco hecho con asteriscos. 
Se debe pedir al usuario la anchura y la altura. Hay que comprobar que tanto la anchura 
como la altura sean mayores o iguales que 2, en caso contrario se debe mostrar un mensaje de error.
Ejemplo: Introduzca la anchura del rectángulo (como mínimo 2): 6
Introduzca la altura (como mínimo 2): 4
            * * * * * *
            *         *
            *         *
            * * * * * *
 */
package ejercicios1;
import java.util.Scanner;
public class Ejercicio41 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        int base, altura;
        
        System.out.println("Introduce la anchura del rectángulo (como mínimo 2):");
        base=teclado.nextInt();
        System.out.println("Introduce la altura (como mínimo 2):");
        altura=teclado.nextInt();
        if(altura<2 || base<2){
            System.out.println("Error, alguno de los datos es menor de 2.");
        }else{
            System.out.println("DIBUJO:");
        }
        
        for(int i=1;i<=base;i++){  // Este for pinta el techo del rectangulo
            System.out.print("* ");
        }
        
        System.out.println();
        
        for(int i=1;i<=altura-2;i++){
            System.out.print("* ");
            for(int k=1;k<=base-2;k++){   // Introduce los espacios 
                System.out.print("  ");  
            }
            System.out.println("*");
        }
        
        for(int i=1;i<=base;i++){   // Este pinta el suelo del rectangulo
            System.out.print("* ");
        }
           
        
        
    }
}
