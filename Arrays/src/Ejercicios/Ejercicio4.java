/*
4. Hacer un programa que calcule la letra de un DNI. Se pedirá el DNI por teclado y devolverá 
el DNI la letra. Para buscar la letra, se calcula el resto de dividir el dni entre 23, y con 
el resultado que estará entre 0 y 22, se busca en el array de caracteres la letra correspondiente. 
El orden de los caracteres es: T, R, W, A, G, M, Y, F, P, D, X, B, N, J, Z, S, Q, V, H, L, C, K, E
*/

package Ejercicios;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        int dni;
        char[] letra={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        
        System.out.println("Introducir dni");
        dni=teclado.nextInt();
        
        System.out.println("Su letra es "+letra[dni%23]);
        
    }    
}
