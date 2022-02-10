
package EjerciciosTeoria;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
    
        ArrayList lista = new ArrayList();  /* Si no definimos por <> Podremos meter cualquier objeto de cualquier tipo */
        Piso p;
        Local l;
        
        for (int i=1; i<=3; i++) {
                // p = new Piso(int altura, String direccion, int mc, double preciobase, boolean nuevo);
                // l = new Local(int nventanas, String direccion, int mc, double preciobase, boolean nuevo);
            if(i%2==0){
                p = new Piso(4, "direccionPiso"+i, 80+3*i,Math.random()*8000+120000, true);
                l = new Local(1, "direccionLocal"+i, 45+3*i,Math.random()*8000+120000, false);
            } else{
                p = new Piso(3, "direccionPiso"+i, 80+3*i,Math.random()*8000+120000, false);
                l = new Local(5, "direccionLocal"+i, 45+3*i,Math.random()*8000+120000, true);
            }
            lista.add(p);
            lista.add(l);
        }
        
        
        for (int i=0; i<lista.size(); i++) {
            if(lista.get(i) instanceof Piso)  // Con instanceof preguntamos si es un objeto de la clase Piso
                System.out.println(((Piso)lista.get(i)).toString(10));   // Seleccionamos el toString de Piso y le ponemos 15 años
            else
                System.out.println(((Local)lista.get(i)).toString(15));
        }
        
        
        
    }
}
