
package clasesabstractas;


public class Triangulo extends FiguraGeometrica {

    public Triangulo(int base, int altura) {
        super(base, altura);
    }

    @Override
    public int Area() {
        return getBase()*getAltura()/2;
    }

    @Override
    public int Perimetro() {
        return getBase()*3;
    }
   
    
    
}
