/*
e) El método public void intercambia(int A[ ], int x int y), que recibe un array de enteros 
y dos valores enteros que corresponden a dos componentes del array e intercambie los valores 
de las componentes del array. El ejercicio se hará teniendo en cuenta que x e y son el contenido 
de dos posiciones del array y después se hará teniendo en cuenta que x e y son las posiciones del array.
*/

package Ejercicios2;
import java.util.Scanner;
public class Ejercicio3e {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        int n, x, y;
        int auxiliar;
        
        do{
            System.out.println("Introduce tamaño del array");
            n=teclado.nextInt();
        }while(n<=0);
        
        int[]array=new int[n];
        
        for(int i=0;i<array.length;i++){
            array[i]=(int)(Math.random()*n);
            System.out.print(array[i]+" ");
        }
        
        do{
        System.out.println("\nIntroduce valor X");
            x=teclado.nextInt();
        System.out.println("Introduce valor Y");
            y=teclado.nextInt();
        }while((x<0 || x>=n)  ||  (y<0 || y>=n));   
        
        int i=0;
        while(i<array.length && array[i]!=x)
            i++;
        
        if(i==array.length)
            System.out.println("El valor "+x+" no esta en el array");
        else{
            int j=0;
            while(j<array.length && array[j]!=x)
                j++;
            if(j==array.length)
                System.out.println("El valor "+y+" no esta en el array");
            else{
                auxiliar=array[i];
                array[i]=array[j];
                array[j]=auxiliar;                
             
            for(i=0;i<array.length;i++){
                System.out.print(array[i]+" ");
            }    
            }
        }    
        
        
        //    Buscar posicion que se encuentra y mostrar el cambio 
       
        
                
    }    
}
