
package EjercicioRepaso_1.Ejercicio1;

import java.io.Serializable;

public class Ej1_Paises implements Serializable {
    
    private int id;
    private String nombre, capital, idioma;

    public Ej1_Paises(int id, String nombre, String capital, String idioma) {
        this.id = id;
        this.nombre = nombre;
        this.capital = capital;
        this.idioma = idioma;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCapital() {
        return capital;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    @Override
    public String toString() {
        return "Ej1_Paises{" + "id=" + id + ", nombre=" + nombre + ", capital=" + capital + ", idioma=" + idioma + '}';
    }
    
    
    
}
