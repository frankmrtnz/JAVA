/*
TODAS LAS TABLAS DEL 1 AL 10 USANDO WHILE
 */
package EstructurasdeControl;

import java.util.Scanner;

public class TablasWhile {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int i=20,j=10;
        
        while(i<=25){
            System.out.println("LA TABLA DEL "+i);
            while(j>=1){
                System.out.println(i+" * "+j+" = "+(i*j));
                j--;
            }
            i++;
            j=10;
        }
        
    }
    
}
