
package Ejercicios1_2;

public class Persona {
    
    private String nombre,apellidos,NIF,estadocivil; 

    public Persona(String nombre, String apellidos, String NIF, String estadocivil) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.NIF = NIF;
        this.estadocivil = estadocivil;
    }

    public void CambioEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", NIF=" + NIF + ", estadocivil=" + estadocivil + '}';
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
  
  
  
}
