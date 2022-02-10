
package EjerciciosIniciacion.CuentaBancaria;

public class Principal {
    public static void main(String[] args) {
        
        Cuenta c1=new Cuenta();
        Cuenta c2=new Cuenta(11111,500,0.03);
        
        System.out.println(c1.toString());     // Muestra todos los valores
        System.out.println(c2.toString());
        
        c1.nCuenta=3333;
        c1.Retirar(100);
        c1.Ingresar(300);
        System.out.println(c1.toString());
        
        c2.actualizarSaldo();
        System.out.println(c2.toString());
        c2.Retirar(100);
        System.out.println(c2.toString());
     
    }
}
