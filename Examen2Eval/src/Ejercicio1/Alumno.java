package Ejercicio1;

import java.util.ArrayList;

public class Alumno {

    private final int num_matricula;
    private final String nombre, acceso;
    
    public Alumno(int num_matricula, String nombre, String acceso) {
        this.num_matricula = num_matricula;
        this.nombre = nombre;
        this.acceso = acceso;
    }

    Alumno(int num_matricula, ArrayList<Alumno> lista2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getNum_matricula() {
        return num_matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAcceso() {
        return acceso;
    }

    public String MostrarInformacion() {
        return "Alumno{" + "num_matricula=" + num_matricula + ", nombre=" + nombre + ", acceso=" + acceso + '}';
    }

    
    
    
    
    
    
    
    
}
