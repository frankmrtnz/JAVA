
package herencia;

public class Principal {
    public static void main(String[] args) {
     
        Padre p = new Padre(10,"padre 1");
        Hija h = new Hija(20,"padre 2",6.75);
        
        System.out.println(p.toString());
        // System.out.println(h.toString());
        
        System.out.println("----------------------");
        
        System.out.println(h.toString());
        h.Escribir();
        
        System.out.println("....................................");
        
        Hija1 h1 = new Hija1(true,50,"abuelo1",2.1);
        
        h1.Imprimir();
        h1.Escribir();
        System.out.println(h1.toString());
        
        
    }
}
