package Solucion.Ejercicio1;

import java.util.ArrayList;

public class Curso {
  private int codigo;
  private String nombre;
  private int plazas;
  private ArrayList<Alumno> lista=new ArrayList<Alumno>();

    public Curso(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.plazas = 10;
    }
  
    public Curso(int codigo, String nombre,ArrayList<Alumno> lista) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.plazas = 10;
        for(int i=0;i<lista.size();i++)
          this.lista.add(lista.get(i));
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPlazas() {
        return plazas;
    }

    public ArrayList<Alumno> getLista() {
        return lista;
    }
    
    public void Matricular(Alumno al){
      if(plazas>lista.size() && !Inscrito(al)){ 
        lista.add(al);
        System.out.println("Alumno matriculado");
        plazas--;
      }else 
        System.out.println("No se puede matricular porque no hay plazas"
                + " o porque ya se ha matriculado");
    }
  
    public void Borrar(Alumno al){
       int i=0;
       while(i<lista.size()&& lista.get(i).getMat()!=al.getMat())
          i++;
       if(i<lista.size()){
         lista.remove(i);
         System.out.println("Alumno borrado");
       }else
         System.out.println("No se puede borrar pues no existe ese alumno");
       /*if(lista.remove(al))
       System.out.println("Se ha borrado al alumno "+al.getNombre());
       else
       System.out.println("No se ha podido borrar al alumno "+al.getNombre());*/
    }
    
    public boolean Inscrito(Alumno al){
        boolean inscrito=true;
        int i=0;
        while(i<lista.size() && lista.get(i).getMat()!=al.getMat())
          i++;  
        if(i==lista.size())
          inscrito=false;
        return inscrito;
    }
    
    public void Mostrar(String acceso){
        boolean noexiste=true;
      for (int i = 0; i < lista.size(); i++) {
        if(lista.get(i).getAcceso().equals(acceso)){
         System.out.println(lista.get(i).MostrarInformacion());  
         noexiste=false;
        }
      }
      if(noexiste)
       System.out.println("No hay alumnos con ese acceso");
    }
    
    public void MostrarCurso(){
      for (int i = 0; i < lista.size(); i++) 
       System.out.println(lista.get(i).MostrarInformacion());  
    }
}
