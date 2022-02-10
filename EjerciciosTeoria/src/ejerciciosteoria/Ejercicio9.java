/*
9.- Escribe un programa que solicite al usuario que ingrese cuántos shows
musicales ha visto en el último año y almacene ese número en una variable. A
continuación mostrar en pantalla un valor de verdad (True o False) que indique
si el usuario ha visto más de 3 shows.
 */
package ejerciciosteoria;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        int show;
        boolean valor;
        System.out.println("Introduce los shows vistos en el ultimo año");
        show=teclado.nextInt();
        valor=show>3;
        System.out.println("Has visto mas de 3 shows "+valor);
        System.out.println("Has visto mas de 3 shows "+(show>3));
    }    
}
