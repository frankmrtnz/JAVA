
package EjerciciosTeoria;

public class Local extends Inmueble {   /* Clase Hija de Inmueble */
    
    private int nventanas;

    public Local(int nventanas, String direccion, int mc, double preciobase, boolean nuevo) {
        super(direccion, mc, preciobase, nuevo);
        this.nventanas = nventanas;
    }

    public int getNventanas() {
        return nventanas;
    }

    public void setNventanas(int nventanas) {
        this.nventanas = nventanas;
    }
    
    public double PrecioTotal(int anios){
        double precio=Precio(anios);
        if(getMc()>50)
            precio=precio*(101/100);
        if(nventanas<2)
            precio=precio*(98/100);
        else if(nventanas>4)
            precio=precio*(102/100);
        return precio;
    }

    
    public String toString(int anios) {
        return super.toString()+" Local{" + "nventanas=" + nventanas + ". El precio final es: " +PrecioTotal(anios)+ '}' ;
    }
    
    
    
    
}
