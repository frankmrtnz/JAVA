
package Ejercicios1_2;

public class Empleado extends Persona{
    
    private int anioIngreso,despacho; 
    private double salariobase;
   
    public Empleado(int anioIngreso, int despacho, String nombre, String apellidos, String NIF, String estadocivil) {
        super(nombre, apellidos, NIF, estadocivil);
        this.anioIngreso = anioIngreso;
        this.despacho = despacho;
        this.salariobase=1000;
    }

    public void CambioDespacho(int despacho) {
        this.despacho = despacho;
    }

    @Override
    public String toString() {
        return super.toString()+" Empleado{" + "anioIngreso=" + anioIngreso + ", despacho=" + despacho + '}';
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public double getSalariobase() {
        return salariobase;
    }

    public void setSalariobase(double salariobase) {
        this.salariobase = salariobase;
    }
   
   public void MostrarSalario(){
    System.out.println(getNombre()+" "+getApellidos()+" "+salariobase);
   }
}
