
package EjerciciosTeoria.Cafetera;

public class Cafetera {
    
    int capacidadMaxima;
    int cantidadActual;
    
    Cafetera(){
        capacidadMaxima=1000;
        /*cantidadActual=0;*/       //No hace falta poner el =0, ya que por defecto coge valor 0
    }
    
    Cafetera(int capacidadMax){
        this.capacidadMaxima=capacidadMax;
        this.cantidadActual=capacidadMax;
    }
    
    Cafetera(int capacidadMax, int capacidadAct){
        this.capacidadMaxima=capacidadMax;
        if(capacidadAct>capacidadMax)
            this.cantidadActual=capacidadMax;
        else
            this.cantidadActual=capacidadAct;
    }
    
    void llenarCafetera(){
        this.cantidadActual=this.capacidadMaxima;
    }
    
    void servirTaza(int cantidad){
        if(cantidad<this.cantidadActual){
            System.out.println("Sirviendo una taza de "+cantidad+" cc");
            this.cantidadActual=this.cantidadActual-cantidad;
        } else {
            System.out.println("Sirviendo una taza de "+this.cantidadActual+" cc pues no hay suficiente café");
            this.cantidadActual=0;   // Equivalente a llamar vaciarCafetera();
        }                   
    }
    
    void vaciarCafetera(){
        this.cantidadActual=0;
    }
    
    void agregarCafe(int cantidad){
        if((this.cantidadActual+cantidad)>this.capacidadMaxima){ 
            System.out.println("Se sobrepasa la capacidad maxima de la cafetera");
            this.cantidadActual=this.capacidadMaxima;  // Equivalente a llamar al metodo llenarCafetera();
        }
        else{ 
            System.out.println("Se va a añadir a la cafetera "+cantidad+" cc");
            this.cantidadActual=this.cantidadActual+cantidad;
        }
    }
    
    void mostrarContenido(){
        System.out.println("La cantidad máxima es "+this.capacidadMaxima+" y la cantidad actual es "+this.cantidadActual);
    }
    
}
