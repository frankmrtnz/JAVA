
package Solucion.Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
  public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
     Alumno al;
     ArrayList<Alumno> lista=new ArrayList<Alumno>();
     ArrayList<Curso> listac=new ArrayList<Curso>();
    
     lista.add(new Alumno(10,"Alumno 1","Bachillerato"));
     lista.add(new Alumno(20,"Alumno 2","Universidad")); 
     lista.add(new Alumno(30,"Alumno 3","Grado Medio")); 
     listac.add(new Curso(100,"DAW",lista));
     listac.add(new Curso(200,"ASIR"));
     lista.clear();
     lista.add(new Alumno(40,"Alumno 4","Prueba Acceso"));
     lista.add(new Alumno(50,"Alumno 5","Grado Medio"));
     lista.add(new Alumno(60,"Alumno 6","Grado Medio"));
     listac.add(new Curso(300,"DAM",lista));
     
     for(int i=0;i<listac.size();i++){
      System.out.println("Curso "+listac.get(i).getNombre());
      for(int j=0;j<listac.get(i).getLista().size();j++)
        System.out.println(listac.get(i).getLista().get(j).MostrarInformacion());
      System.out.println("----------------------------");
     }
     
     int opc=Menu(teclado);
     String curso;
     while(opc!=6){
       switch(opc){
           case 1:System.out.println("Introducir el curso");
                  curso=teclado.next();
                  int posicion=existeCurso(listac,curso);
                  if(posicion!=-1){
                    System.out.println("VOY A DAR DE ALTA UN ALUMNO");
                    al=new Alumno(150,"Alumno 15","Universidad");
                    listac.get(posicion).Matricular(al);
                  }else
                    System.out.println("NO EXISTE EL CURSO");
                  break;
           case 2:System.out.println("Introducir el curso del alumno a dar de baja");
                  curso=teclado.next();
                  posicion=existeCurso(listac,curso);
                  if(posicion!=-1){
                      al=new Alumno(30,"Alumno 3","Grado Medio");  
                      listac.get(posicion).Borrar(al);
                  }else
                    System.out.println("NO EXISTE EL CURSO");
                  break;
           case 3:System.out.println("Introducir el curso del alumno a comprobar");
                  curso=teclado.next();
                  posicion=existeCurso(listac,curso);
                  if(posicion!=-1){
                      al=new Alumno(60,"Alumno 6","Grado Medio");  
                      if(listac.get(posicion).Inscrito(al))
                        System.out.println("El alumno esta inscrito en "+curso);  
                      else
                         System.out.println("El alumno no esta inscrito en "+curso);  
                  }else
                    System.out.println("NO EXISTE EL CURSO");
                  break;
           case 4:teclado.nextLine();
                  String acceso;
                  System.out.println("Introducir forma de acceso");
                  acceso=teclado.nextLine();
                  for(int i=0;i<listac.size();i++){
                    System.out.println(listac.get(i).getNombre());  
                    listac.get(i).Mostrar(acceso);
                  }
                  break;
               
           case 5:System.out.println("Introducir el curso");
                  curso=teclado.next();
                  posicion=existeCurso(listac,curso);
                  if(posicion!=-1){
                    for(int i=0;i<listac.get(posicion).getLista().size();i++)
                     System.out.println(listac.get(posicion).getLista().get(i).MostrarInformacion());   
                  }else
                    System.out.println("NO EXISTE EL CURSO");
                  break;
           default:System.out.println("Opcion Incorrecta");
                   break;
       }   
       opc=Menu(teclado);   
    }
     
   }
  
  static int Menu(Scanner t){
      int opc;
      System.out.println("1.Matricular alumno");
      System.out.println("2.Borrar alumno");
      System.out.println("3.Comprobar si esta inscrito");
      System.out.println("4.Mostar alumnos por forma de acceso");
      System.out.println("5.Mostar alumnos matriculados en un curso");
      System.out.println("6.Salir");
      System.out.println("Escoge una opcion: ");
      opc=t.nextInt();
      return opc;
  }
  static int existeCurso(ArrayList<Curso> lista,String c){
     int existe=-1;
     int i=0;
     while(i<lista.size()&& !lista.get(i).getNombre().equals(c))
       i++;
     if(i<lista.size())
        existe=i;
     return existe;
  }
}
