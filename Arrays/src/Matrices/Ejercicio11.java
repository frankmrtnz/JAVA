/*
11º. Realizar un programa que rellene un array de 6 filas por 10 columnas con números enteros
 positivos comprendidos entre 0 y 1000 (ambos incluidos). A continuación, el programa deberá
 dar la posición tanto del máximo como del mínimo.
*/

package Matrices;

public class Ejercicio11 {
    public static void main(String[] args) {
        
        int[][]array=new int[6][10];
        
        for(int i=0;i<array.length;i++) 
            for (int j=0;j<array[i].length;j++) 
                array[i][j]=(int)(Math.random()*1001);    /* Nºs aleatorios entre 0 y 1000 */
        
        
        for(int i=0;i<array.length;i++){
            for (int j=0;j<array[i].length;j++)
                System.out.print(array[i][j]+" ");
            System.out.println();
        }
        
        int max=array[0][0];
        int min=array[0][0];
        int fmx=0, cmx=0, fmn=0, cmn=0;
        
        for(int i=0;i<array.length;i++){ 
            for (int j=0;j<array[i].length;j++) 
                if(max<array[i][j]){
                    max=array[i][j];
                    fmx=i;
                    cmx=j;
                }
                else if(min>array[i][j]){
                    min=array[i][j];
                    fmn=i;
                    cmn=j;
                }
        }
        
        System.out.println("El valor maximo es "+max+" y se encuentra en la posicion ("+(fmx+1)+","+(cmx+1)+")");
        System.out.println("El valor maximo es "+min+" y se encuentra en la posicion ("+(fmn+1)+","+(cmn+1)+")");
                
        
    }
}
