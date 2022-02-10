
package EjerciciosTeoria.Cancion;

public class Cancion {
    
    String titulo;
    String autor;
    
    Cancion(){
        this.titulo="";
        this.autor="";
    }
    
    Cancion(String titulo, String autor){
        this.titulo=titulo;
        this.autor=autor;
    }
    
    String dameTitulo(){
        return this.titulo;
    }
    
    String dameAutor(){
        return this.autor;
    }
    
    void ponTitulo(String titulo){
        this.titulo=titulo;
    }
    
    void ponAutor(String autor){
        this.autor=autor;
    }
    
    void Escribir(){
        System.out.println("Autor: "+this.autor+" Titulo: "+this.titulo);
        System.out.println("Autor: "+dameAutor()+" Titulo: "+dameTitulo());
    }
    
}
