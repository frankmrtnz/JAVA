
package clasesabstractas;


public abstract class FiguraGeometrica {   /* Debemos poner el abstract también al ser una clase abstracta */
    
    private int base, altura;

    public FiguraGeometrica(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" + "base=" + base + ", altura=" + altura + '}';
    }
    
    public abstract int Area();   /* Método abstracto */
    
    public abstract int Perimetro();  /* Método abstracto */
    
    
}
