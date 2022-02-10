
package arraylist;

import java.util.Scanner;
import java.util.ArrayList;

public class arraylist {    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        ArrayList<Alumno> lista = new ArrayList<Alumno>();  /* <Alumno> para que defina solo objetos de la clase Alumno  */
        
        ArrayList<Alumno> listaborrado = new ArrayList<Alumno>();
        
        Alumno al=null;
        
        for (int i=1; i<=5; i++){ 
            al=new Alumno((i*100), "alumno"+i, 4.5+i);
            lista.add(al);   /* Guardamos nuestro datos del objeto al */
        }
        
        for (int i=0; i<lista.size(); i++)     /* Definimos las componentes del ArrayList -- Con lista.size() cogemos hasta la cantidad de arrays que esten definidos */ 
            System.out.println(lista.get(i).toString());  /* Me devuelve el objeto de la posición */
            
        System.out.println("------------------------------------");  
        
        al=new Alumno(120, "alumno12"); 
            lista.add(1,al);   /* En la posicion 1 añadimos el nuevo al que hemos creado arriba */
         
        for (int i=0; i<lista.size(); i++)     
            System.out.println(lista.get(i).toString()); 
        
        System.out.println("------------------------------------"); 
        
        al=new Alumno(350, "alumno35", 5.5);
        
        al=lista.set(4, al);     /* Modificaremos en nuevo objeto al definido en la posición 3 */
        
        lista.add(al);   /* Con esto añadimos al final el objeto que se ha modificado */
        
        System.out.println("Se ha modificado el objeto: "+al.toString());
        
        for (int i=0; i<lista.size(); i++)     
            System.out.println(lista.get(i).toString()); 
        
        System.out.println("------------------------------------"); 
        
        listaborrado.add(lista.remove(3));  /* Borra el objeto que se encuentra en la posicion 3 y lo guardamos en un nuevo ArraList */
        
        for (int i=0; i<lista.size(); i++)     
            System.out.println(lista.get(i).toString()); 
        
        System.out.println("Se ha borrado "+listaborrado.get(0).toString());
        
        System.out.println("------------------------------------"); 
        
        al=new Alumno(400, "alumno4", 8.5);
        
        boolean borrado = lista.remove(al);
        
        System.out.println("La operacion ha sido "+borrado);
        
        for (int i=0; i<lista.size(); i++)     
            System.out.println(lista.get(i).toString()); 
        
        System.out.println("------------------------------------");
        
        int i=0;
        
        while(i<lista.size() && lista.get(i).getNmat()!=500)
            i++;
        
        if(i==lista.size())
            System.out.println("Ese Nº de matricula no existe");
        else
            System.out.println("Ese Nº de matricula si existe, por tanto, se va a borrar el alumno con matricula 500");
            borrado=lista.remove(lista.get(i));
            
        System.out.println("La operacion ha sido "+borrado);
        
        for (i=0; i<lista.size(); i++)     
            System.out.println(lista.get(i).toString()); 
        
              
         
    }   
}
