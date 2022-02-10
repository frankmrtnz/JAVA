/*
CALCULAR LA TABLA DE MULTIPLICAR DE UN NUMERO PEDIDO POR TECLADO
ADEMÁS, AÑADIMOS UNA CONDICIÓN QUE DIGAMOS QUE SIGA CALCULANDO O NO
 */
package EstructurasdeControl;

import java.util.Scanner;

public class TablasWhileV2 {
    public static void main(String[] args) {
         Scanner teclado=new Scanner(System.in);
         char respuesta;
         int numero,i;
         
         System.out.println("¿Quiere mostrar tabla de multiplicar?(Si/No)");
         respuesta=teclado.next().charAt(0);
         
         while(respuesta=='S' || respuesta=='s'){
             System.out.println("Introduce el numero");
             numero=teclado.nextInt();
             i=1;
             while(i<=10){
                 System.out.println(numero+" * "+i+" = "+(numero*i));
                 i++;
             }
         System.out.println("¿Quiere seguir mostrando tabla de multiplicar?(Si/No)");
         respuesta=teclado.next().charAt(0);
         }

    }
    
}
