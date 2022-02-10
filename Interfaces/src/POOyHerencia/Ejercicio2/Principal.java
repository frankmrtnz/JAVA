
package POOyHerencia.Ejercicio2;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        
        Articulo t4 = new Tipo4("articulo4",100);
        Articulo t7 = new Tipo7("articulo7",300);
        Articulo t16 = new Tipo16("articulo16",500);
        
        ArrayList<Articulo> lista = new ArrayList<Articulo>();
        
        
        lista.add(t4);
        lista.add(t7);
        lista.add(t16);
            
        for (int i=0; i<lista.size(); i++) {
            System.out.println(lista.get(i).getNombre()
                    +" "+lista.get(i).getPrecio());
            if(lista.get(i) instanceof Tipo4)
                System.out.println("Parte IVA: "+
                        ((Tipo4)lista.get(i)).getParteIVA());
            else if(lista.get(i) instanceof Tipo7)
                System.out.println("Parte IVA: "+
                        ((Tipo7)lista.get(i)).getParteIVA());
            else if(lista.get(i) instanceof Tipo16)
                System.out.println("Parte IVA: "+
                        ((Tipo16)lista.get(i)).getParteIVA());
        }
        
    }
}
