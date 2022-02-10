/*
EJEMPLO DE MEZCLA DE LAS ESTRUCTURAS DE CONTROL
 */
package EstructurasdeControl;

public class TablasWhileV3 {
    public static void main(String[] args) {
        int i,j;
        
        for(i=20;i<=25;i++){
            if(i%2==0){
                System.out.println("LA TABLA DEL "+i);
                    j=10;
                while(j>=1){
                    System.out.println(i+" * "+j+" = "+(i*j));
                    j--;
                }           
            }
        else{
            System.out.println("El valor de i no es par");
        }
        }
    }
}   
