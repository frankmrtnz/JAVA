/*
CALCULADORA MINI
 */
package EstructurasdeControl;

import java.util.Scanner;

public class MiniCalculadora {
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        int numero1, numero2, resultado=0; /*Resultado se debe iniciar por un valor cualquiera
                                             para que default escriba la frase, en este caso 0*/
        char operacion;
        boolean correcta=true;
        
        System.out.println("Introduce el primer numero");
        numero1=teclado.nextInt();
        System.out.println("Introduce el segundo numero");
        numero2=teclado.nextInt();
        System.out.println("Introduce operacion: +,-,*,/,%");
        operacion=teclado.next().charAt(0); //El (0) es la posicion del char
        
        switch(operacion){
            case '+':resultado=numero1+numero2;
                    break;
            case '-':resultado=numero1-numero2;
                    break;
            case '*':resultado=numero1*numero2;
                    break;
            case '/':resultado=numero1/numero2;
                    break;
            case '%':resultado=numero1%numero2;
                    break;
            default:correcta=false;
                break;
        }
        if(correcta)
            System.out.println("El resultado de la "+operacion+" es "+resultado);
        else
            System.out.println("Operacion incorrecta"); 
    }    
}
