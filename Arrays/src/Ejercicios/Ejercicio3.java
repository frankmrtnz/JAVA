/*
3. Hacer un programa que cree un array cuyo tamaño se pedirá por teclado y cuyo contenido serán  
números aleatorios entre 1 y 300. Posteriormente se creara otro array que guardara aquellos números 
del primer array que acaben en un dígito que se indicara por teclado (se debe controlar que se 
introduce un numero correcto).Finalmente, mostrar por pantalla los dos arrays.
*/

package Ejercicios;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        int cantidad;
        System.out.println("Introduce numero de elementos del array");
        cantidad=teclado.nextInt();
        
        int[] numeros=new int[cantidad];
        int[] terminacion=new int[cantidad];
        
        int digito;
        
        for(int i=0;i<numeros.length;i++){
            numeros[i]=(int)(Math.random()*300)+1;
        }
        
        do{
            System.out.println("Introducir digito entre 0 y 9");
            digito=teclado.nextInt();
        }while(digito<0 || digito>9);
        
        cantidad=0;
        for(int i=0;i<numeros.length;i++){
            if(numeros[i]%10==digito){
                terminacion[cantidad]=numeros[i];
                cantidad++;
            }
        }
        
        System.out.println("Primer Array:");        
        for(int i=0;i<numeros.length;i++){
            System.out.print(numeros[i]+" ");
        }
        
        System.out.println("\nSegundo Array:");
        for(int i=0;i<cantidad;i++){
            System.out.print(terminacion[i]+" ");
        }
        System.out.println();
                   
                      
                
    }    
}
