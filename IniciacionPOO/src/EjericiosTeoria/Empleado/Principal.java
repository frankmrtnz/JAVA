
package EjericiosTeoria.Empleado;


public class Principal {
    public static void main(String[] args) {
        
        Empleado e1=new Empleado("11111111F",1000,30,10,15,2,false);
        Empleado e2=new Empleado("22222222G",800,15,5,10,0,true);
        Empleado e3=new Empleado("33333333H",2000,20,5,18,1,true);
        Empleado e4=new Empleado("44444444J",4000,0,0,22,0,false);
        
        System.out.println(e1.printAll());
        System.out.println(e2.printAll());
        System.out.println(e3.printAll());
        System.out.println(e4.printAll());
        
        System.out.println("Complemento Hora Extra "+e1.ComplementoHorasExtras());
        System.out.println("Sueldo Bruto "+e1.CalculoSueldoBruto());
        System.out.println("Retención "+e1.Retencion());
        System.out.println("Sueldo neto "+(e1.CalculoSueldoBruto()-e1.Retencion()));
        
        
    }
}
