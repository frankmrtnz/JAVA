
package EjericiosTeoria.Empleado;


public class Empleado {
    
    String NIF;
    double sueldoBase, pagoHoraExtra;
    int tipo, hijos, horasExtras;
    boolean casado;
    
    Empleado(String NIF, double sueldoBase, double pagoHoraExtra, int horasExtras, int tipo, int hijos, boolean casado){
        this.NIF=NIF;
        this.sueldoBase=sueldoBase;
        this.pagoHoraExtra=pagoHoraExtra;
        this.horasExtras=horasExtras;
        this.tipo=tipo;
        this.hijos=hijos;
        this.casado=casado;
    }
    
    double ComplementoHorasExtras(){
        return horasExtras*pagoHoraExtra;
    }
    
    double CalculoSueldoBruto(){
        /*return sueldoBase+horasExtras*pagoHoraExtra;*/
        return sueldoBase+ComplementoHorasExtras();
    }
    
    double Retencion(){
        int t=tipo;    // Para que no se modifique el valor "tipo"
        if(casado)
            t=t-2;
        t=t-hijos;
        /*System.out.println("El tipo que le queda es "+tipo);*/
        return CalculoSueldoBruto()*t/100;
    }
    
    String println(){
        return NIF+" Casado "+casado+" Nº hijos "+hijos;
    }
    
    String printAll(){
        return println()+" Complemento por las horas extras "+ComplementoHorasExtras()+" Sueldo Bruto "+CalculoSueldoBruto()+" Retencion "+Retencion()
                +" Sueldo neto "+(CalculoSueldoBruto()-Retencion());    
    }
    
}
