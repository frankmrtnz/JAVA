
package EjerciciosTeoria.Cancion;


public class Principal {
    public static void main(String[] args) {
        
        Cancion c1,c2,c3,c4;
        c1=new Cancion();
        c2=new Cancion();
        c3=new Cancion("Titulo3","Autor3");
        c4=new Cancion("Titulo4","Autor4");
        
        System.out.println("OBJETO 1");
        c1.Escribir();
        System.out.println("OBJETO 2");
        c2.Escribir();
        System.out.println("OBJETO 3");
        c3.Escribir();
        System.out.println("OBJETO 4");
        c4.Escribir();
        
        c1.ponTitulo("Titulo1");
        c1.ponAutor("Autor1");
        c2.ponTitulo("Titulo2");
        c2.ponAutor("Autor2");
        c3.ponAutor("Varios Autores");    // Se puede editar aunque lo definamos arriba
        
        System.out.println("OBJETO 1: Autor: "+c1.dameAutor()+" Titulo: "+c1.dameTitulo());
        System.out.println("OBJETO 2: Autor: "+c2.dameAutor()+" Titulo: "+c2.dameTitulo());
        System.out.println("OBJETO 3: Autor: "+c3.dameAutor()+" Titulo: "+c3.dameTitulo());
        System.out.println("OBJETO 4: Autor: "+c4.dameAutor()+" Titulo: "+c4.dameTitulo());
        
    }
    
}
