/*
40. Escribe un programa que sea capaz de insertar un dígito dentro de un número indicando la
 posición. El nuevo dígito se colocará en la posición indicada y el resto de dígitos se desplazará
 hacia la derecha.
 Ejemplo: Introduzca un número entero positivo: 406783
 Introduzca la posición donde quiere insertar: 3
 Introduzca el dígito que quiere insertar: 5
 El número resultante es 4056783.
 */
package ejercicios1;
import java.util.Scanner;
public class Ejercicio40 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        long numero,invertido=0,auxiliar;
        int digito,posicion,cantidad=0;
        
        System.out.println("Introduce numero:");
        numero=teclado.nextLong();
        auxiliar=numero;
        
        // Damos la vuelta al numero e calculamos nº de digitos que tiene
        while(auxiliar>0){
            invertido=invertido*10+auxiliar%10;
            auxiliar=auxiliar/10;
            cantidad++;       
        }
        
        do{
            System.out.println("Introduce digito a insertar:");
            digito=teclado.nextInt();
        }while(digito<0 || digito>9);
        
        do{
            System.out.println("Introduce la posición entre 1 y "+cantidad);
            posicion=teclado.nextInt();
        }while(posicion<1 || posicion>cantidad);
        
        // Primera Parte del numero
        for(int i=1;i<posicion;i++){
            auxiliar=auxiliar*10+invertido%10;
            invertido=invertido/10;
        }
        
        // Introduce el digito
        auxiliar=auxiliar*10+digito;
        
        // Segunda parte del numero
        for(int i=posicion;i<=cantidad;i++){
            auxiliar=auxiliar*10+invertido%10;
            invertido=invertido/10;   
        }
        
        System.out.println();
        System.out.println("El numero inicial era: "+numero);
        System.out.println("El numero final es: "+auxiliar);
        
    }    
}