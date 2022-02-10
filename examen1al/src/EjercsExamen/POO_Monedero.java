
package EjercsExamen;


public class POO_Monedero {
    
    private int id;
    private double saldo;

    public POO_Monedero(int id, double saldo) {
        this.id = id;
        this.saldo = saldo;
    }
    
    public POO_Monedero(int id){
        id=0;
        saldo=100;
    }

    public int getId() {
        return id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "POO_Monedero{" + "id=" + id + ", saldo=" + saldo + '}';
    }
    
    public void Ingresar(double cantidad){
        this.saldo = saldo+cantidad;
    }
    
    public boolean Sacar(double cantidad){
        boolean aceptar = false;
        if(cantidad<=saldo){
            this.saldo = saldo-cantidad;
            aceptar = true;
        }
        else
            System.out.println("No dispones de saldo suficiente en la cuenta");
        return aceptar;
    }
    
    public void Prestar(POO_Monedero m, double cantidad){
        if(Sacar(cantidad)){
            m.Ingresar(cantidad);
        }
    }
    
    public void Prestar2(POO_Monedero m1, POO_Monedero m2, double cantidad){
        if(m1.Sacar(cantidad)){
            m2.Ingresar(cantidad);
        }
    }
            
    
    
    


    
    
}
