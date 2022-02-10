
package EjerciciosIniciacion.CuentaBancaria;

public class Cuenta {
    
    int nCuenta;
    double saldo, interes;

    Cuenta(){}
    
    Cuenta(int nc, double s, double i) {
        this.nCuenta = nc;
        this.saldo = s;
        this.interes = i;
    }
    
    void actualizarSaldo(){     //  Si el enunciado no te dice que va a devolver nada será void, si dice que devolverá habrá que hacer un return
        saldo=saldo+saldo*interes/365;
    }
    
    void Ingresar(double cantidad){
        saldo=saldo+cantidad;
    }
    
    void Retirar(double cantidad){
        if(cantidad<=saldo)
            saldo=saldo-cantidad;
        else
            System.out.println("No dispone de saldo para retirar esa cantidad");
    }

    @Override
    public String toString() {
        return "Cuenta {" +  "nCuenta=" + nCuenta + ", saldo=" + saldo + ", interes=" + interes + '}';
    }
    
    

    
    
    
    

}
