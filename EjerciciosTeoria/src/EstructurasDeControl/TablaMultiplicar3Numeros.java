/*
TABLA DE MULTIPLICAR DE LA MULTIPLICACION DE TRES NUMEROS QUE SE PIDEN POR TECLADO
 */
package EstructurasdeControl;

import java.util.Scanner;

public class TablaMultiplicar3Numeros {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int numero1,numero2,numero3,producto,i,resultado;
       
            System.out.println("Introduce el primer numero");
            numero1=teclado.nextInt();
            System.out.println("Introduce el segundo numero");
            numero2=teclado.nextInt();
            System.out.println("Introduce el tercer numero");
            numero3=teclado.nextInt();
            
            System.out.println("La multiplicacion de estos tres numeros será:");
            producto=numero1*numero2*numero3;
            System.out.println(numero1+" * "+numero2+" * "+numero3+" = "+producto);
            
            System.out.println("La tabla de multiplicar del "+producto+" es:");
            for (i=0;i<=10;i++){
                resultado=producto*i;
                System.out.println(producto+" * "+i+" = "+resultado);
            }
                     
    }
}
