/*
14 Realizar un programa que diga si un número entero positivo introducido por teclado es capicúa. Se permiten
números de hasta 5 cifras
*/

package ejerciciosiniciales;
import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int numero,capicua=0,auxiliar;
        
        do{
            System.out.println("Introducir numero mayor de 9");
            numero=teclado.nextInt();
        }while(numero<10);
        
        auxiliar=numero;
        
        while(auxiliar>0){
            capicua=capicua*10+auxiliar%10;
            auxiliar=auxiliar/10;             
        }
        
        if(numero==capicua)
            System.out.println("El numero "+numero+" es capicua");     
        else 
            System.out.println("El numero "+numero+" NO es capicua");
        
    }
}
