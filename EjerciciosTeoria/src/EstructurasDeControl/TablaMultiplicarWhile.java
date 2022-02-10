/*
TABLA MULTIPLICAR USANDO EL WHILE.
 */
package EstructurasdeControl;

import java.util.Scanner;

public class TablaMultiplicarWhile {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int numero,i;
        
        System.out.println("Introduce un numero");
        numero=teclado.nextInt();
        i=1;
        while(i<=10){
            System.out.println(numero+" * "+i+" = "+(numero*i));
            i++;//i=i+1 -> i+=1
        }
        System.out.println(numero+" * "+i+" = "+(numero*i)); //Aqui i=11
    }
    
}
