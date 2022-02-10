
package EjerciciosHoja2.Ejercicio2;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
     
        ArrayList<Parlanchin> lista = new ArrayList<Parlanchin>();
        
        Perro p = new Perro();
        Gato g = new Gato();
        RelojCuco rc = new RelojCuco();
        Parlanchin pp = new Perro();
        Parlanchin pg = new Gato();
        Parlanchin prc = new RelojCuco();
        
        lista.add(p);
        lista.add(g);
        lista.add(rc);
        lista.add(pg);
        lista.add(prc);
        lista.add(pp);
        
        HazleHablar(lista);
        
    }  
    
    
    public static void HazleHablar(ArrayList<Parlanchin> l){
        for (int i=0; i<l.size(); i++) 
            l.get(i).Habla();
    }
    
}


