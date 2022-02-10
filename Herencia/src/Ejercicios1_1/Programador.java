
package Ejercicios1_1;

public class Programador extends Empleado {  // Clase Hija
    
    private int lineasDeCodigoPorHora;
    private String lenguajeDominante;
    
    /* ATRIBUTOS */
    
    // Con parametros:
    public Programador(int lineasDeCodigoPorHora, String lenguajeDominante, String nombre, String NIF, int edad, boolean casado, double salario) {
        super (nombre, NIF, edad, casado, salario);
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
        this.lenguajeDominante = lenguajeDominante;
    }
    
    // Sin parametros:
    public Programador(){
        super();
    }
    
    @Override
    public String toString() {
        return super.toString()+" Programador{" + "lineasDeCodigoPorHora=" + lineasDeCodigoPorHora + ", lenguajeDominante=" + lenguajeDominante + '}';
    }
    
    
    
    
    
}
