/*
12º. Hacer un programa que cree el juego “Busca el tesoro” de tal forma que inicialmente la matriz
 de 10 filas y 10 columnas estará con todos los valores a 0. Posteriormente, se generara una
 posición (fila, columna) aleatoriamente que se pondrá a 1 que será el tesoro y otras 4 más
 que son minas y que se marcaran con un -1. El juego consistirá en encontrar el tesoro pero si
 hay una mina a una casilla de distancia, el programa avisara diciendo ¡Cuidado! ¡Hay una mina
 cerca!. Se tendrán 8 oportunidades para encontrar el tesoro.
*/

package Matrices;
import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
    int[][]juego=new int[10][10];
    int f,c;
    
    f=(int)(Math.random()*10);
    c=(int)(Math.random()*10);
    juego[f][c]=1;
    
    int cont=0;
    
    while(cont<4){
        f=(int)(Math.random()*10);
        c=(int)(Math.random()*10);
        if(juego[f][c]==0){
            juego[f][c]=-1;
            cont++;
        }
    }
    
    for(int i=0;i<juego.length;i++){
        for(int j=0;j<juego[i].length;j++){
            System.out.printf("%3d",juego[i][j]);    /* Da el formato para que no esten desalineadas las columnas */
        } 
        System.out.println();   
    }
        
        
    }
}
