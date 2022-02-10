
package Solucion.Ejercicio2;

public class NoPerecedero extends Producto {
   private String tipo;

    public NoPerecedero(String tipo, String nombre, double precio) {
        super(nombre, precio);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return super.toString()+" NoPerecedero{" + "tipo=" + tipo + '}';
    }
   
    public double CalcularPrecio(int cantidad){
        double preciofinal=super.CalcularPrecio(cantidad);
        if(tipo.equals("Limpieza"))
          preciofinal=preciofinal*0.9;
        else if(tipo.equals("Conservas"))
               preciofinal=preciofinal*0.95;
        return preciofinal;
   }
   
}
