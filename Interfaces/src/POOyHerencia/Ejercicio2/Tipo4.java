
package POOyHerencia.Ejercicio2;

public class Tipo4 extends Articulo {
    
    private final double IVA = 0.04;    // Final significa que el valor es constante

    public Tipo4(String nombre, double precio) {
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
