
package EjercsExamen;


public class POO_Empleado {

    String NIF;
    int horasExtras_mes,num_hijos, IRPF;
    double sueldo, pago_Extras;
    boolean casado;
    
    POO_Empleado(){
        
    }

    POO_Empleado(String NIF, int horasExtras_mes, int num_hijos, double sueldo, double pago_Extras, int IRPF, boolean casado) {
        this.NIF = NIF;
        this.horasExtras_mes = horasExtras_mes;
        this.num_hijos = num_hijos;
        this.sueldo = sueldo;
        this.pago_Extras = pago_Extras;
        this.IRPF = IRPF;
        this.casado = casado;
    }
    
    double Complemento_HorasExtras(){
        return horasExtras_mes*pago_Extras;
    }
    
    double SueldoBruto(){
        return sueldo+Complemento_HorasExtras();
    }
    
    double Retenciones(){
        int tipo=IRPF;
        if(casado){
            tipo=tipo-2;
        }
        tipo=tipo-num_hijos;
        
        return SueldoBruto()*tipo/100;
    }

    String println() {
        return "POO_Empleado{" + "num_hijos=" + num_hijos + ", casado=" + casado + '}';
    }

    String printAll() {
        return "POO_Empleado{" + "NIF=" + NIF + ", horasExtras_mes=" + horasExtras_mes + ", num_hijos=" 
        + num_hijos + ", IRPF=" + IRPF + ", sueldo=" + sueldo + ", pago_Extras=" + pago_Extras + 
        ", casado=" + casado + '}' + (SueldoBruto()-Retenciones()) + '}';
    }

    
    
    
    
           
    
    
}
