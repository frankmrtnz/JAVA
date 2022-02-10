
package teoriaficheros.Serializables;

import java.io.Serializable;

public class Alumno implements Serializable {
    
    private int matricula;
    private String nombre;
    private double nota;

    public Alumno(int matricula, String nombre, double nota) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.nota = nota;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumno{" + "matricula=" + matricula + ", nombre=" + nombre + ", nota=" + nota + '}';
    }

    
    
}
