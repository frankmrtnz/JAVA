/*
13º. Realiza un programa que muestre por pantalla un array de 10 filas por 10 columnas relleno
 con números aleatorios entre 200 y 300. A continuación, el programa debe mostrar la diagonal
 principal y la media de los números que hay en esa diagonal.
*/
package Matrices;
public class Ejercicio13 {
    public static void main(String[] args) {
    
    int[][] num=new int[10][10];
        int suma=0;
        
        for(int i=0;i<num.length;i++)
         for(int j=0;j<num[i].length;j++)
           num[i][j]=(int)(Math.random()*101)+200;
        
        for(int i=0;i<num.length;i++){
         for(int j=0;j<num[i].length;j++)
           System.out.print(num[i][j]+" ");   
         System.out.println();    
        }     
        System.out.println("-------------------\n");     
        for(int i=0;i<num.length;i++){
         for(int j=0;j<num[i].length;j++)     
           if(i==j) 
            System.out.print(num[i][j]+" ");   
           else  
             System.out.print(" - ");
            System.out.println();
        }
        
        for (int i = 0; i < num.length; i++) 
         suma=suma+num[i][i]; 
        
        System.out.println("\nLa media de la diagonal"
                + " principal es "+(suma/num.length));    
        
    }
}
