
package Ejercicios1_2;

public class Profesor extends Empleado{
    
    private String departamento; 

    public Profesor(String departamento, int anioIngreso, int despacho, String nombre, String apellidos, String NIF, String estadocivil) {
        super(anioIngreso, despacho, nombre, apellidos, NIF, estadocivil);
        this.departamento = departamento;
    }

    public void CambioDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString()+" Profesor{" + "departamento=" + departamento + '}';
    }
   
   public double Sueldo(){
       double salario=getSalariobase();
       if(getAnioIngreso()<2000)
         salario=salario*1.08;
       setSalariobase(salario);
       return salario;
   }
   
   
}