
package Rectangulo;

import java.util.Scanner;
/*   import java.util.ArrayList;   */

public class Principal {
    public static void main(String[] args) {

    Scanner teclado=new Scanner(System.in);    
    
    Rectangulo r1 = new Rectangulo(3,5);      //  (base,altura)   
    Rectangulo r2 = new Rectangulo(7,10);
    Rectangulo r3 = new Rectangulo(5,8);
    Rectangulo r4 = r1;      //  Misma direccion de memoria (la comparten)
    
    /*  Rectangulo[] R = new Rectangulo[5];
    R[0] = r1;
    R[1] = new Rectangulo(3,5);
    System.out.println(R[0].getAltura());  
    
    ArrayList<Rectangulo> lista = new ArrayList<Rectangulo>();
    lista.add(r1);
    lista.add(r2);
    lista.add(r3);   */
    
    
    
    System.out.println("BASE:" +r1.getBase()+" ALTURA: "+r1.getAltura());
    System.out.println("El area del rectangulo 1 es "+r1.CalcularArea());
    System.out.println("El perimetro del rectangulo 1 es "+r1.CalcularPerimetro());
    r1.Dibujar();
    System.out.println("---------------------------------------------");
    
    System.out.println("BASE:" +r2.getBase()+" ALTURA: "+r2.getAltura());
    int area=r2.CalcularArea();
    System.out.println("El area del rectangulo 2 es "+area);
    System.out.println("El perimetro del rectangulo 2 es "+r2.CalcularPerimetro());
    r2.Dibujar();
    System.out.println("---------------------------------------------");
    
    System.out.println("BASE:" +r3.getBase()+" ALTURA: "+r3.getAltura());
    area=r3.CalcularArea();
    System.out.println("El area del rectangulo 3 es "+area);
    System.out.println("El perimetro del rectangulo 3 es "+r3.CalcularPerimetro());
    r3.Dibujar();
    System.out.println("---------------------------------------------");
    
    System.out.println(r1.toString());
    System.out.println("---------------------------------------------");
    
    System.out.println(r2.toString());
    System.out.println("---------------------------------------------");
    
    System.out.println(r3.toString());
    System.out.println("---------------------------------------------");
    
    
    
    
    
    
    
    
    }   
}
