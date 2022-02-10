
package EjercsExamen;

import java.util.ArrayList;

public class POO_PrincipalCuentaBancaria {
    public static void main(String[] args) {
    
        ArrayList<POO_CuentaBancaria> lista = new ArrayList<POO_CuentaBancaria>();
        
        POO_CuentaBancaria c1=new POO_CuentaBancaria();
        POO_CuentaBancaria c2=new POO_CuentaBancaria(12345,500,0.03);
        
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        
        c1.num_cuenta=3000;
        c1.Retirar(100);
        c1.Ingresar(300);
        System.out.println(c1.toString());
        
        c2.actualizarSaldo();
        System.out.println(c2.toString());
        c2.Retirar(100);
        System.out.println(c2.toString());
        
        
        
        

    }
}
