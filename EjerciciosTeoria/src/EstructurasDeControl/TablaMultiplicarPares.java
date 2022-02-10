/*
TABLA DE MULTIPLICAR DE LOS Nºs PARES DEL 1 AL 10
 */
package EstructurasdeControl;


public class TablaMultiplicarPares {
    public static void main(String[] args) {
        int numero;
        
        for (numero=0;numero<=10;numero=numero+2){
            System.out.println("TABLA DEL "+numero);
            for (int i=0;i<=10;i++)
                System.out.println(numero+" * "+i+" = "+(numero*i));
        }
    }
}
