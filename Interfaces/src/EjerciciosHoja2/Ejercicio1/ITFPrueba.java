
package EjerciciosHoja2.Ejercicio1;

import java.util.ArrayList;

public class ITFPrueba {
    public static void main(String[] args) {
    
        ArrayList<ITFImpresion> lista = new ArrayList<ITFImpresion>();
        
        ITFImpresion itfp = new ITFPositivo(); 
        ITFImpresion itfn = new ITFNegativo();

        lista.add(itfp);
        lista.add(itfn);
        
        for (int i=0; i<lista.size(); i++) 
            if(lista.get(i) instanceof ITFPositivo)  // Instanceof = "es un objeto de"
                lista.get(i).Imprimir();
            else
                lista.get(i).Imprimir();
           
        
        
    }
}
