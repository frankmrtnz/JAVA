/*
Arrays de 2 dimensiones:
*/

package Matrices;
public class Ejemplo {
    public static void main(String[] args) {
        
        int[][] matriz=new int[3][5];   
        // 3 filas y 5 columnas. Como tablero de ajedrez, aunque no se represente así (es lineal)
        
        int[][] matriz1={{1,2},{3,4,5,6},{7,8,9},{10},{11,12}};
        
        for (int i=0;i<matriz.length;i++) {     // Con esto le digo las filas
            for (int j=0;j<matriz[i].length;j++) {     // Con esto le digo las columnas
                System.out.print("("+i+","+j+")="+matriz[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("------------------------");
        
        for (int i=0;i<matriz1.length;i++) {     // Con esto le digo las filas
            for (int j=0;j<matriz1[i].length;j++) {     // Con esto le digo las columnas
                System.out.print("("+i+","+j+")="+matriz1[i][j]+" ");
            }
            System.out.println();
        }
        
        
    }
}
