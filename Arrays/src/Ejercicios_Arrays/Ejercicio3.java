/*
3º. Escribe un programa que genere aleatoriamente un array de 15 componentes y muestre los 
valores máximo y mínimo junto con las palabras “máximo” y “mínimo” al lado respectivamente.
*/

package Ejercicios_Arrays;

public class Ejercicio3 {
    public static void main(String[] args) {
        
        int[] numero=new int[15];
        int max,min;
        
        for(int i=0;i<numero.length;i++)
            numero[i]=(int)(Math.random()*1000);
        
        
        max=numero[0];
        min=numero[0];
        
        for(int i=1;i<numero.length;i++){
            if(numero[i]<min)
                min=numero[i];
            else if(numero[i]>max)
                max=numero[i];                   
        }
        
        for(int i=1;i<numero.length;i++)
            System.out.print(numero[i]+" ");
            System.out.println("\n"+min+" Minimo");
            System.out.println(max+" Maximo");
            
        
    }    
}
