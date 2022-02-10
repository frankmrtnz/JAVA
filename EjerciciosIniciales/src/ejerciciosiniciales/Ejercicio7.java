/*
7 Realizar un programa que resuelva una ecuación de segundo grado (del tipo ax2 + bx + c = 0).
 */
package ejerciciosiniciales;
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int a,b,c,raiz;
        double solucion1,solucion2;
        
        System.out.println("Calculo de Ecuacion de 2ºGrado: ax2 + bx + c = 0");
        System.out.println("Introduce valor de A");
        a=teclado.nextInt();
        System.out.println("Introduce valor de B");
        b=teclado.nextInt();
        System.out.println("Introduce valor de C");
        c=teclado.nextInt();
        
        raiz=b*b-4*a*c;  //Para elevar el b, sería Math.pow(b,2)
        
        if(raiz<0){
            System.out.println("NO TIENE SOLUCION REAL");
        }
        else if(raiz==0){
            System.out.println("UNA UNICA SOLUCION REAL"+(-b/(2*a)));
        }
        else{
            solucion1=(-b+Math.sqrt(raiz))/(2*a);
            solucion2=(-b-Math.sqrt(raiz))/(2*a);        
            System.out.println("DOS SOLUCIONES REALES:");
            System.out.println("X1 = "+solucion1+"    //    X2 = "+solucion2);
        }
               

        
    }   
}
