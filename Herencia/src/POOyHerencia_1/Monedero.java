
package POOyHerencia_1;

public class Monedero {
    
    private int id;
    private double saldo;

    public Monedero(int id, double saldo) {
        this.id = id;
        this.saldo = saldo;
    }

    public Monedero(int id) {
        this.id = id;
        this.saldo = 100;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Monedero{" + "id=" + id + ", saldo=" + saldo + '}';
    }

    public void Ingresar(double cantidad){
        this.saldo = this.saldo + cantidad;
    }
    
    public boolean Sacar(double cantidad){
        boolean aceptado = false;
        if(cantidad <= this.saldo){
            this.saldo = this.saldo-cantidad;
            aceptado = true;
        }
        else System.out.println("No tiene suficiente saldo");
        return aceptado;
    }
    
    public void Prestar(Monedero m, double cantidad){
        if(Sacar(cantidad))
            m.Ingresar(cantidad);      
    }
    
    public static void Prestar(Monedero m1, Monedero m2, double cantidad){
        if(m1.Sacar(cantidad))
            m2.Ingresar(cantidad);
    }
    
    
    
}
