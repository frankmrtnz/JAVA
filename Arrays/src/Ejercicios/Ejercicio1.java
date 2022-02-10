/*
1. Hacer un programa que rellene un array con los 100 primeros números enteros y los muestre en pantalla en
orden inverso a como se han introducido (orden inverso).
*/

package Ejercicios;
public class Ejercicio1 {
    public static void main(String[] args) {
        
        int[] numeros=new int[100];
        for(int i=0;i<numeros.length;i++){
            numeros[i]=1+i;
        }
        for(int i=numeros.length-1;i>=0;i--){
            System.out.println("numeros["+i+"] = "+numeros[i]);
        }
        
        /*
        int[] numeros=new int[100];
        for(int i=0;i<numeros.length;i++)
        
        
        */
    }  
}
