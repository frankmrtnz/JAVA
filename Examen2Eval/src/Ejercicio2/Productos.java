
package Ejercicio2;

public abstract class Productos {
    
    private String nombre;
    int precio;

    public Productos(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    public void CalcularPrecio(int num_productos){
        this.precio = getPrecio()*num_productos;
    }

    @Override
    public String toString() {
        return "Productos{" + "nombre=" + nombre + ", precio=" + precio + '}';
    }
    
    
    
    
    
    
}
