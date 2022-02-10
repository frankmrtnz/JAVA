/*
TABLA DE MULTIPLICAR DE UN Nº QUE SE PIDE POR TECLADO (Con decimales)
 */
package EstructurasdeControl;

import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        double numero1, producto;
        int i;
        
        System.out.println("Introduce un numero");
        numero1=teclado.nextDouble();
        
        System.out.println("La tabla de multiplicar de "+numero1+" es:");
        for (i=0;i<=10;i++){
            producto=numero1*i;
            System.out.println(""+numero1+" * "+i+" = "+producto);
        }
        
    }
}
