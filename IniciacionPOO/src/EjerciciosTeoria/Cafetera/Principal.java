
package EjerciciosTeoria.Cafetera;

public class Principal {
    public static void main(String[] args) {

    Cafetera c1=new Cafetera();
        System.out.println("Cafetera 1: "+c1.capacidadMaxima+" "+c1.cantidadActual);
        
    
    Cafetera c2=new Cafetera(1500);
        System.out.println("Cafetera 2: "+c2.capacidadMaxima+" "+c2.cantidadActual);
    
    Cafetera c3=new Cafetera(500);
        System.out.println("Cafetera 3: "+c3.capacidadMaxima+" "+c3.cantidadActual);
        
    c1.llenarCafetera();
        System.out.println("Cafetera 1: "+c1.capacidadMaxima+" "+c1.cantidadActual);
        
    c2.servirTaza(250);
        System.out.println("Cafetera 2: "+c2.capacidadMaxima+" "+c2.cantidadActual);
   
    c3.servirTaza(1000);
        System.out.println("Cafetera 3: "+c3.capacidadMaxima+" "+c3.cantidadActual);
    
    System.out.println("--------------------------------------------------");
    System.out.println("Cafetera 2");
        c2.vaciarCafetera();
        c2.mostrarContenido();
        
    System.out.println("--------------------------------------------------");    
    System.out.println("Cafetera 3");
        c3.agregarCafe(400);     
        c3.mostrarContenido();
    
    System.out.println("--------------------------------------------------");   
    System.out.println("Cafetera 1");
        c1.mostrarContenido();
    
    
    
    }
}
