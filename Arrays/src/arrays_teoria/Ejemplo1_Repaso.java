/*
1. En 1995 la ciudad A tenía 3.5 millones de habitantes y una tasa de crecimiento
 del 7% anual; y la ciudad B tenía 5 millones de habitantes y una tasa de
 crecimiento del 5% anual.
 Si el crecimiento poblacional se mantiene constante en las dos ciudades, hacer
 un programa que calcule e imprima en qué año la población de la ciudad A es
 mayor que la de la ciudad B.

*/

package arrays_teoria;

public class Ejemplo1_Repaso {
    public static void main(String[] args) {
        
        double habA=3500000, habB=5000000;
        int cont=0;
        
        while(habA<habB){
            habA=habA+habA*7/100;
            habB=habB+habB*5/100;
            cont++;
        }
        
        System.out.println("Han pasado "+cont+" años");
        System.out.println("Le alcanza en el año "+(1995+cont));
        
        
    }
}
