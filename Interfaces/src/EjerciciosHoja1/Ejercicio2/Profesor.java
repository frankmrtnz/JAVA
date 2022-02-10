
package EjerciciosHoja1.Ejercicio2;


public class Profesor extends Persona implements Hablador{
    
    private int despacho;
    private String email;

    public Profesor(int despacho, String email, String nombre, int edad) {
        super(nombre, edad);
        this.despacho = despacho;
        this.email = email;
    }
    
    
    @Override
    public void hablar() {
        System.out.println("Hola, soy un "+getClass().getSimpleName()+" y se hablar");
        System.out.println("Nombre: "+getNombre()+"   Edad: "+getEdad());
        System.out.println("Despacho: "+this.despacho+"   Email: "+this.email);
    }
    
    
}
