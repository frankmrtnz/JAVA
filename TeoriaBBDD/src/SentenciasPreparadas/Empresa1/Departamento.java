
package SentenciasPreparadas.Empresa1;

public class Departamento {
   private int ndept;
   private String nombre;
   private String loc;

    public Departamento(int ndept, String nombre, String loc) {
        this.ndept = ndept;
        this.nombre = nombre;
        this.loc = loc;
    }

    public int getNdept() {
        return ndept;
    }

    public void setNdept(int ndept) {
        this.ndept = ndept;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override
    public String toString() {
        return "Departamento{" + "ndept=" + ndept + ", nombre=" + nombre + ", loc=" + loc + '}';
    }
    
}
