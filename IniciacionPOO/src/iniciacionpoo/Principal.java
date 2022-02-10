
package iniciacionpoo;

public class Principal {
    public static void main(String[] args) {
    // Scanner teclado=new Scanner(System.in);     

    Alumno al1=new Alumno(10);
    Alumno al2=new Alumno(20,"Alumno2");    /*Matricula , y nota 7.5*/
    Alumno al3=new Alumno(30,"Alumno3");
    
    System.out.println(al1.getNmat()+" "+al1.getNombre()+" "+al1.getCurso());
    System.out.println(al2.getNmat()+" "+al2.getNombre()+" "+al2.getCurso());
    
    al1.Matricularse("Java");
    al2.Matricularse("Base de Datos");
    
    al1.setNombre("Alumno1");    /* Le asignamos el valor, ya que lo tenía null*/
    
    System.out.println(al1.getNmat()+" "+al1.getNombre()+" "+al1.getCurso());
    System.out.println(al2.getNmat()+" "+al2.getNombre()+" "+al2.getCurso());
    
    /*System.out.println("------------------------------");
    System.out.println(al1.toString()); 
    System.out.println(al2.toString());*/       
    
    System.out.println("------------------------------");    
    al1.PonerNota(5, 7, 9);
    al2.PonerNota(8, 4, 7);
    
    double media=al1.CalcularMedia();
        System.out.println("La media de "+al1.getNombre()+" es "+media);
    
    double media2=al2.CalcularMedia();
    System.out.println("La media de "+al2.getNombre()+" es "+media2);
    
    System.out.println(al1.toString()); 
    System.out.println(al2.toString());     
    
    }
}
