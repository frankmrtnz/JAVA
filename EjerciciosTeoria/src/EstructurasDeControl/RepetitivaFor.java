/*
REPETITIVAS - for
 */
package EstructurasdeControl;

public class RepetitivaFor {
    public static void main(String[] args) {
        int i;
        
        // EJEMPLO DE INCREMENTO:
        for(i=1;i<=10;i++){ // También podemos meter el "int" dentro del parentesis antes de i=1
            System.out.println("HOLA MUNDO "+i);            
        }
        System.out.println("FUERA DEL BUCLE HOLA MUNDO "+i); // Aqui el i=11
        
        // EJEMPLO DE DECREMENTO:
        for(i=10;i>=1;i--){ 
            System.out.println("HOLA MUNDO "+i);            
        }
        System.out.println("FUERA DEL BUCLE HOLA MUNDO "+i); // Aqui el i=0
        
        // EJEMPLO DE for dentro de for
        for(i=1;i<=5;i++){
            for (int j=1;j<=3;j++) // Podemos poner j=i
                System.out.println("(i,j)= ("+i+","+j+")");
            System.out.println("CAMBIAMOS");            
        }
        
        
         
    }
}
