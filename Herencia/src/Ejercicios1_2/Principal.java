
package Ejercicios1_2;

public class Principal {
    public static void main(String[] args) {
     Persona ps=new Persona("Persona1","Apellidos1","11111F","casado");
     Estudiante es=new Estudiante("1ºDAW","Estudiante","ApellidosEstudiante","22222H","soltero");
     Empleado em=new Empleado(2010,45,"Empleado","ApellidosEmpleado","33333G","soltero");
     Profesor pf=new Profesor("Informatica",1990,71,"Profesor1","ApellidosProfesor","44444M","casado");
     PersonalServicios pss=new PersonalServicios("Biblioteca",2010,21,"PersonalServicios","ApellidosPersonalServicios","55555L","soltero");
   
     System.out.println("Persona");
     System.out.println(ps.toString());
     
     
     System.out.println("Estudiante");
     System.out.println(es.toString());
     es.MatricularCurso("2ºDAW");
     System.out.println(es.toString());
     
     
     System.out.println("Empleado");     
     System.out.println(em.toString());
     em.MostrarSalario();
     em.CambioDespacho(50);
     System.out.println(em.toString());
    
     
     System.out.println("Profesor");    
     System.out.println(pf.toString());
     pf.CambioDepartamento("Matematicas");
     System.out.println("El sueldo del profesor es "+pf.Sueldo());
     System.out.println(pf.toString());
     
     
     System.out.println("Personal Servicios");
     System.out.println(pss.toString());
     pss.TrasladoSeccion("Salon de Actos");
     pss.CambioEstadocivil("casado");
     System.out.println("El sueldo del personal de servicios es "+pss.Sueldo());
     System.out.println(pss.toString());
 
    }
}
