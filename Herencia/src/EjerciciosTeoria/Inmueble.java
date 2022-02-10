
package EjerciciosTeoria;

public class Inmueble {      /* Clase Padre */
    
    private String direccion;
    private int mc;
    private double preciobase;
    private boolean nuevo;

    public Inmueble(String direccion, int mc, double preciobase, boolean nuevo) {
        this.direccion = direccion;
        this.mc = mc;
        this.preciobase = preciobase;
        this.nuevo = nuevo;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getMc() {
        return mc;
    }

    public double getPreciobase() {
        return preciobase;
    }

    public boolean getNuevo() {
        return nuevo;
    }

    public void setPreciobase(double preciobase) {
        this.preciobase = preciobase;
    }

    public void setNuevo(boolean nuevo) {
        this.nuevo = nuevo;
    }

    @Override
    public String toString() {
        return "Inmueble{" + "direccion=" + getDireccion() + ", mc=" + mc + ", preciobase=" + preciobase + ", nuevo=" + nuevo + '}';
    }
    
    public double Precio(int anios){
        double p;
        if(anios<15)
            p=preciobase*(99/100);
        else
            p=preciobase*(98/100);
        return p;
    }
    
    
    
}
