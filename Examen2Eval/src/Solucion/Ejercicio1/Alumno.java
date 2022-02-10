
package Solucion.Ejercicio1;

public class Alumno {
   private int mat;
   private String nombre;
   private String acceso;

    public Alumno(int mat, String nombre, String acceso) {
        this.mat = mat;
        this.nombre = nombre;
        this.acceso = acceso;
    }

    public int getMat() {
        return mat;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAcceso() {
        return acceso;
    }

   public String MostrarInformacion() {
        return "Alumno{" + "mat=" + mat + ", nombre=" + nombre + ", acceso=" + acceso + '}';
    }
   
   
}
