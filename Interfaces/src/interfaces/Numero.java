
package interfaces;

public class Numero implements Operaciones, Operaciones1 {
    
    private int n1, n2;
    
    public Numero(){
        this.n1=numero1;
        this.n2=numero2;
    }

    @Override
    public int Suma() {
        return n1+n2; 
    }

    @Override
    public int Resta() {
        return n1-n2;
    }

    @Override
    public int Producto() {
        return n1*n2;
    }

    @Override
    public int Division() {
        return n1/n2;
    }

    @Override
    public String toString() {
        return "ClaseEnteros{" + "n1=" + n1 + ", n2=" + n2 + '}';
    }
    
    public void Resultado(){
        System.out.println("Suma "+Suma()+". Resta "+Resta()+". Producto "+Producto()+". Division "+Division()+".");
    }

    @Override
    public double Suma(double numero1, double numero2) {
        return numero1+numero2;
    }

    @Override
    public double Resta(double numero1, double numero2) {
        return numero1-numero2;
    }
    
    
}
