/*
5 Realizar un programa que calcule el tiempo que tardará en caer un objeto desde una altura h. 
Aplica la fórmula (VER EN LA HOJA DE EJERCICIOS LA FORMULA)
 */
package ejerciciosiniciales;
import java.text.DecimalFormat; //Hay que importar el java.text.DecimalFormat para usar el formateador de decimales
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        DecimalFormat formateador=new DecimalFormat("#.##"); //Con esto seleccionamos el nº de decimales que queremos mostrar
        final double g=9.81; // final se usa para introducir constantes (no se puede modificar)
        double t,h;
        
        do{
        System.out.println("Introduce la altura (h) en metros");
        h=teclado.nextDouble();
        }while(h<0);
        
        // Para calcular la raiz cuadrada en Java se usa: Math.sqrt
        t=Math.sqrt(2*h*g);
        System.out.println("El tiempo que tardará en caer desde h="+h+" metros será de: "+formateador.format(t)+" segundos");
        
    }            
}
