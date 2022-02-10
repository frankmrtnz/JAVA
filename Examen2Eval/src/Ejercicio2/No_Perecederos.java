
package Ejercicio2;


public class No_Perecederos extends Productos {
    
    private String tipo_producto;

    public No_Perecederos(String tipo_producto, String nombre, int precio) {
        super(nombre, precio);
        this.tipo_producto = tipo_producto;
    }

    public String getTipo_producto() {
        return tipo_producto;
    }

    public void setTipo_producto(String tipo_producto) {
        this.tipo_producto = tipo_producto;
    }
    
    @Override
    public void CalcularPrecio(int num_productos){
        if(getTipo_producto()=="limpieza")
            this.precio=(int)(getPrecio()-getPrecio()*0.10);
        if(getTipo_producto()=="conservas")
            this.precio=(int)(getPrecio()-getPrecio()*0.05);
    }

    @Override
    public String toString() {
        return "No_Perecederos{" + "tipo_producto=" + tipo_producto + '}';
    }
    
    
    
    
    
}
