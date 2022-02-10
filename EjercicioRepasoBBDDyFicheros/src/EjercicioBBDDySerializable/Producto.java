
package EjercicioBBDDySerializable;

import java.io.Serializable;

public class Producto implements Serializable{
  private int codigo;
  private String nombre;
  private int precio;
  private int cantidad;

    public Producto(int codigo, String nombre, int precio, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void Compra(int cantidad){
      this.cantidad=this.cantidad+cantidad;
    } 

    public boolean Venta(int cantidad){
       boolean venta=true;
       if(cantidad<=this.cantidad) 
         this.cantidad=this.cantidad-cantidad;
       else{
         //  System.out.println("No hay suficiente stock");
           venta=false;
       }
       return venta;
    }
    @Override
    public String toString() {
    return "Productos{" + "codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + '}';
    }
  
}
