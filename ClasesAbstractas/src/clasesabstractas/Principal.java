
package clasesabstractas;


public class Principal {
    public static void main(String[] args) {

    Triangulo t = new Triangulo(4,8);    
    Rectangulo r = new Rectangulo(5,10);

    FiguraGeometrica fg = new Triangulo(3,4);
    
    System.out.println("El area del trinagulo es: "+t.Area());
    
    System.out.println("El area del rectangulo es: "+r.Area());
    
    
    }
}
