/*
5º. Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los muestre por 
pantalla separados por espacios. El programa pedirá entonces por teclado dos valores y a 
continuación cambiará todas las ocurrencias del primer valor por el segundo en la lista generada 
anteriormente. Los números que se han cambiado deben aparecer entrecomillados.
*/

package Ejercicios_Arrays;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        int[] numero=new int[100];
        int valor1, valor2;
        
        for(int i=0;i<numero.length;i++){
            numero[i]=(int)(Math.random()*21);
            System.out.print(numero[i]+" ");
        }
        
        System.out.println();
        System.out.println("Introduce valor de la lista");
        valor1=teclado.nextInt();
        System.out.println("Introduce valor para sustituir");
        valor2=teclado.nextInt();
        
        
        for (int i=0;i<numero.length;i++){
            if(numero[i]==valor1){
                numero[i]=valor2;
                System.out.print("\""+numero[i]+"\" ");  // \" para pintar comillas.
            }else
                System.out.print(numero[i]+" ");
            
        }    
                
                
        
        
        
        
    }
}
