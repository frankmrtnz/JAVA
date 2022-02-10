/* Usando -> ArrayList */
package Rectangulo;

import java.util.Scanner;
import java.util.ArrayList;

public class Principal1 {
    public static void main(String[] args) {

    Scanner teclado=new Scanner(System.in);    
    
    int a,b;
    
    Rectangulo1 r;
    ArrayList<Rectangulo1> lista = new ArrayList<Rectangulo1>();
    
    for (int i=1; i<=3; i++) {
        System.out.println("Introducir base");
        b=teclado.nextInt();
        System.out.println("Introducir altura");
        a=teclado.nextInt();
        r=new Rectangulo1(b,a);
        lista.add(r);
    }
    
    r=new Rectangulo1(20,6);
    lista.add(1,r);  /*  Lo metemos en la posicion (1) de memoria   */
    
    for (int i=0; i<lista.size(); i++) {
        System.out.println(lista.get(i).getBase()+" "+lista.get(i).getAltura());
        System.out.println(lista.get(i).toString());
    }
    
    r.setBase(15);
    
    lista.set(1,r);   /* Modificamos el valor */
    
    lista.remove(2);   /*  Borramos la posicion 2  */
    
    lista.indexOf(r);
    
    System.out.println(lista.get(1).toString());
    

    /*  System.out.println("BASE:" +r1.getBase()+" ALTURA: "+r1.getAltura());
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
    System.out.println("---------------------------------------------");   */
    
    
    
    
    
    
    
    
    }   
}

