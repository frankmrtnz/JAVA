
package Rectangulo2;

public class Punto {
    
    int x,y;
    
    // Si el punto() está vacio será el punto 0,0.
    Punto(){}
    
    Punto(int x, int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString() {
        return "Punto{" + "x=" + x + ", y=" + y + '}';
    }
    
    
    /* Hacer dos metodos que se llaman igual, pero uno de ellos recibe como parametro un solo punto
    pq hay */
    int CalcularDistancia(Punto p){
        
        return 0;
    }
    
    int CalcularDistancia(Punto p,Punto p1){
        
        return 0;
    }
    
    
}
