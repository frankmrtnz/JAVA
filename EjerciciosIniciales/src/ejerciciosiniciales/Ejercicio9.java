/*
9 Escribe un programa que ordene tres números enteros introducidos por teclado.
 */
package ejerciciosiniciales;
import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int a,b,c;
        
           System.out.println("Introduce el primer numero entero ");
           a=teclado.nextInt();
           System.out.println("Introduce el segundo numero entero ");
           b=teclado.nextInt();
           System.out.println("Introduce el tercer numero entero ");
           c=teclado.nextInt();

        if(a>b){
            if(b>c){
                System.out.println("a b c "+a+" "+b+" "+c);
            }else{
                if(a>c){
                    System.out.println("a c b "+a+" "+c+" "+b);
                }else{
                    System.out.println("c a b "+c+" "+a+" "+b);
                } 
            }
        }else{
            if(a>c){
                System.out.println("b a c "+b+" "+a+" "+c);
            }else{
                if(b>c){
                    System.out.println("b c a "+b+" "+c+" "+a);
                }else{
                    System.out.println("c b a "+c+" "+b+" "+a);
                }
            }
        }
       
    }    
}
