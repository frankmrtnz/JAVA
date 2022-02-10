
package POOyHerencia.Ejercicio2;

public class Tipo7 extends Articulo {
    
    private final double IVA = 0.07;    // Final significa que el valor es constante

    public Tipo7(String nombre, double precio) {
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
