/*
EJERCICIO 2 - EXAMEN - Francisco Martinez Martin - 1DAW
*/

package examen;

public class Ejercicio2 {
    public static void main(String[] args) {
        
        int[]array=new int[3];
        int i;
        
        do{
        for(i=0;i<array.length;i++){
            array[i]=(int)((Math.random()*1000)+1);
            System.out.print(array[i]+" ");
        }
        System.out.println();
        
            for(i=0;i<array.length;i++)    
                if(array[i]%2==0){
                    System.out.println("Array posicion "+i+" es par.");
                }
                else System.out.println("Array posicion "+i+" no es par.");
        }while((array[0]%2!=0) || (array[1]%2!=0) || (array[2]%2==0));        
        
        
    }     
}
