/*
1. Crear dos matrices de dimensión 4x4 de enteros y obtener una tercera matriz correspondiente 
a la suma de las dos.
*/

package Matrices2;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        int[][] matriz1=new int[4][4];
        int[][] matriz2={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        
        System.out.println("Matriz 1:");
        for (int i=0;i<matriz1.length;i++) {     // Con esto le digo las filas
            for (int j=0;j<matriz1[i].length;j++) {     // Con esto le digo las columnas
                matriz1[i][j]=(int)(Math.random()*100);
                System.out.print("("+i+","+j+")="+matriz1[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println("Matriz 2:");
        for (int i=0;i<matriz2.length;i++) {     // Con esto le digo las filas
            for (int j=0;j<matriz2[i].length;j++) {     // Con esto le digo las columnas
                System.out.print("("+i+","+j+")="+matriz2[i][j]+" ");
            }
            System.out.println();
        }
        
        int[][] matriz3=new int[4][4];
        System.out.println("---------------------------");
        System.out.println("Matriz 3 (Matriz1+Matriz2): ");
        for (int i=0;i<matriz3.length;i++) {     // Con esto le digo las filas
            for (int j=0;j<matriz3[i].length;j++) {     // Con esto le digo las columnas
                System.out.print("("+i+","+j+")="+(matriz1[i][j]+matriz2[i][j])+" ");
            }
            System.out.println();
        }
        
        
        
    }
}
