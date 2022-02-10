
package Ejercicios1_1;


public class Principal {
    public static void main(String[] args) {
    
    Empleado e = new Empleado("empleado1", "1111111D",43,true,1245.76);
    Programador p = new Programador(2000,"Java","programador1","22222222F",27,false,1800);
    
    System.out.println("Empleado "+e.toString());
    System.out.println("Programador "+p.toString());
    System.out.println("----------------------------");
        
    e.Clasificacion();
    e.subirSalario(10);
    System.out.println("Empleado "+e.Escribir());
    System.out.println("----------------------------");
        
    p.Clasificacion();
    p.subirSalario(15);
    // System.out.println("Programador "+p.Escribir()); 
    System.out.println("Programador "+p.toString());
    
    }
}
