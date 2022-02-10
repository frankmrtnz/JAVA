/*
4º. Escribe un programa que genere aleatoriamente un array de 20 componentes y rote los 
elementos del array, es decir, el elemento de la posición 0 debe pasar a la posición 1, 
el de la 1 a la 2, etc. El número que se encuentra en la última posición debe pasar a la 
posición 0. Finalmente, mostrar el contenido del array.
*/

package Ejercicios_Arrays;
public class Ejercicio4 {
    public static void main(String[] args) {
        
        int[] numero=new int[20];
        int valor;
        
        for(int i=0;i<numero.length;i++){
            numero[i]=(int)(Math.random()*100);
            System.out.print(numero[i]+" ");
        }
        
        valor=numero[numero.length-1];
        System.out.print("\n"+valor+" ");
        
         for(int i=0;i<numero.length-1;i++){
             System.out.print(numero[i]+" ");
         }
                  
                    
                    
        
        
    }    
}
