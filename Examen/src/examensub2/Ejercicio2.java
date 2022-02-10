/*
2. Hacer un programa que generétres números aleatorios comprendidos entre 0 y 1000 y, a continuación, 
verificar si se ha obtenido dos números pares seguidos de un número impar. Si no fuera el caso, repetir 
hasta tener la combinación par, par, impar. Mostrar, a continuación, el número de ensayos realizados 
para obtener dicha combinación.
*/

package examensub2;
public class Ejercicio2 {
    public static void main(String[] args) {
        
        int[]array=new int[3];
        int i, cont=0;
        
        do{
        for(i=0;i<array.length;i++){
            array[i]=(int)(Math.random()*1001);    // Del 0 al 1000
            System.out.print(array[i]+" ");
        }
        System.out.println();
        
            for(i=0;i<array.length;i++)    
                if(array[i]%2==0){
                    System.out.println("Array posicion "+i+" es par.");
                }
                else System.out.println("Array posicion "+i+" no es par.");
        cont++;   
        }while((array[0]%2!=0) || (array[1]%2!=0) || (array[2]%2==0));        
        
        System.out.println("Se han necesitado "+cont+" intentos.");
        
    }     
}
