
package Ejercicios2_BBDD.Ej2_Almacen;


public class Producto {
   private String CodP;
   private String Nombre;
   private String LineaP;
   private int Precio;
   private int Stock;

    public Producto(String CodP, String Nombre, String LineaP, int Precio, int Stock) {
        this.CodP = CodP;
        this.Nombre = Nombre;
        this.LineaP = LineaP;
        this.Precio = Precio;
        this.Stock = Stock;
    }

    public String getCodP() {
        return CodP;
    }

    public void setCodP(String CodP) {
        this.CodP = CodP;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getLineaP() {
        return LineaP;
    }

    public void setLineaP(String LineaP) {
        this.LineaP = LineaP;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    @Override
    public String toString() {
        return "Productos{" + "CodP=" + CodP + ", Nombre=" + Nombre + ", LineaP=" + LineaP + ", Precio=" + Precio + ", Stock=" + Stock + '}';
    }
   
}
