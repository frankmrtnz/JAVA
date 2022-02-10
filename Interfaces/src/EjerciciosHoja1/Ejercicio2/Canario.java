
package EjerciciosHoja1.Ejercicio2;


public class Canario extends Ave{
    
    private boolean canta;

    public Canario(boolean canta, String sexo, int edad) {
        super(sexo, edad);
        this.canta = canta;
    }

    public boolean isCanta() {
        return canta;
    }
    
    
    
}
