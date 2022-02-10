/*
1. Producto de dos numeros mediante sumas sucesivas.
2. División de dos numeros mediante restas sucesivas.
*/

package ejercicios1;
import java.util.Scanner;
public class Prueba {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
    
        int num1,num2,producto=0,division1, division2;    
        
        System.out.println("Introduce el primer número:");
        num1=teclado.nextInt();
        System.out.println("Introduce el segundo número:");
        num2=teclado.nextInt();
        
        // Producto
        for(int i=1;i<=num2;i++){
            producto=producto+num1;
        }
        
        // Division1
        division1=producto;
        for(int i=1;i<num1;i++){
            division1=division1-num2;
        }
        
        // Division2
        division2=producto;
        for(int i=1;i<num2;i++){
            division2=division2-num1;
        }
        
        System.out.println("RESULTADOS:");
        System.out.println(num1+"*"+num2+" = "+producto);
        System.out.println(producto+"/"+num1+" = "+division1);
        System.out.println(producto+"/"+num2+" = "+division2);
    }    
}
