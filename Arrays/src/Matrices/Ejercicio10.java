/*
10º. Escribe un programa que pida 20 números enteros. Estos números se deben introducir en
 un array de 4 filas por 5 columnas. El programa mostrará las sumas parciales de filas y
 columnas igual que si de una hoja de cálculo se tratara. La suma total debe aparecer en la
 esquina inferior derecha.
*/
package Matrices;
public class Ejercicio10 {
    public static void main(String[] args) {
      
    int[][] numero=new int[4][5]; 
    int[] fila=new int[4];
    int[] columna=new int[5];
    int total=0,sumaf=0,sumac=0;
   
    for(int i=0;i<numero.length;i++)
        for(int j=0;j<numero[i].length;j++)
     numero[i][j]=(int)(Math.random()*10);
   
    for(int i=0;i<numero.length;i++){
        for(int j=0;j<numero[i].length;j++)
        sumaf=sumaf+numero[i][j];
        fila[i]=sumaf;
        sumaf=0;
        total=total+fila[i];
      //Equivalente fila[i]=fila[i]+numero[i][j];
   }
   
   for(int i=0; i<numero[0].length;i++){
     for(int j=0;j<numero.length;j++)
       sumac=sumac+numero[j][i];
     columna[i]=sumac;
     sumac=0;
    }
   
   for(int i=0;i<numero.length;i++){
      for(int j=0;j<numero[i].length;j++)
        System.out.print(numero[i][j]+" ");
      System.out.println("--"+fila[i]);
   }
   
   for(int i=0;i<columna.length;i++)
     System.out.print(columna[i]+"  "); 
   System.out.print(total);    
        
        
    }
}
