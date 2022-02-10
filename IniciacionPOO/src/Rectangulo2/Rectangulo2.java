
package Rectangulo2;

public class Rectangulo2 {
    
    Punto v1,v2,v3,v4;       //  v por vertice
    int base,altura;
    
    Rectangulo2(Punto p1, Punto p2, Punto p3, Punto p4){
        this.v1=p1;
        this.v2=p2;
        this.v3=p3;
        this.v4=p4;
        base=p1.CalcularDistancia(p2);
        altura=p1.CalcularDistancia(p3);
    }

    @Override
    public String toString() {
        return "Rectangulo2{" + "v1=" + v1.toString() + ", v2=" + v2.toString() + ", v3=" + v3.toString() + ", v4=" + v4.toString() + '}';
    }
    
    public String Escribir() {
        return "v1=(" + v1.x + "," + v1.y +") v2=(" + v2.x +','+ v2.y +") v3=(" + v3.x + ',' + v3.y +") v4=(" + v4.x + ',' + v4.y +")";
    }
    
    
    
}
