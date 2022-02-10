
package Ejercicios1_1;

public class Empleado {   // Clase Padre
    
    private String nombre, NIF;
    private int edad;
    private boolean casado;
    private double salario;
    private double aumento;

    /* ATRIBUTOS: */
    
    // Con parametros:
    public Empleado(String nombre, String NIF, int edad, boolean casado, double salario) {
        this.nombre = nombre;
        this.NIF = NIF;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
    }
    
    // Sin parametros:
    public Empleado() {}    

    public String getNombre() {
        return nombre;
    }

    public String getNIF() {
        return NIF;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isCasado() {
        return casado;
    }

    public double getSalario() {
        return salario;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
      
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", NIF=" + NIF + ", edad=" + edad + ", casado=" + casado + ", salario=" + salario + '}';
    }
    
    public String Escribir() {
    return " Empleado{" + "nombre=" + nombre + ", NIF=" + NIF + ", edad=" + edad + ", casado=" + casado + ", salario=" + salario + '}';
    } 
    
    // Metodos: 
    public int Clasificacion() {
        int e;
        e=edad;
        if(e<22)
            System.out.println("El empleado es Principiante");
        else if (e<36)
            System.out.println("El empleado es Intermedio");
        else
            System.out.println("El empleado es Senior");
        return e;
    }
    
   public void subirSalario(int porcentaje) {
       salario=salario+salario*porcentaje/100;
   }

    
    
    
    
    
}
