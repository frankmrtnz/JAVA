
package Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        ArrayList<Alumno> lista2 = new ArrayList<Alumno>();
        Alumno a1, a2, a3, a4, a5, a6, a7, a8, a9;
        a1 = new Alumno(1,"francisco","bachillerato1");
        a2 = new Alumno(2,"isabel","bachilerato1");
        a3= new Alumno(3,"jose","bachillerato1");
        
        lista2.add(1, a1);
        lista2.add(2, a2);
        lista2.add(3, a3);
        
        a4 = new Alumno(4,"pepe","bachillerato2");
        a5 = new Alumno(5,"juan","bachilerato2");
        a6= new Alumno(6,"ana","bachillerato3");
        
        lista2.add(5, a1);
        lista2.add(6, a2);
        lista2.add(7, a3);
        
        a7 = new Alumno(7,"alberto","ESO");
        a8 = new Alumno(8,"david","ESO");
        a9= new Alumno(9,"sofia","ESO");
        
        lista2.add(9, a1);
        lista2.add(10, a2);
        lista2.add(11, a3);
        
        //------------------------------------------------------
        
        ArrayList<Cursos> lista = new ArrayList<Cursos>();
        Cursos c1, c2, c3;
        
        c1 = new Cursos(100,"bachilerato1");
        c2 = new Cursos(200,"bachillerato2");
        c3 = new Cursos(300,"ESO");
        
        lista.add(0,c1);
        lista.add(4,c2);
        lista.add(8,c3);
        
        int operacion = Menu(teclado);
        
        while (operacion <= 5){
            System.out.println("Ha elegido la opción "+operacion);
            
            switch(operacion){
                case 1: MostrarAlumno(teclado, lista2);
                    break;
                case 2: MostrarCurso(teclado, lista); 
                    break;
                case 3: MatricularAlumno(teclado, lista2);
                    break;
                case 4: BorrarAlumno(teclado, lista2);
                    break; 
                case 5: AlumnoInscrito(teclado, lista);
                    break;  
            }            
            operacion = Menu(teclado);
        }
        
        
    }  // Cierra el psvm

    public static int Menu(Scanner t){
        int opc;
        System.out.println("\n -------------------------------- \n");
        System.out.println("1. MOSTRAR ALUMNO");
        System.out.println("2. MOSTRAR CURSO");
        System.out.println("3. MATRICULAR ALUMNO");
        System.out.println("4. BORRAR ALUMNO");
        System.out.println("5. VER ALUMNO INSCRITO SI/NO");
        System.out.println("INTRODUCE OPCION:");
        opc = t.nextInt();
        return opc;
    }
    
    public static void MostrarAlumno(Scanner t, ArrayList<Alumno> lista2){
        for (int i=0; i<lista2.size(); i++) {
            System.out.println(lista2.get(i).MostrarInformacion());
        }
    }
    
    public static void MostrarCurso(Scanner teclado, ArrayList<Cursos> lista){
        for (int i=0; i<lista.size(); i++) {
            System.out.println(lista.get(i).MostrarCurso());
        }
    }
    
    public static void MatricularAlumno(Scanner t, ArrayList<Alumno> lista2){
        int num_matricula;     
        String nombre, acceso;
        
        System.out.println("Introducir el num_matricula");
        num_matricula = t.nextInt();
        
        if(num_matricula == -1){
            System.out.println("Introducir el nombre del nuevo alumno");
            nombre = t.nextLine();
            lista2.add(new Alumno(num_matricula, lista2));
        }else
            System.out.println("No se puede añadir, pues el num_matricula ya existe");
    }
    
    public static void BorrarAlumno(Scanner t, ArrayList<Alumno> lista2){
        int num_matricula;     
        String nombre, acceso;
        
        System.out.println("Introducir el num_matricula");
        num_matricula = t.nextInt();
        
        if(num_matricula == -1){
            System.out.println("Introducir el nombre del nuevo alumno");
            nombre = t.nextLine();
            lista2.remove(new Alumno(num_matricula, lista2));
        }else
            System.out.println("No se puede añadir, pues el num_matricula ya existe");
    }
    
    public static void AlumnoInscrito(Scanner t, ArrayList<Cursos> lista){
        int num_matricula;     
        String nombre, acceso;
        
        System.out.println("Introducir el num_matricula");
        num_matricula = t.nextInt();
        
        if(num_matricula != -1){
            System.out.println("No se puede añadir, pues el num_matricula ya existe (está inscrito)");
        }
        else
            System.out.println("Usuario no inscrito");
        
            
    }
    
}      // CIERRA LA CLASE Principal
