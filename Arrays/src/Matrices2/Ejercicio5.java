/*
5. Dada una matriz de dimensión 5x5:
• Elevar al cuadrado los elementos situados por encima de la diagonal principal.
• Sumar los elementos situados por debajo de la diagonal principal.
• Sumar 1 a elementos de la diagonal principal.
• Multiplicar por 2 los elementos de la diagonal inversa.
*/

package Matrices2;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        
        int[][] tabla=new int[5][5];
        
        for (int i=0; i<tabla.length; i++) 
            for (int j=0; j<tabla[i].length; j++) 
                tabla[i][j]=(int)(Math.random()*10);
                        
        Mostrar(tabla);                
                        
        // Apartado a
        
        for (int i=0; i<tabla.length; i++) 
            for (int j=i+1; j<tabla[i].length; j++) 
                tabla[i][j]=(int)Math.pow(tabla[i][j],2);
        
        Mostrar(tabla);
        
    }        
    
    
    static void Mostrar(int[][] tabla){  
        System.out.println("------------------------");
        
        for (int i=0; i<tabla.length; i++) 
            for (int j=0; j<tabla[i].length; j++) 
                System.out.printf("%4d",tabla[i][j]);
                System.out.println();    
    }
        
    
}
