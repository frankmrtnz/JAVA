
package Solucion.Ejercicio2;

public class Perecedero extends Producto{
  private int dias;

    public Perecedero(int dias, String nombre, double precio) {
        super(nombre, precio);
        this.dias = dias;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    @Override
    public String toString() {
        return super.toString()+" Perecedero{" + "dias=" + dias + '}';
    }

   public double CalcularPrecio(int cantidad){
      double preciofinal=super.CalcularPrecio(cantidad);
      if(dias==1)
        preciofinal=preciofinal/4;
      else if(dias==2)
            preciofinal=preciofinal/3;
      else if(dias==3)
             preciofinal=preciofinal/2;
      return preciofinal;
   }
 }
