
package EjerciciosTeoria;

public class Piso extends Inmueble {     /* Clase Hija de Inmueble */
    
    private int altura;

    public Piso(int altura, String direccion, int mc, double preciobase, boolean nuevo) {
        super(direccion, mc, preciobase, nuevo);
        this.altura = altura;
    }

    public int getAltura() {
        return altura;
    }
    
    public double PrecioTotal(int anios){
        double precio=0;
        precio = Precio(anios);
        if(altura>=3)
            precio = precio*(103/100);
        return precio;
    }

    
    public String toString(int anios) {
        return super.toString()+ " Piso{" + "altura=" + altura + ". El precio final es: " +PrecioTotal(anios)+ '}' ;
    }

 
}
