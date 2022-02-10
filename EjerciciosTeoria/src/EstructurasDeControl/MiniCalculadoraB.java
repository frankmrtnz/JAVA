/*
CALCULADORA MINI B
 */
package EstructurasdeControl;

import java.util.Scanner;

public class MiniCalculadoraB {
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        int numero1, numero2, resultado=0;
        String operacion;
        boolean correcta=true;
        
        System.out.println("Introduce el primer numero");
        numero1=teclado.nextInt();
        System.out.println("Introduce el segundo numero");
        numero2=teclado.nextInt();
        System.out.println("Introduce operacion: Suma,Resta,Producto,Division,Resto");
        operacion=teclado.next();
        //teclado.nextLine();  -> Cuando se necesita leer caracteres con espacios en blanco
        switch(operacion){
            case "Suma":resultado=numero1+numero2;
                    break;
            case "Resta":resultado=numero1-numero2;
                    break;
            case "Producto":resultado=numero1*numero2;
                    break;
            case "Division":resultado=numero1/numero2;
                    break;
            case "Resto":resultado=numero1%numero2;
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
