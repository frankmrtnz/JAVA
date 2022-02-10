
package Ejercicio2;

public class Perecederos extends Productos{
    
    private int dias_caducidad;
    
    public Perecederos(int dias_caducidad, String nombre, int precio){
        super(nombre, precio);
        this.dias_caducidad=dias_caducidad;
    }

    public int getDias_caducidad() {
        return dias_caducidad;
    }

    public void setDias_caducidad(int dias_caducidad) {
        this.dias_caducidad = dias_caducidad;
    }
    
    @Override
    public void CalcularPrecio(int num_productos){
        if(getDias_caducidad()==1)
            this.precio=getPrecio()*num_productos/4;
        if(getDias_caducidad()==2)
            this.precio=getPrecio()*num_productos/3;
        if(getDias_caducidad()==3)
            this.precio=getPrecio()*num_productos/2;
    }

    @Override
    public String toString() {
        return "Perecederos{" + "dias_caducidad=" + dias_caducidad + '}';
    }
    
    
    
    
}
