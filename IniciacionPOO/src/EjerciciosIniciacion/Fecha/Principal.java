
package EjerciciosIniciacion.Fecha;

public class Principal {
    public static void main(String[] args) {
    
        Fecha f1=new Fecha();
        Fecha f2=new Fecha(25,01,2021);      /*  2000 si es bisiesto   */
        Fecha f3=new Fecha(1,3,2020);
                       
        
        /*if(f1.bisiesto())
        System.out.println("El año es bisiesto");
        else
        System.out.println("El año es bisiesto");
        
        if(f2.bisiesto())
        System.out.println("El año es bisiesto");
        else
        System.out.println("El año es bisiesto");
        
        
        System.out.println("El mes de mayo tiene "+f1.diasMes(5)+" dias");
        System.out.println("El mes de febrero tiene "+f2.diasMes(2)+" dias");
        
        
        System.out.println(f2.toString());
        f2.valida();
        System.out.println(f2.toString());  
        
        
        f1.corta();
        f2.corta();  
        
        
        System.out.print("Los dias transcurridos desde ");
        f1.corta();
        System.out.print("hasta ");
        f2.corta();
        System.out.print("son "+f2.diasTranscurridos()+" días. \n");   */
        
        
        /*  System.out.println("Hoy es "+f2.diaSemana());   ESTA MAL, FALTA TERMINAR  */
        
        
        /*  System.out.print("Los dias transcurridos entre ");
        f2.corta();
        System.out.print("y ");
        f3.corta();
        System.out.print("son "+f3.diasEntre(f2)+" dias. \n");
        System.out.println("--------------------------------");
        System.out.print("Los dias transcurridos entre ");
        f3.corta();
        System.out.print("y ");
        f2.corta();
        System.out.print("son "+f2.diasEntre(f3)+" dias. \n");  

        
        System.out.println("El dia de la semana es "+f2.diaSemana());
        f2.siguiente();
        System.out.println("Un dia despues es "+f2.diaSemana());   
        
        
        f2.siguiente();
        f2.larga();  
        
        
        f2.anterior();
        f3.anterior();   
        
        
        f2.igualQue(f3);
        f2.mayorQue(f3);
        f2.menorQue(f3);
        System.out.println("-------------------------");
        f3.igualQue(f2);
        f3.mayorQue(f2);
        f3.menorQue(f2);
        System.out.println("-------------------------");
        f2.igualQue(f2);
        f2.mayorQue(f2);    */
        f2.menorQue(f3);
        f3.menorQue(f2);        
    }
}
