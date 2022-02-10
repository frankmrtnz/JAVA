/*
6. Hacer un programa que lea 100 números aleatorios entre 0 y 9 y genere un histograma 
con las frecuencias de cada numero. Para representar las barras del histograma se utilizara 
secuencias ‘*’. 
Por ejemplo, la secuencia: 1, 1, 3, 4, 1, 3, 1, 2,......
generaría la siguiente salida: 
    1: ****
    2: * 
    3: ** 
    4: *
    ........... 
*/

package Ejercicios;

public class Ejercicio6 {
    public static void main(String[] args) {
        
        int[] frecuencia=new int[10];
        
        for(int i=1;i<=100;i++){
            frecuencia[(int)(Math.random()*10)]++;
        }
        
        for(int i=1;i<10;i++){
            System.out.print("\n"+i+": ");
            for(int j=0;j<=frecuencia[i];j++) {
                System.out.print("*");
            }
        }
   
    }
}
