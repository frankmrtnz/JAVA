
package EjerciciosHoja1.Ejercicio2;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        
        ArrayList<Hablador> lista = new ArrayList<Hablador>();
        
        Loro l = new Loro("Caribe","Verde","Hembra",3);
        Piolin p = new Piolin(100,true,"Macho",6);
        Alumno al = new Alumno("Jorge",22,"Periodismo",4);
        Profesor pf = new Profesor(240,"email@educa.madrid.org","Maria",30);
        Bedel b = new Bedel("Mañana",20,"Manolo",45);
        TV tv = new TV(false,3,"A++",550);
        Radio r = new Radio(true,350,"A",150);
        
        lista.add(l);
        lista.add(p);
        lista.add(al);
        lista.add(pf);
        lista.add(b);
        lista.add(tv);
        lista.add(r);
        
        for (int i=0; i<lista.size(); i++){ 
            lista.get(i).hablar();
            System.out.println("\n----------------------------\n");
        }    
        
    }
}
