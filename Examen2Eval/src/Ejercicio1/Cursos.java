
package Ejercicio1;

import java.util.ArrayList;

public class Cursos {

    private int codigo;
    private final String nombre;
    ArrayList<Cursos> lista = new ArrayList<Cursos>();

    public Cursos(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
    public Cursos(int codigo, String name, ArrayList<Cursos> alumnos){
        this.codigo = codigo;
        this.nombre = name;
        for (int i=0; i<10; i++) {
            System.out.println(lista.get(i));
        }
    }
    
    public void Matricular(String alumno){
        if(this.codigo!=codigo)
            lista.add(codigo, this);
        else
            System.out.println("No se puede matricular el alumno, ya que está ocupado ese puesto");
    }
    
    public void Borrar(String alumno){
        if(this.codigo!=codigo)
            lista.remove(codigo);
        else
            System.out.println("No se puede borrar el alumno, ya que no existe");     
    }
    
    public boolean Inscrito(){
        boolean respuesta = false;
        if(codigo==codigo){
            System.out.println("Alumno está inscrito");
            respuesta = true;
        }
        else
            System.out.println("Alumno no está inscrito");
        return respuesta;
    }

    public String MostrarCurso() {
        return "Cursos{" + "codigo=" + codigo + ", nombre=" + nombre + ", lista=" + lista + '}';
    }
    
    public void Mostrar(int acceso){
        if(this.codigo==acceso)
            MostrarCurso();
    }
    
            
    
    
}
