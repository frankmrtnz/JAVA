
package Rectangulo2;

public class Principal {
    public static void main(String[] args) {
     
        Punto p1=new Punto(1,1);
        Punto p2=new Punto(5,1);
        Punto p3=new Punto(1,8);
        Punto p4=new Punto(5,8);
        
        Rectangulo2 r2=new Rectangulo2(p1,p2,p3,p4);
        
        System.out.println(r2.toString());
        System.out.println("---------------------------------");
        System.out.println(r2.Escribir());
        
        
    }
}
