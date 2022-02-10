/*
HACER PROGRAMA EN EL QUE TENGAS QUE INTRODUCIR LA NOTA Y TE DIGA SI 
ES UN INSUFICIENTE, SUFICIENTE, BIEN, NOTABLE, SOBRESALIENTE.
 */
package EstructurasdeControl;

import java.util.Scanner;

public class IntroducirNota {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        double nota;
        
        System.out.println("Introduce la nota");
        nota=teclado.nextDouble();
        
        if(nota<=4){
            System.out.println("Es un INSUFICIENTE");
        }
        else if(nota>=5&&nota<6){
            System.out.println("Es un SUFICIENTE");
        }
        else if(nota>=6&&nota<7){
            System.out.println("Es un BIEN");
        }
        else if(nota>=7&&nota<=8){
            System.out.println("Es un NOTABLE");
        }
        else if(nota>=9&&nota<=10){
            System.out.println("Es un SOBRESALIENTE");
        }
        else{
            System.out.println("La NOTA introducida NO es valida");
        }
        
        
   }      
}
