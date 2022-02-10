/*
5. Hacer un programa que pida un numero por teclado y después diga si el numero 
introducido es capicúa o no.
*/
package Ejercicios;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
     Scanner teclado=new Scanner(System.in);
     
     int numero, auxiliar, cont=0;
     
        System.out.println("Introducir un numero");
        numero=teclado.nextInt();
        auxiliar=numero;
        
        while(auxiliar>0){
            auxiliar=auxiliar/10;
            cont++;
        }
        
        int[] num=new int[cont];
        int[] num1=new int[cont];
        
        auxiliar=numero;
        
        cont=0;
        while(auxiliar>0){
            num[cont]=auxiliar%10;
            num1[num1.length-1-cont]=auxiliar%10;
            auxiliar=auxiliar/10;
            cont++;
        }
        
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }        
        System.out.println();
        
        for(int i=0;i<num1.length;i++){
            System.out.print(num1[i]+" ");
        }
        System.out.println();
        
        cont=0;
        while(cont<num.length && num[cont]==num1[cont]){
            cont++;
        }
        
        if(cont==num.length){
            System.out.println("El numero "+numero+" es capicua.");
        }else
            System.out.println("El numero "+numero+" NO es capicua.");
        
     
    }    
}
