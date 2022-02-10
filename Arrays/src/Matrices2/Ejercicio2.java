/*
2. Escribir un programa que lea una matriz entera de tamaño 4x5 y un valor entero, y muestre 
en pantalla la posición de la primera coincidencia del valor en la matriz.
*/

package Matrices2;

public class Ejercicio2 {
    public static void main(String[] args) {
    
        int[][] matriz=new int[4][5];
        int numero;
        
        System.out.print("NUMERO:");
            numero=(int)(Math.random()*10);
            System.out.println(numero);
        
        System.out.println("MATRIZ:");
        for (int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz[i].length; j++){
                matriz[i][j]=(int)(Math.random()*10);
                System.out.print("("+i+","+j+")="+matriz[i][j]+" ");
                if(numero==matriz[i][j])
                    System.out.print("*");
            }
            System.out.println();
        }
        
        
        System.out.println("La posicion donde se encuentra el numero es: ");
        
        
    }
}
