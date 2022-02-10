
package interfaces;

public class ClaseEnteros extends Numero {

    int num1, num2;

    ClaseEnteros(){
        super();
    }
    
    public void Escribir(){
        System.out.println(Suma()+". "+Resta()+". "+Producto()+". "+Division()+".");
    }
    
}
