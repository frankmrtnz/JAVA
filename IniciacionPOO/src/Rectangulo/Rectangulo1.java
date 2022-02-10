/* Usando -> ArrayList */

package Rectangulo;

public class Rectangulo1 {
    
    private int base,altura;
    
    Rectangulo1(int base, int altura){
        this.base=base;
        this.altura=altura;
    }
    
    public int CalcularArea(){
        /*int valor=0;
        valor=base*altura;
        return valor;*/
        return base*altura;
    }
    
    public int CalcularPerimetro(){
        return 2*base+2*altura;
    }
    
    public void Dibujar(){
        for (int i=1; i<=altura; i++) {
            for (int j=1; j<=base; j++){ 
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    @Override
    public String toString() {
        Dibujar();
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + ", area=" +CalcularArea()+", perimetro=" + CalcularPerimetro()+"}";
    }

    public void setBase(int base) {
        this.base = base;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }
    public int getAltura() {
        return altura;
    }
    
}
