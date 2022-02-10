
package arraylist;

public class Alumno {
    
    private int nmat;
    private String nombre;
    private double nota;

    public Alumno(int nmat, String nombre, double nota) {
        this.nmat = nmat;
        this.nombre = nombre;
        this.nota = nota;
    }

    public Alumno(int nmat, String nombre) {
        this.nmat = nmat;
        this.nombre = nombre;
    }

    public int getNmat() {     /* Podre devolver/obtener todos los datos, los cuales se mostraran con sout */
        return nmat;
    }
    public String getNombre() {
        return nombre;
    }
    public double getNota() {
        return nota;
    }

    public void setNombre(String nombre) {   /* Solo podre modificar nombre y nota */
        this.nombre = nombre;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nmat=" + nmat + ", nombre=" + nombre + ", nota=" + nota + '}';
    }
    
      
    
}
