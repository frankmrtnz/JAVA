/*
Convertir en expresiones numéricas los siguientes enunciados.
1.Elabore un expresión que sólo permita valores entre 1 y 10. (x>=1 and x<=10)
2.Elabore una expresión que permita valores entre 1 y 3, y 5 a 7 exclusivamente.
3.Elabore una expresión que permita edades entre 18 y 25 años.
 */
package ejerciciosteoria;

import java.util.Scanner;

public class Expresiones {
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        int valor;
        boolean resultado;
                
        System.out.println("Introducir un valor entero");
        valor=teclado.nextInt();
        
        resultado= valor>=1 && valor<=10;
        System.out.println("¿El valor de valor = "+valor+" esta entre 1 y 10? "+resultado);
        
        resultado= valor>=1&&valor<=3 || valor>=5&&valor<=7;
        System.out.println("¿El valor de valor = "+valor+" esta entre 1 y 3, y 5 a 7? "+resultado);
        
        System.out.println("Introducir la edad");
        valor=teclado.nextInt();
        
        resultado= valor>17 && valor<26;
        System.out.println("¿La edad de valor = "+valor+" esta entre 18 y 25? "+resultado);
 
    }
    
}
