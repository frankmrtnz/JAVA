
package EjercsExamen;


public class POO_CuentaBancaria {
    
    int num_cuenta;
    double saldo_actual, interes_anual;
    
    POO_CuentaBancaria(){
        
    }
    
    POO_CuentaBancaria(int nc, double sa, double ia){
        this.num_cuenta=nc;
        this.saldo_actual=sa;
        this.interes_anual=ia;
    }
    
    void Ingresar(double cantidad){
        saldo_actual=saldo_actual+cantidad;
    }
    
    void Retirar(double cantidad){
        if(saldo_actual>=cantidad){
            saldo_actual=saldo_actual-cantidad;
        }
        else
            System.out.println("No tienes esa cantidad para retirar");
    }
    
    void actualizarSaldo(){
        saldo_actual=saldo_actual+saldo_actual*interes_anual/365;
    }

    @Override
    public String toString() {
        return "POO_CuentaBancaria{" + "num_cuenta=" + num_cuenta + ", saldo_actual=" + saldo_actual + ", interes_anual=" + interes_anual + '}';
    }
    
    
}
