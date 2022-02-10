
package clasesabstractas;


public class Rectangulo extends FiguraGeometrica {

    public Rectangulo(int base, int altura) {
        super(base, altura);
    }

    @Override
    public int Area() {
        return getBase()*getAltura();
    }

    @Override
    public int Perimetro() {
        return (getBase()+getAltura())*2;
    }
    
    
    
}
