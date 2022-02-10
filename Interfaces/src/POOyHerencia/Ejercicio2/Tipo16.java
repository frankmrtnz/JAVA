
package POOyHerencia.Ejercicio2;

public class Tipo16 extends Articulo {
    
    private final double IVA = 0.16;    // Final significa que el valor es constante

    public Tipo16(String nombre, double precio) {
        super(nombre, precio);
    }
    
    public double getParteIVA(){
        return super.getPrecio()*IVA;
    }
    
    @Override
    public double getPrecio() {
        return super.getPrecio()+getParteIVA();
    }
    
}
