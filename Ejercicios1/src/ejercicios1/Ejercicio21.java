/*
21. Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
 */
package ejercicios1;

public class Ejercicio21 {
    public static void main(String[] args) {
    int i;
    
        System.out.println("Números primos entre 2 y 100: ");
    
    for(int numero=2;numero<=100;numero++){
        i=2;        
        while(i<numero && numero%i!=0)
            i++;
        if(i==numero)
            System.out.print(numero+" ");
    }
        
    /*OTRA FORMA DE HACERLO:        
    System.out.println("Números primos entre 2 y 100: ");
    
    boolean esPrimo = true;
    
    for (int n = 2; n <= 100; n++) {
    
    // COMPRUEBA SI N ES PRIMO
    esPrimo = true;
    for (int i = 2; i < n; i++) {
    if (n % i == 0) {
    esPrimo = false;
    }
    }
    
    // SI N ES PRIMO, SE MUESTRA POR PANTALLA
    if (esPrimo) {
    System.out.print(n+" ");
    }
    }
    System.out.println();*/
    
  }
}
